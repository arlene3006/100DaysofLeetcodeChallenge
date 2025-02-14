class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int[] a=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                a[k]=nums[i];
                k++;
            }
        }
        for(int j=0;j<k;j++){
            nums[j]=a[j];
        }
        return k;
    }
}
