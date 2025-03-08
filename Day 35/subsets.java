class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        subseq(0,arr,nums,res);
        return res;
    }
    private void subseq(int ind, List<Integer> arr,int[] nums, List<List<Integer>> res){
        int n=nums.length;
        if(ind>=n){
            res.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[ind]);
        subseq(ind+1,arr,nums,res);
        arr.remove(Integer.valueOf(nums[ind])); 
        subseq(ind+1,arr,nums,res);
    }
}
