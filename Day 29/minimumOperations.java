class Solution {
    private void alter(int[] nums,int x){
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[i]-=x;
            }
        }
    }
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int cnt=0;
        int x=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                x=nums[i];
                cnt++;
                alter(nums,x);
            }
        }
        return cnt;
    }
}
