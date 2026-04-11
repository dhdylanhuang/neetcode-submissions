class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String word : strs) {
            encoded.append(word.length());
            encoded.append('#');
            encoded.append(word);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        String s = str;

        while(i < s.length()){
            int j = i;

            while (s.charAt(j) != '#'){
                j++;
            }

            int wordLength = Integer.parseInt(s.substring(i, j));

            String word = s.substring(j + 1, j + 1 + wordLength);
            decoded.add(word);

            i = j + 1 + wordLength;
        }
        return decoded;
    }
}
