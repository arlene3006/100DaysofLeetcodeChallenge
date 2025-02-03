class Solution {
    public int maxArea(int[] a) {
        int n=a.length;
        int left=0,right=n-1;
        int max=0;
        while(left!=right){
            if(a[left]<=a[right]){
                max=Math.max(max,a[left]*(right-left));
                left++;
            }
            else{
                max=Math.max(max,a[right]*(right-left));
                right--;
            }
        }
        return max;
    }

}

