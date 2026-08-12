class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }

        String[] mapping = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        Queue<String> queue = new LinkedList<>();
        queue.add("");

        for (int i = 0; i < digits.length(); i++) {
            String letters = mapping[digits.charAt(i) - '0'];
            int size = queue.size();

            for (int j = 0; j < size; j++) {
                String current = queue.poll();
                for (char c : letters.toCharArray()) {
                    queue.add(current + c);
                }
            }
        }

        result.addAll(queue);
        return result;
    }
}