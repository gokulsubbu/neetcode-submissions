class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=board.length;
        int m=board[0].length;

        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(board[i][j]!='.'){
                //rowFill
                String row=board[i][j]+"row"+i;
                map.put(row,map.getOrDefault(row,0)+1);
                //colFill
                String col=board[i][j]+"col"+j;
                 map.put(col,map.getOrDefault(col,0)+1);
                //diagonal
                String box=board[i][j]+"box"+(i/3)+"and"+(j/3);
                 map.put(box,map.getOrDefault(box,0)+1);
                }
            }
        }

        for(Map.Entry<String,Integer> mapp:map.entrySet()){
            if(mapp.getValue()>1){
                return false;
            }
        }
      return true;
    }
}