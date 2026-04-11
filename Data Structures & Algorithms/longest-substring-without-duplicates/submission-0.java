class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet <>();
        char[] chars = s.toCharArray();
        int l = 0;
        int maxLength = 0;

        for(int r = 0; r < chars.length; r++) {
            while(window.contains(chars[r])) {
                window.remove(chars[l]);
                l++;
            }

            window.add(chars[r]);
            maxLength = Math.max(maxLength, r-l+1);
        }
        
        return maxLength;
    }
}
