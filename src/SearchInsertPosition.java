import java.util.Arrays;

public class SearchInsertPosition {
    public void run() {
        //Given a sorted array of distinct integers and a target value, return the index if the target is found.
        //If not, return the index where it would be if it were inserted in order.

        System.out.println(solution(new int[]{1, 3, 5}, 5));
    }

    private int solution(int[] nums, int target) {
        int i = Arrays.binarySearch(nums, target);
        if (i < 0) {
            return -i - 1;
        }
        return i;
    }
}
