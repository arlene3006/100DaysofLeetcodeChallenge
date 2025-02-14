class ProductOfNumbers {
    Stack<Integer> st;
    int pro;
    public ProductOfNumbers() {
        st=new Stack<>();
        pro=1;
    }
    
    public void add(int num) {
        if(num==0){
            st.clear();
            pro=1;
        }
        else{
            pro*=num;
            st.push(pro);
        }
    }
    
    public int getProduct(int k) {
        int n=st.size();
        if(k>n) return 0;
        if(k==n) return st.peek();
        int last=st.peek();
        int prev=st.get(n-1-k);
        return last/prev;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
