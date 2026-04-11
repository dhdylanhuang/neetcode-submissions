class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minRate = Integer.MAX_VALUE;
        int L = 1;
        int R = Arrays.stream(piles).max().getAsInt();

        while(L <= R) {
            int hours = 0;
            int mid = (L + R) / 2;

            for(int i = 0; i < piles.length; i++) {
                double hoursPerPile = (double) piles[i] / mid;
                hours += (int) Math.ceil(hoursPerPile);
                if (hours > h) break;               
            }

            if (hours > h) {
                L = mid + 1;
            } else {
                minRate = Math.min(minRate, mid);
                R = mid - 1;
            }

        }

        return minRate;
    }
}
