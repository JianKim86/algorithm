public class ImplementStrStr {
    public void run() {
        //Implement strStr().
        //Return the index of the first occurrence of needle in haystack,
        //or -1 if needle is not part of haystack.
        //Clarification:
        //What should we return when needle is an empty string? This is a great question to ask during an interview.
        //For the purpose of this problem, we will return 0 when needle is an empty string.
        //This is consistent to C's strstr() and Java's indexOf().

        System.out.println(solution("hello", "ll"));

    }

    public int solution(String hayStack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        if (hayStack.isEmpty()) {
            return -1;
        }

        for (int i = 0; i < hayStack.length(); i++) {
            if (i + needle.length() > hayStack.length()) {
                break;
            }
            for (int j = 0; j < needle.length(); j++) {
                if (hayStack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
                if (j == needle.length() - 1) {
                    return i;
                }
            }
        }

        return -1;
    }
}
