class Solution {
    public int orangesRotting(int[][] grid) {
       int r=grid.length;
       int c=grid[0].length;
       if(grid==null || grid.length==0) return 0;
       Queue<int[]> q=new LinkedList<>();
       int fruit=0;
       for(int row=0;row<r;row++){
        for(int col=0;col<c;col++){
            if(grid[row][col]==2){
                q.add(new int[]{row,col});
                
            }
            if(grid[row][col]!=0){
                fruit++;
            }
        }
       }
       if(fruit==0) return 0;
       int[] drow={-1,0,1,0};
       int[] dcol={0,1,0,-1};
       int cnt=0,mincnt=0;
       while(!q.isEmpty()){
            int size=q.size();
            cnt+=size;
            for(int i=0;i<size;i++){
                int[] point=q.poll();

                for(int adj=0;adj<4;adj++){
                    int x=point[0]+drow[adj];
                    int y=point[1]+dcol[adj];
                    if(x<0 || y<0 || x>=r || y>=c || grid[x][y]==0 || grid[x][y]==2){
                        continue;
                    }
                    
                    grid[x][y]=2;
                    q.add(new int[]{x,y});
                    
                }
            }
            if(q.size()!=0) mincnt++;
       }
       
       return (cnt==fruit)? mincnt:-1;

    }

}
