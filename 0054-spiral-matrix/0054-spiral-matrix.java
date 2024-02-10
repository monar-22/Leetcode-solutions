import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        
        int rowlen = matrix.length;
        int collen = matrix[0].length;
        
        if (rowlen == 0 || collen == 0) {
            return res;
        }
        
        int minr = 0;
        int maxr = rowlen - 1;
        int minc = 0;
        int maxc = collen - 1;
        
        int total = rowlen * collen;
        int ctr = 0;
        
        while (ctr < total) {
            for (int j = minc, i = minr; j <= maxc && ctr < total; j++) {
                res.add(matrix[i][j]);
                ctr++;
            }
            minr++;
            
            for (int i = minr, j = maxc; i <= maxr && ctr < total; i++) {
                res.add(matrix[i][j]);
                ctr++;
            }
            maxc--;
            
            for (int j = maxc, i = maxr; j >= minc && ctr < total; j--) {
                res.add(matrix[i][j]);
                ctr++;
            }
            maxr--;
            
            for (int i = maxr, j = minc; i >= minr && ctr < total; i--) {
                res.add(matrix[i][j]);
                ctr++;
            }
            minc++;
        }

        return res;
    }
}
