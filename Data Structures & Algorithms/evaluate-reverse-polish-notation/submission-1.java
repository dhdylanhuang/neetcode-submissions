class Solution {
    public int evalRPN(String[] tokens) {
        String[] OPS = {"+", "-", "*", "/"};
        Deque<Integer> stack = new ArrayDeque<>();
        int total = 0;

        for(String token : tokens) {
            if(Arrays.asList(OPS).contains(token)) {
                int secondInt = stack.pop();
                int firstInt = stack.pop();

                if(token.equals("+")) {
                    total = firstInt + secondInt;
                } else if (token.equals("-")) {
                    total = firstInt - secondInt;
                } else if (token.equals("*")) {
                    total = firstInt * secondInt;
                } else if (token.equals("/")) {
                    total = firstInt / secondInt;
                } else {
                    System.out.println("Invalid Operation");
                }
                stack.push(total);
            } else {
                stack.push(Integer.valueOf(token));
            }
        }

        return stack.pop();
    }
}
