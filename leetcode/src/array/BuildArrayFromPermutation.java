package array;

public class BuildArrayFromPermutation {

    public static void main(String[] args) {
        int mat1[] = {0,2,1,5,3,4};
        int mat2[] = {5,0,1,2,3,4};
        int[] reshapedMatrix1 = buildArray(mat1);
        int[] reshapedMatrix2 = buildArray(mat2);
        print1D(reshapedMatrix1);
        System.out.println();
        print1D(reshapedMatrix2);
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        int i=0;
        while(i<nums.length) {
            ans[i] = nums[nums[i]];
            i++;
        }

        return ans;
    }

    public static void print1D(int mat[]) {
        for (int i = 0; i < mat.length; i++)
            System.out.print(mat[i] + " ");
    }
}
