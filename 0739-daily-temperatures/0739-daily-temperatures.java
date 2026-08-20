class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int []res = new int[n];
        Deque<Integer> st = new ArrayDeque<>();
        for(int i=0;i<n;i++) {
            if(!st.isEmpty()) {
                while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                    int idx = st.pop();
                    res[idx] = i-idx;
                }
            }
            st.push(i);
        }
        return res;
    }
}