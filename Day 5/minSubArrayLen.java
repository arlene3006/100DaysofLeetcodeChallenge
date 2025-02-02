class Solution {
    public int minSubArrayLen(int target, int[] a) {
        int min=Integer.MAX_VALUE;
        int i=0;
        int sum=0;
        for(int j=0;j<a.length;j++){
            sum+=a[j];
            while(sum>=target){
                min=Math.min(min,j-i+1);
                sum-=a[i];
                i++;
            }
        }
        if(min==Integer.MAX_VALUE) return 0;
        return min;
    }
}
