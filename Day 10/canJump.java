class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        if(n==1 && nums[0]!=0) return true;
        int max=0;
        for(int ctr=0;ctr<n-1;ctr++){
            if(max>=ctr){
                max=Math.max(max,nums[ctr]+ctr);
            }
        }
        if(max>=n-1){
            return true;
        }
        return false;
    }
}
