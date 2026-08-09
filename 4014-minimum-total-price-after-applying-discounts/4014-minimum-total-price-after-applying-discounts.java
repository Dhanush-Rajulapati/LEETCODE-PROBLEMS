class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int n = prices.length-1;
        int m = discounts.length-1;
        double res = 0;
        while(m >= 0 && n >= 0) {
            double curr = (prices[n]*(100-discounts[m]))/100.0;
            res += curr;
            n--;
            m--;
        }
        while(n >= 0) {
            res += prices[n];
            n--;
        }
        return res;
    }
}