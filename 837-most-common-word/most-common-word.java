class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> countMap = new HashMap<>();
        
        for (String b : banned) {
            countMap.put(b, -1);
        }
        
        String[] words = paragraph.toLowerCase().split("[^a-zA-Z]+");
        
        String mostCommon = "";
        int maxCount = 0;
        
        for (String word : words) {
            if (word.isEmpty()) continue;
            
            Integer val = countMap.get(word);
            
            if (val != null && val == -1) continue;
            
            int newCount = (val == null ? 0 : val) + 1;
            countMap.put(word, newCount);
            
            if (newCount > maxCount) {
                maxCount = newCount;
                mostCommon = word;
            }
        }
        
        return mostCommon;
    }
}