class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num : nums)
            freq.put(num,freq.getOrDefault(num,0)+1);
        int []res = new int[2];
        int i=0;
        for(int num : freq.keySet())
        {
            if(freq.get(num) == 1)
                res[i++] = num;
        }
        return res;
    }
}