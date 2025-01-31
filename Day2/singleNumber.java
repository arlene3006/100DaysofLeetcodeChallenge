class Solution {
    public int singleNumber(int[] a) {
        int xor=0;
        for(int i=0;i<a.length;i++){
            xor=xor^a[i];
        }
        return xor;
    }
}
