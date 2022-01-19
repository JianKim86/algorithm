public class LongestCommonPrefix {
    public void run() {
        //Write a function to find the longest common prefix string amongst an array of strings.
        //If there is no common prefix, return an empty string "".
        System.out.println(solution(new String[]{"flower", "flow", "flight"})); // fl
    }

    private String solution(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }

        String start = strs[0];
        String prefix = "", word = "";
        for (int i = 0; i < start.length(); i++) {
            word = start.substring(0, i + 1);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].indexOf(word) != 0) {
                    return word.substring(0, i);
                }
                prefix = word;
            }
        }
        return prefix;
    }
}
