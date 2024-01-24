package Problems.MathNGeometry;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int l = 0;
        int r = matrix.length - 1;

        while(r>l){
            int top = l;
            int bottom = r;

            for(int i=0; i< r-l ; i++){

                int tmp = matrix[top+i][r] ;

                matrix[top+i][r] = matrix[top][l+i];

                matrix[top][l+i] = matrix[bottom-i][l];

                matrix[bottom-i][l] = matrix[bottom][r-i];

                matrix[bottom][r-i] = tmp;
            }
            l++;
            r--;
        }
    }
}
