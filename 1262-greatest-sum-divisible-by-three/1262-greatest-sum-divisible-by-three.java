class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        for(int num : nums) {
            if(num%3 == 1) {
                sum1 += num;
                one.add(num);
            }
            else if(num%3 == 2) {
                sum2 += num;
                two.add(num);
            }
            sum += num;
        }
        if(sum%3 == 0) {
            return sum;
        }
        Collections.sort(one);
        Collections.sort(two);
        int remove = Integer.MAX_VALUE;
        if(sum%3 == 1) {
            if(one.size() >= 1) {
                remove = Math.min(remove,one.get(0));
            }
            if(two.size() >= 2) {
                remove = Math.min(remove,two.get(0)+two.get(1));
            }
            return sum-remove;
        }
        else {
            if(two.size() >= 1) {
                remove = Math.min(remove,two.get(0));
            }
            if(one.size() >= 2) {
                remove = Math.min(remove,one.get(0)+one.get(1));
            }
            return sum-remove;
        }
    }
}