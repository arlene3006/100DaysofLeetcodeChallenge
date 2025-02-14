class Solution {
    public int minFlips(int a, int b, int c) {
        int flips=0;
        while(a>0 || b>0 || c>0){
            int a_bit=a&1;
            int b_bit=b&1;
            int c_bit=c&1;
            if(c_bit==0){
                flips+=(a_bit+b_bit);
            }
            else if(a_bit==0 && b_bit==0){
                flips+=1;
            }
            a=a>>1;
            b=b>>1;
            c=c>>1;
        }
        return flips;
    }
}
