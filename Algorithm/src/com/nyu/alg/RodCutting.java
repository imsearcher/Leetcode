package com.nyu.alg;

public class RodCutting {

	public static void main(String[] args) {
		int[] p={1,5,8,9,10,17,17,20,24,25};
		//-1 means that the lengths of pieces are forbidden
		int[] p2={1,-1,-1,-1,10,17,17,20,24,25};
		int n=10;
		RodCutting rod=new RodCutting();
		System.out.println("max:"+rod.getProfit(p, n));
		System.out.println("max:"+rod.getProfitLimited(p2, n));
	}
	public int getProfit(int[] p,int n){
		
		int[] result=new int[n+1];
		int max=Integer.MIN_VALUE;
		result[0]=0;
		for(int i=1;i<n+1;i++){
			max=Integer.MIN_VALUE;
			for(int j=0;j<i;j++){
				max=Math.max(max, p[j]+result[i-j-1]);
			}
			result[i]=max;
		}
		return result[n];
	}
	public int getProfitLimited(int[] p,int n){
		
		int[] result=new int[n+1];
		int max=Integer.MIN_VALUE;
		result[0]=0;
		for(int i=1;i<n+1;i++){
			max=Integer.MIN_VALUE;
			for(int j=0;j<i;j++){
				if(p[j]==-1||result[i-j-1]==-1)
					continue;
				max=Math.max(max, p[j]+result[i-j-1]);
			}
			result[i]=max;
		}
		return result[n];
	}
}
