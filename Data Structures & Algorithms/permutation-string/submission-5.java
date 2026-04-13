class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        Map<Character, Integer> s1Map = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        int l = 0;

        for (char c : s1.toCharArray()) {
            s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
        }

        for (int r = 0; r < s2.length(); r++) {
            char rChar = s2.charAt(r);
            window.put(rChar, window.getOrDefault(rChar, 0) + 1);

            if (r - l + 1 > s1.length()) {
                char lChar = s2.charAt(l);
                window.put(lChar, window.get(lChar) - 1);
                if (window.get(lChar) == 0) {
                    window.remove(lChar);
                }
                l++;
            }

            if (s1Map.equals(window)) return true;
        }

        return false;
    }
}