class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> hmap1 = new HashMap<>();

        for (char ch : t.toCharArray()) {
            hmap1.put(ch, hmap1.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> hmap2 = new HashMap<>();

        int low = 0;
        int high = 0;
        int required = 0;
        int length = Integer.MAX_VALUE;
        int start = 0;

        while (high < s.length()) {
            char curr = s.charAt(high);

            if (hmap1.containsKey(curr)) {
                hmap2.put(curr, hmap2.getOrDefault(curr, 0) + 1);

                if (hmap2.get(curr).equals(hmap1.get(curr))) {
                    required++;
                }
            }

            while (required == hmap1.size()) {
                if (length > high - low + 1) {
                    length = high - low + 1;
                    start = low;
                }

                char leftChar = s.charAt(low);

                if (hmap2.containsKey(leftChar)) {
                    hmap2.put(leftChar, hmap2.get(leftChar) - 1);

                    if (hmap2.get(leftChar) < hmap1.get(leftChar)) {
                        required--;
                    }
                }

                low++;
            }

            high++;
        }

        return length == Integer.MAX_VALUE ? "" : s.substring(start, start + length);
    }
}