class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)
            return false;
        int len =matrix.length;
        int rowl=matrix[0].length;
        
        int l=0;
        int h=(len*rowl)-1;
        
        while(l<=h){
            int mid = l+((h-l)/2);
            if(target == matrix[mid/rowl][mid%rowl]){
                return true;
            }
            if(target < matrix[mid/rowl][mid%rowl]){
                h= mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
}