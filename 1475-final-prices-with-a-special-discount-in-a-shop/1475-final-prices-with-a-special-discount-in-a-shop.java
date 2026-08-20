class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int []res = new int[n];
        for(int i=0;i<n-1;i++)
        {
            int value = 0;
            for(int j=i+1;j<n;j++)
            {
                if(prices[i] >= prices[j])
                {
                    value = prices[j];
                    break;
                }
            }
            res[i] = prices[i] - value;
        }
        res[n-1] = prices[n-1];
        return res;
    }
}