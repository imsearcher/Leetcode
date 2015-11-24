package com.nyu.alg;

public class RodCutting {

	public static void main(String[] args) {
		int[] p={1,5,8,9,10,17,17,20,20};
		int n=8;
		RodCutting rod=new RodCutting();
		System.out.println("max:"+rod.getProfit(p, n));
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

}
