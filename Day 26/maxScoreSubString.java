class Solution {
    public int maxScore(String s) {
        int ocnt=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int e=s.charAt(i)-'0';
            if(e==1){
                ocnt+=1;
            }
        }
        int zcnt=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            int e=s.charAt(i)-'0';
            if(e!=1){
                zcnt+=1;
                max=Math.max(max,zcnt+ocnt);
            }
            else{
                ocnt-=1;
                max=Math.max(max,zcnt+ocnt);
            }
        }
        return max;
    }
}
