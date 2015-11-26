//#34 Search for a Range
public class SearchforaRange {
    public int[] searchRange(int[] nums, int target) {
        
        
        int[] result=new int[2];
        
        if(nums==null||nums.length==0){
            result[0]=-1;
            result[1]=-1;
        }
        
        // result[0]=search(nums,target,0,nums.length-1,true);
        // result[1]=search(nums,target,0,nums.length-1,false);
        result[0]=searchLeft(nums,target,0,nums.length-1);
        result[1]=searchRight(nums,target,0,nums.length-1);
        return result;
        
    }
    
    public int search(int[] nums,int target,int l,int r,boolean down){
        if(l>r)
            return -1;
            
            
        int mid=(l+r)/2;
        
        int result=-1;
        if(nums[mid]==target){
                
            if(down)
                if(mid-1<0||nums[mid-1]!=target)
                    return mid;
                else
                    result=search(nums,target,l,mid-1,down);
            else
                if(mid+1>=nums.length||nums[mid+1]!=target)
                    return mid;
                else
                    result=search(nums,target,mid+1,r,down);
        }else{
            if(nums[mid]>target)
                result=search(nums,target,l,mid-1,down);
            else
                result=search(nums,target,mid+1,r,down);
        }
        return result;
    }
    public int searchLeft(int[] nums,int target,int l,int r){
        if(l>r)
            return -1;
        int mid=(l+r)/2;
        
        int result=-1;
        if(nums[mid]==target){
            if(mid-1<0||nums[mid-1]!=target)
                return mid;
            else
                result=searchLeft(nums,target,l,mid-1);
        }else{
            if(nums[mid]>target)
                result=searchLeft(nums,target,l,mid-1);
            else
                result=searchLeft(nums,target,mid+1,r);
        }
        return result;
    }
    public int searchRight(int[] nums,int target,int l,int r){
        if(l>r)
            return -1;
        int mid=(l+r)/2;
        
        int result=-1;
        if(nums[mid]==target){
            if(mid+1>=nums.length||nums[mid+1]!=target)
                return mid;
            else
                result=searchRight(nums,target,mid+1,r);
        }else{
            if(nums[mid]>target)
                result=searchRight(nums,target,l,mid-1);
            else
                result=searchRight(nums,target,mid+1,r);
        }
        return result;
    }
}