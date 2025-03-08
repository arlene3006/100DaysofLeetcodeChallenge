class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        return steps(n,dp);
    }
    public int steps(int n,int[] dp){
        if(n==0 || n==1) return 1;
        if(dp[n]!=0) return dp[n];
        dp[n]=steps(n-1,dp)+steps(n-2,dp);
        return dp[n];
    }
}
