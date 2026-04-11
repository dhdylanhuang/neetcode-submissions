class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : strs){
            char[] characters = word.toCharArray();
            Arrays.sort(characters);
            String key = new String(characters);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }

        ans.addAll(map.values());
        return ans;
    }
}
