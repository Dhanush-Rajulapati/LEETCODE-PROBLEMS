class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        findSubSets(0,nums,res,temp);
        return res;
    }
    static void findSubSets(int i,int[] nums,List<List<Integer>> res,ArrayList<Integer> temp)
    {
        if(i == nums.length)
        {
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        findSubSets(i+1,nums,res,temp);
        temp.remove(temp.size()-1);
        findSubSets(i+1,nums,res,temp);
    }
}