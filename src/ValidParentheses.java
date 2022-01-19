import java.util.Stack;

public class ValidParentheses {
    public void run() {
        //Given a string s containing just the characters
        // '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
        //An input string is valid if:
        //Open brackets must be closed by the same type of brackets.
        //Open brackets must be closed in the correct order.
        System.out.println(solution("()[)")); //false
    }

    private boolean solution(String s) {
        Stack<Character> characterStack = new Stack<>();
        for (Character c : s.toCharArray()) {
            switch (c) {
                case '(':
                    characterStack.push(')');
                    break;
                case '[':
                    characterStack.push(']');
                    break;
                case '{':
                    characterStack.push('}');
                    break;
                default:
                    if (characterStack.isEmpty() || characterStack.pop() != c) {
                        return false;
                    }
            }
        }
        return characterStack.isEmpty();
    }
}
