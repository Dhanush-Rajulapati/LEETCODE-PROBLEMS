class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int []res = new int[n];
        int last = 0;
        Stack<Integer> st = new Stack<>();
        for(String s : logs) {
            String []strs = s.split(":");
            int id = Integer.parseInt(strs[0]);
            String op = strs[1];
            int time = Integer.parseInt(strs[2]);
            if(op.equals("start")) {
                if(!st.isEmpty()) {
                    res[st.peek()] += time-last;
                }
                last = time;
                st.push(id);
            }
            else {
                res[st.peek()] += time-last+1;
                last = time+1;
                st.pop();
            }
        }
        return res;
    }
}