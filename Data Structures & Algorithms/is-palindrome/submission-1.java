class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] cleanedArray = cleaned.toCharArray();
        int head = 0;
        int tail = cleanedArray.length - 1;

        while(head < tail) {
            if(cleanedArray[head]!=cleanedArray[tail]){
                return false;
            }
            head++;
            tail--;
        }

        return true;

    }
}
