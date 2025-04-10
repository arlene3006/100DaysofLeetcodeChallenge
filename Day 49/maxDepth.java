class Solution {
    public int maxDepth(String s) {
        //Stack<Integer> s=new Stack<>();
        int n=s.length();
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                count++;
            }
            else if(ch==')'){
                max=Math.max(max,count);
                count--;
            }
        }
        if(max==Integer.MIN_VALUE) return 0;
        return max;
    }
}
