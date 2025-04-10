class Pair{
    int n;
    char c;
    Pair(int n,char c){
        this.n=n;
        this.c=c;
    }
    public char getChar(){
        return c;
    }
    public int getFreq(){
        return n;
    }
}
class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->(b.n-a.n));
        for(int i=0;i<n;i++){
            pq.add(new Pair(m.get(s.charAt(i)),s.charAt(i)));
        }
        String res="";
        Set<Character> set=new HashSet<>();
        while(!pq.isEmpty()){
           char ch= pq.peek().getChar();
           int nn=pq.poll().getFreq();
           if(!set.contains(ch)){
             set.add(ch);
             for(int i=0;i<nn;i++){
                res=res+ch;
             }
           }
        }
        return res;
    }
}
