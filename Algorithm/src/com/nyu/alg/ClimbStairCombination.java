package com.nyu.alg;

import java.util.ArrayList;
import java.util.List;

public class ClimbStairCombination {
	static ArrayList<List<Integer>> list=new ArrayList<List<Integer>>();
	public static void main(String[] args) {
		ClimbStairCombination sc=new ClimbStairCombination();
		int target=5;
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=1;i<=3;i++){
			sc.cal(i,i,target,l);
		}
		
		System.out.println("size:"+list.size());
		for(List<Integer> ll:list){
			
			for(Integer number:ll){
				
				System.out.print(number+",");
			}
			System.out.println("");
			
		}
	}
	public void cal(int i,int total,int target,ArrayList<Integer> l){
		
		
		ArrayList<Integer> newList=new ArrayList<Integer>();
		newList.addAll(l);
		newList.add(i);
		if(total==target){
			list.add(newList);
			return;
		}
		if(total<target){
				cal(1,total+1,target,newList);
				cal(2,total+2,target,newList);
				cal(3,total+3,target,newList);
		}else{
			return;
		}
	}
}
