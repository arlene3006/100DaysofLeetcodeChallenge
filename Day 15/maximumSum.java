class Solution {
    public int digit(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        int max=-1;
        Map<Integer,Integer> m=new HashMap<>();
        for(int num:nums){
            int sumDigits=digit(num);
            if(m.containsKey(sumDigits)){
                max=Math.max(num+m.get(sumDigits),max);
                m.put(sumDigits,Math.max(num,m.get(sumDigits)));
            }
            else{
                m.put(sumDigits,num);
            }
        }
        return max;
    }
}
