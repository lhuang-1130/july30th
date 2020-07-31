import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        //check if the array has no element
        if(nums == null || nums.length == 0) {
            return null;
        }

        //import hashMap class
        HashMap<Integer, Integer> indices = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int leftOver = target - nums[i];
            //check if hashmap contains the key for leftover
            if (indices.containsKey(leftOver)) {
                //return the array of the solutions if found
                return new int[]{i, indices.get(leftOver)};
            } else {
                //put current index to map, will eventually be matched to a solution
                indices.put(nums[i], i);
            }
        }
        //can't find solutions
        return null;
    }
    }

