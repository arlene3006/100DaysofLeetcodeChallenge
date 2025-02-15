class Solution {
    public int count(int[] a,int k){
        int l=0,r=0;
        if(k<0) return 0;
        int sum=0,cnt=0;
        while(r<a.length){
            
            if(a[r]%2==0){
                a[r]=0;
            }
            else{
                a[r]=1;
            }
            sum=sum+a[r];
            while(sum>k){
                sum=sum-a[l];
                l++;
            }
                cnt=cnt+(r-l+1);
                r++;
            
        }
        return cnt;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return count(nums,k)-count(nums,k-1);
    }
}
