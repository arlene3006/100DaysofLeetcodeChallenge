class Solution {
    public int romanToInt(String s) {
        int n=s.length();
        Map<Character,Integer> m=new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        int res=0;
        if(n==1) return m.get(s.charAt(0));
        for(int i=0;i<n-1;){
           if(m.get(s.charAt(i))-m.get(s.charAt(i+1))>=0){
                res+=m.get(s.charAt(i));
                if(i==n-2){
                    res+=m.get(s.charAt(i+1));
                }
                i++;
            }
            else{
                res+=m.get(s.charAt(i+1))-m.get(s.charAt(i));
                if(i==n-3){
                    res+=m.get(s.charAt(n-1));
                }
                i+=2;
            }
        }
        return res;
    }
}
