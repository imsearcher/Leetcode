//#33 Search in Rotated Sorted Array
public class SearchRotatedSortedArr {
    //need to be improved to logn
    public int search(int[] nums, int target) {
        if(nums==null||nums.length==0)
            return -1;
        if(nums.length==1)
            if(nums[0]==target)
                return 0;
            else
                return -1;
        int p=nums[0];
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max)
            {
                max=nums[i];
                index=i;
            }
        }
        
        int result=-1;
        if(target>=p&&target<=max){
            result=bSearch(nums,0,index,target);
        }else{
            result=bSearch(nums,index+1,nums.length-1,target);
        }
        return result;
    }
    public int bSearch(int[] nums,int l,int r,int target){
        if(l>=r){
            if(nums[r]==target)
                return r;
            else
                return -1;
        }
        int mid=(l+r)/2;
        if(nums[mid]==target)
            return mid;
        if(nums[mid]>target)
            return bSearch(nums,l,mid-1,target);
        else
            return bSearch(nums,mid+1,r,target);
        
        
    }
}