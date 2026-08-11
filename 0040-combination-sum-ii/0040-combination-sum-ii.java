class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);

        findCombination(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void findCombination(
        int[] candidates,
        int target,
        int start,
        List<Integer> current,
        List<List<Integer>> ans
    ) {
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int j = start; j < candidates.length; j++) {
            // Skip duplicate choices at the same recursion level
            if (j > start && candidates[j] == candidates[j - 1]) {
                continue;
            }

            if (candidates[j] > target) {
                break;
            }

            // PICK
            current.add(candidates[j]);

            findCombination(
                candidates,
                target - candidates[j],
                j + 1,
                current,
                ans
            );

            // BACKTRACK
            current.remove(current.size() - 1);
        }
    }
}

