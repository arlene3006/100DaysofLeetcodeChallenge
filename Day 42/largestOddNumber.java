class Solution {
    public String largestOddNumber(String num) {
        String str="";
        int len=num.length();
        for(int i=len-1;i>=0;i--){
            int n=num.charAt(i)-'0';
            if(n%2!=0){
                for(int j=0;j<=i;j++){
                    str+=num.charAt(j);
                }
                break;
            }

        }
        return str;
    }
}
