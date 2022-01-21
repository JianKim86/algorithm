public class MaximumSubarray {
    public void run() {
        //Given an integer array nums,
        //find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
        //A subarray is a contiguous part of an array.
        System.out.println(solution(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})); //6
    }

    private int solution(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int max = nums[0], sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
