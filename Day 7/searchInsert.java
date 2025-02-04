class Solution {
    public int searchInsert(int[] nums, int target) {
        int len=nums.length;
        int left=0;
        int right=len-1;
        int ind=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]>=target){
                ind=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        if(ind==-1) return len;
        return ind;
        
    }
}

