class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder(s);
        while(sb.toString().contains(part)){
            int ind=sb.indexOf(part);
            sb.delete(ind,ind+part.length());
        }
        return sb.toString();
    }
}
