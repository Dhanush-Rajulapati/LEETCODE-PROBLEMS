class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;

        List<Integer> temp = new ArrayList<>();
        for(int []nums : grid) {
            for(int num : nums) {
                temp.add(num);
            }
        }

        int s = temp.size();
        k = k%s;
        reverse(temp,0,s-1);
        reverse(temp,0,k-1);
        reverse(temp,k,s-1);

        int idx = 0;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<m;j++) {
                list.add(temp.get(idx++));
            }
            res.add(new ArrayList<>(list));
        }
        return res;
    }
    public void reverse(List<Integer> temp,int start,int end) {
        while(start < end) {
            int t = temp.get(start);
            temp.set(start,temp.get(end));
            temp.set(end,t);
            start++;
            end--;
        }
    }
}