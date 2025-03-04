class Pair{
    int height;
    String name;
    Pair(int height,String name){
        this.height=height;
        this.name=name;
    }
}

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
        String[] strarr=new String[n];
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b) -> b.height-a.height);
        for(int i=0;i<n;i++){
            pq.offer(new Pair(heights[i],names[i]));
        }
        int i=0;
        while(!pq.isEmpty()){
            strarr[i]=pq.poll().name;
            i++;
        }
        return strarr;
    }
}
