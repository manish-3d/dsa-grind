class Solution {
    public String decodeString(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<StringBuilder> ststack = new ArrayDeque<>();

        StringBuilder current = new StringBuilder();
        int count = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                count = count * 10 + (ch - '0');
            }

            else if (ch == '[') {
                stack.push(count);
                ststack.push(current);

                count = 0;
                current = new StringBuilder();
            }

            else if (Character.isAlphabetic(ch)) {
                current.append(ch);
            }

            else if (ch == ']') {
                int repeat = stack.pop();

                StringBuilder previous = ststack.pop();

                for (int i = 0; i < repeat; i++) {
                    previous.append(current);
                }

                current = previous;
            }
        }

        return current.toString();
    }
}