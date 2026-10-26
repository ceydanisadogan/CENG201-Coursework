/**
 * BalancedBrackets.java
 * Your Name: Ceyda Nisa Dogan
 * Your Student ID: 210446031
 * Your Date: 26.10.2026
 */

public class BalancedBrackets {

    public static boolean isBalanced(String s) {
        BracketStack stack = new BracketStack();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else if (current == ')' || current == ']' || current == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char opening = stack.pop();

                if (!isMatchingPair(opening, current)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        if (opening == '(' && closing == ')') {
            return true;
        }

        if (opening == '[' && closing == ']') {
            return true;
        }

        if (opening == '{' && closing == '}') {
            return true;
        }

        return false;
    }
}
