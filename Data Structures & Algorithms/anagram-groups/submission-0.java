class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            // Convert String into character array
            char[] chars = str.toCharArray();

            // Sort characters
            Arrays.sort(chars);

            // Convert sorted character array back to String
            String key = new String(chars);

            // Create list if key doesn't exist, then add str
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
