class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        int index = 0;
        StringBuilder current = new StringBuilder(s);

        solveit(ans, current, index);

        return ans;
    }

    public void solveit(List<String> ans, StringBuilder current, int start) {
        ans.add(current.toString());

        for (int i = start; i < current.length(); i++) {
            char ch = current.charAt(i);

            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    current.setCharAt(i, Character.toUpperCase(ch));
                } else {
                    current.setCharAt(i, Character.toLowerCase(ch));
                }

                solveit(ans, current, i + 1);

                current.setCharAt(i, ch);
            }
        }
    }
}