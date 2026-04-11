class Solution {
    public int maxArea(int[] heights) {
        int head = 0;
        int tail = heights.length - 1;
        int maxArea = 0;

        while(head < tail) {
            int area = (tail - head) * Math.min(heights[head], heights[tail]);
            maxArea = Math.max(maxArea, area);

            if(heights[head] < heights[tail]) {
                head++;
            } else if(heights[head] > heights[tail]) {
                tail--;
            } else {
                head ++;
            }
        }

        return maxArea;
    }
}
