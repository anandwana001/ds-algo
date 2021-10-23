package array;

public class Search2DMatrix {

    public static void main(String[] args) {
        int mat[][] = {{ 1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        System.out.println(searchMatrix(mat, 10));
        System.out.println(searchMatrixOptimise(mat, 10));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        // brute for to iterate over whole matrix and found the target

        // as given the row is sorted we can try binary search
        for (int i=0; i<matrix.length; i++){

            int low = 0;
            int high = matrix[i].length-1;

            if(matrix[i][low] <= target && matrix[i][high] >= target) {
                while(low <= high) {
                    int mid = (low + high)/2;

                    if(matrix[i][mid] == target) {
                        return true;
                    } else if(matrix[i][mid] < target) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }

        }
        return false;
    }

    public static boolean searchMatrixOptimise(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int low = 0;
        int high = row * col - 1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (matrix[mid / col][mid % col] == target) {
                return true;
            }
            if (matrix[mid / col][mid % col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
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
