package array;

public class runningSum {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] ansArr1 = runningSum(arr1);
        for(int i=0;i<ansArr1.length;i++)
            System.out.print(ansArr1[i]);

    }

    public static int[] runningSum(int[] nums) {
        for (int i=1;i<nums.length;i++){
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }
}
