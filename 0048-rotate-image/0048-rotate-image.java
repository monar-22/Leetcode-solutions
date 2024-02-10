class Solution {
    public void rotate(int[][] matrix) {
        int rowlen=matrix.length;
        int collen=matrix[0].length;
        int temp=0;
        // int len=rowlen*collen;
        
        
        for(int i=0;i<rowlen;i++){
            for(int j=i+1;j<collen;j++){
                
                // if(i !=j){
                    temp=matrix[i][j];
                    matrix[i][j]= matrix[j][i];
                    matrix[j][i]=temp;
        
                // }
            }
        }
        
        for(int i=0;i<rowlen;i++){
            for(int j=0;j<collen/2;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][rowlen-1-j];
                matrix[i][rowlen-1-j]=temp;
            }
        }
    }
}