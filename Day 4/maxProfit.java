class Solution {
    public int maxProfit(int[] p) {
        int n=p.length;
        int min=p[0],profit=0;
        for(int i=1;i<n;i++){
            int cost=p[i]-min;
            profit=Math.max(cost,profit);
            min=Math.min(min,p[i]);
        }
        return profit;
    }
}
