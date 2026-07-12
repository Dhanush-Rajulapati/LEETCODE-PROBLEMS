class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = arr[i];
        }
        Arrays.sort(a);
        Map<Integer,Integer> rank = new HashMap<>();
        for(int num : a)
        {
            rank.putIfAbsent(num,rank.size()+1);
        }
        for(int i=0;i<n;i++)
        {
            a[i] = rank.get(arr[i]);
        }
        return a;
    }
}