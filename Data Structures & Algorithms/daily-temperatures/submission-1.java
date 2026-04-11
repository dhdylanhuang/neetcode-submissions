class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<int[]> stack = new ArrayDeque <>();

        for(int i = 0; i < temperatures.length; i++) {
            int t = temperatures[i];
            while((!stack.isEmpty()) && (t > stack.peek()[0])) {
                int[] top = stack.pop();
                int stackInd = top[1];
                result[stackInd] = i - stackInd;
            } 
            
            stack.push(new int[]{t, i});
        }

        return result;
    }
}
