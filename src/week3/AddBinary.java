package week3;

public class AddBinary {
    public void run() {
        //Given two binary strings a and b, return their sum as a binary string.
        System.out.println(solution("11", "1"));
    }

    private String solution(String a, String b) {
        StringBuffer sum = new StringBuffer();
        int carry = 0, indexA = a.length() - 1, indexB = b.length() - 1;
        while (indexA >= 0 || indexB >= 0 || carry == 1) {
            int i = indexA < 0 ? 0 : a.charAt(indexA--) - '0';
            int j = indexB < 0 ? 0 : b.charAt(indexB--) - '0';
            sum.insert(0, (i + j + carry) % 2);
            carry = (i + j + carry) / 2;
        }

        return sum.toString();
    }
}
