class Solution {
    public int numWaterBottles(int bootle, int exchange) {
       int cnt=bootle;
       int empty=bootle;
    
       while(empty>=exchange){
        int newbootle=empty/exchange;
        cnt+=newbootle;
        empty=(empty%exchange)+newbootle;
       }
       return cnt;
    }
}
