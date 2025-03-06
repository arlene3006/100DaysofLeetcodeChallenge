class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i=0,j=0;
        int[][] grid=new int[n][n];
        int ctr=0;
        for(int m=0;m<n;m++){
            for(int l=0;l<n;l++){
                grid[m][l]=ctr++;
            }
        }
        int n1=commands.size();
        for(int k=0;k<n1;k++){
            String str=commands.get(k);
            if(str.equals("RIGHT")){
                j+=1;
            }
            else if(str.equals("LEFT")){
                j-=1;
            }
            else if(str.equals("UP")){
                i-=1;
            }
            else if(str.equals("DOWN")){
                i+=1;
            }
        }
        return grid[i][j];
    }
}
