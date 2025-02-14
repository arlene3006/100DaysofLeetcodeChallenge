class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int ind=n-1;
        int max=nums[n-1];
        for(int i=n-2;i>=0;i--){
            if(nums[i]>max){
                max=nums[i];
                ind=i;
            }
            else{
                break;
            }
        }
        return ind;
        
    }
}
