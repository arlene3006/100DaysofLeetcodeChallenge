class Solution {
    public String finalString(String s) {
        StringBuilder sb=new StringBuilder(s);
        for(int k=0;k<sb.length();k++){
            if(sb.charAt(k)=='i'){
                int i=0;
                int j=k-1;
                while(i<j){
                    char t=sb.charAt(j);
                    sb.setCharAt(j,sb.charAt(i));
                    sb.setCharAt(i,t);
                    i++;
                    j--;
                }
                sb.delete(k,k+1);
                k--;
            }
        }
        return sb.toString();
    }
}
