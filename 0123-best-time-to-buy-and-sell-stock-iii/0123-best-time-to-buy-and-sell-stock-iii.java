class Solution {
    public int maxProfit(int[] prices) {
        int firstBuy = Integer.MIN_VALUE;
        int secondBuy = Integer.MIN_VALUE;
        int firstSell = 0;
        int secondSell = 0;
        for(int price : prices) {
            firstBuy = Math.max(firstBuy,-price);
            firstSell = Math.max(firstSell,price+firstBuy);
            secondBuy = Math.max(secondBuy,firstSell-price);
            secondSell = Math.max(secondSell,price+secondBuy);
        }
        return secondSell;
    }
}