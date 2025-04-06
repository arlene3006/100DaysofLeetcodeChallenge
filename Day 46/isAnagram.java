class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] arr=new int[256];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
            arr[t.charAt(i)]--;
        }
        for(int j=0;j<256;j++){
            if(arr[j]!=0){
                return false;
            }
        }
        return true;
    }
}
