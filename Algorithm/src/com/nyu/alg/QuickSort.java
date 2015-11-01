package com.nyu.alg;

import java.util.Arrays;

public class QuickSort {

	public int[] quickSort(int[] nums,int l,int r){
		if(l>=r)
			return nums;
		int p=nums[l];
		int index=r;
		for(int i =r;i>l;i--){
			if(nums[i]<p){
				int tmp=nums[index];
				nums[index]=nums[i];
				nums[i]=tmp;
				index--;
			}
		}
		int tmp=nums[l];
		nums[l]=nums[index];
		nums[index]=tmp;
		
		quickSort(nums, l, index-1);
		quickSort(nums, index+1, r);
		
		return nums;
	}
	public int quickSelect(int[] nums,int l,int r,int k){
		int p=nums[l];
		int index=r;
		//move the smaller items to the end of array
		for(int i =r;i>l;i--){
			if(nums[i]<p){
				int tmp=nums[index];
				nums[index]=nums[i];
				nums[i]=tmp;
				index--;
			}
		}
		int tmp=nums[l];
		nums[l]=nums[index];
		nums[index]=tmp;
		//k!=index
		if(index==k-1)
			return nums[index];
		if(index>k-1)
			return quickSelect(nums, l, index-1,k);
		else
			return quickSelect(nums, index+1, r,k);
	}
	
	public static void main(String[] args) {
		QuickSort q=new QuickSort();
		int[] nums={0,4,3,2,1};
		int[] quickSort = q.quickSort(nums, 0, nums.length-1);
		System.out.println(Arrays.toString(quickSort));
		int[] numsQselect={0,4,1,2,3};
		int kth = q.quickSelect(numsQselect, 0, nums.length-1,1);
		System.out.println(Arrays.toString(numsQselect));
		System.out.print("kth large:"+kth);

	}

}
