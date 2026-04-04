import java.util.*;

class Solution {
    public String infixToPostfix(String s) {

        Deque<Character> stack = new ArrayDeque<>();
        String ans = "";

        HashMap<Character, Integer> hmap = new HashMap<>();
        hmap.put('+', 1);
        hmap.put('-', 1);
        hmap.put('*', 2);
        hmap.put('/', 2);
        hmap.put('^', 3);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // 1. Operand
            if (Character.isLetterOrDigit(ch)) {
                ans += ch;
            }

            // 2. Opening bracket
            else if (ch == '(') {
                stack.push(ch);
            }

            // 3. Closing bracket
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    ans += stack.pop();
                }
                stack.pop(); // remove '('
            }

            // 4. Operator
            else {
                while (!stack.isEmpty() && stack.peek() != '(' &&
                        hmap.get(ch) <= hmap.get(stack.peek())) {
                    ans += stack.pop();
                }
                stack.push(ch);
            }
        }

        // 5. Pop remaining
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }

        return ans;
    }
}