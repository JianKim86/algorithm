import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public void run() {
        // Given an array of integers nums and an integer target,
        // return indices of the two numbers such that they add up to target.
        // You may assume that each input would have exactly one solution,
        // and you may not use the same element twice.
        // You can return the answer in any order.

        int[] test = solution(new int[]{2, 7, 11, 15}, 9);
        System.out.println(test); //[0,1]

        int[] test2 = solution2(new int[]{3, 2, 4}, 6);
        System.out.println(test2); //[1,2]
    }


    private int[] solution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    private int[] solution2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int number = target - nums[i];
            if (map.containsKey(number)) {
                return new int[]{map.get(number), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

}


