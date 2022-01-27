package week2;

public class PlusOne {
    public void run() {
        //You are given a large integer represented as an integer array digits,
        //where each digits[i] is the ith digit of the integer.
        //The digits are ordered from most significant to least significant in left-to-right order.
        //The large integer does not contain any leading 0's.
        //Increment the large integer by one and return the resulting array of digits.

        solution(new int[]{1, 2});
    }

    private int[] solution(int[] nums) {
        if (nums[nums.length - 1] < 9) {
            nums[nums.length - 1]++;
            return nums;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i]++;
                break;
            }
            nums[i] = 0;
        }

        if (nums[0] == 0) {
            int[] newNums = new int[nums.length + 1];
            newNums[0] = 1;
            System.arraycopy(nums, 0, newNums, 1, nums.length);
            return newNums;
        }

        return nums;
    }
}
