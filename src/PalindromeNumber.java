public class PalindromeNumber {
    public void run() {
        //Given an integer x, return true if x is palindrome integer.
        //An integer is a palindrome when it reads the same backward as forward.
        System.out.println(solution(22)); //true
        System.out.println(solution(2342)); //false
        System.out.println(solution(2112)); //true
    }

    private boolean solution(int x) {
        if (x < 0) {
            return false;
        }

        int reversed = 0, original = x, remainder = x;
        while (x > 0) {
            remainder = x % 10;
            reversed = reversed * 10 + remainder;
            x /= 10;
        }
        return original == reversed;
    }
}
