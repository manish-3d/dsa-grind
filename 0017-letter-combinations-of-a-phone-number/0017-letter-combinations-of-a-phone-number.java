class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        String[] str = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        char[] digitarr = digits.toCharArray();

        solveit(digits, str, new StringBuilder(), ans, digitarr, 0);

        return ans;
    }

    public void solveit(
        String digits,
        String[] str,
        StringBuilder curr,
        List<String> ans,
        char[] digitarr,
        int index
    ) {
        if (curr.length() == digits.length()) {
            ans.add(curr.toString());
            return;
        }

        int currentdigit = digitarr[index] - '0';

        String letters = str[currentdigit];

        for (char ch : letters.toCharArray()) {
            curr.append(ch);

            solveit(digits, str, curr, ans, digitarr, index + 1);

            curr.deleteCharAt(curr.length() - 1);
        }
    }
}