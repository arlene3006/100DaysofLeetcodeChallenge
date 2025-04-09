class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String str=strs[0];
        if(str.length()==0) return "";
        int e1=0;
        int e=Integer.MAX_VALUE;
        for(int i=1;i<strs.length;i++){
            String p=strs[i];
            int end=-1;
            for(int j=0;j<p.length();j++){
                if(j<str.length() && str.charAt(j)==p.charAt(j)){
                    end=j;
                }
                else{
                    break;
                }
            }
            if(end==-1) return "";
            e=Math.min(e,end);
        }
        if(e==Integer.MAX_VALUE){
            return str.substring(0,e1+1);
        }
        return str.substring(0,e+1);
    }

}
