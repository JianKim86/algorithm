public class LengthOfLastWord {
    public void run() {
        //Given a string s consisting of some words separated by some number of spaces,
        //return the length of the last word in the string.
        //A word is a maximal substring consisting of non-space characters only.
        System.out.print(solution("hello world")); //5
    }

    private int solution(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        s = s.trim();
        String word = s.substring(s.lastIndexOf(" ") + 1);
        return word.length();
    }
}
