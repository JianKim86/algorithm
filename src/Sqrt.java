public class Sqrt {
    public void run() {
        //Given a non-negative integer x, compute and return the square root of x.
        //Since the return type is an integer, the decimal digits are truncated,
        //and only the integer part of the result is returned.
        //Note: You are not allowed to use any built-in exponent function or operator,
        //such as pow(x, 0.5) or x ** 0.5.
        System.out.println(solution(4)); //2
    }

    private int solution(int x) {
        if (x <= 0) {
            return x;
        }

        int left = 1, right = x;
        while (left < right) {
            ;
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left - 1;
    }
}
