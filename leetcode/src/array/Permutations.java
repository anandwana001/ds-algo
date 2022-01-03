package array;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        int[] ar = {1,2,3};
        permute(ar);
    }

    /**
     * i - 0 tempList - [1]
     * i - 1 tempList - [1, 2]
     * i - 2 tempList - [1, 2, 3]
     *  list [[1, 2, 3]]
     * i - 2 tempList - [1, 2]
     * i - 1 tempList - [1]
     * i - 2 tempList - [1, 3]
     * i - 1 tempList - [1, 3, 2]
     *  list [[1, 2, 3], [1, 3, 2]]
     * i - 1 tempList - [1, 3]
     * i - 2 tempList - [1]
     * i - 0 tempList - []
     * i - 1 tempList - [2]
     * i - 0 tempList - [2, 1]
     * i - 2 tempList - [2, 1, 3]
     *  list [[1, 2, 3], [1, 3, 2], [2, 1, 3]]
     * i - 2 tempList - [2, 1]
     * i - 0 tempList - [2]
     * i - 2 tempList - [2, 3]
     * i - 0 tempList - [2, 3, 1]
     *  list [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1]]
     * i - 0 tempList - [2, 3]
     * i - 2 tempList - [2]
     * i - 1 tempList - []
     * i - 2 tempList - [3]
     * i - 0 tempList - [3, 1]
     * i - 1 tempList - [3, 1, 2]
     *  list [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2]]
     * i - 1 tempList - [3, 1]
     * i - 0 tempList - [3]
     * i - 1 tempList - [3, 2]
     * i - 0 tempList - [3, 2, 1]
     *  list [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
     * i - 0 tempList - [3, 2]
     * i - 1 tempList - [3]
     * i - 2 tempList - []
     *
     */

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
        } else{
            for(int i = 0; i < nums.length; i++){
                if(tempList.contains(nums[i])) continue;
                tempList.add(nums[i]);
                backtrack(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
