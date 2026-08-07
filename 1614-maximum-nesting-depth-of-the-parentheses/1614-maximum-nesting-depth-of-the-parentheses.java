class Solution {
    public int maxDepth(String s) {

        int balance = 0;
        int maxDepth = 0;

        for (int i = 0; i < s.length(); i++) {

            char curr = s.charAt(i);

            if (curr == '(') {
                balance++;
                maxDepth = Math.max(maxDepth, balance);
            } else if (curr == ')') {
                balance--;
            }
        }

        return maxDepth;
    }
}