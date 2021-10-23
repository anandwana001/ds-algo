package array;

public class ReshapeTheMatrix {

    public static void main(String[] args) {
        int mat[][] = {{ 1, 2}, {3, 4 }};
        int[][] reshapedMatrix1 = matrixReshape(mat, 1, 4);
        int[][] reshapedMatrix2 = matrixReshape(mat, 4, 1);
        print2D(reshapedMatrix1);
        print2D(reshapedMatrix2);
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        int r1 = mat.length;
        int c1 = mat[0].length;

        if (r1 * c1 != r * c) return mat;

        int[][] result = new int[r][c];

        int x = 0;
        int y = 0;

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                if(y == c) {
                    y=0;
                    x++;
                }
                result[x][y] = mat[i][j];
                y++;
            }
        }

        return result;

    }

    public static void print2D(int mat[][]) {
        // Loop through all rows
        for (int i = 0; i < mat.length; i++)

            // Loop through all elements of current row
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + " ");
    }

    public static void print1D(int mat[]) {
        for (int i = 0; i < mat.length; i++)
                System.out.print(mat[i] + " ");
    }
}
