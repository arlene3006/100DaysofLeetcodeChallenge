class Solution {
    public String restoreString(String s, int[] indices) {
        Map<Integer,Character> m=new HashMap<>();
        for(int i=0;i<indices.length;i++){
            m.put(indices[i],s.charAt(i));
        }
        String str="";
        for(int i=0;i<indices.length;i++){
            str=str+m.get(i);
        }
        return str;
    }
}
