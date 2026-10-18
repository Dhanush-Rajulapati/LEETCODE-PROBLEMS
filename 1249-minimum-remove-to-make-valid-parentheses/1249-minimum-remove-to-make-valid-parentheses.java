class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        Set<Integer> remove = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(')
                st.push(i);
            else if(s.charAt(i) == ')')
            {
                if(!st.isEmpty())
                    st.pop();
                else
                    remove.add(i);
            }
        }
        for(int num : st)
            remove.add(num);
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(!remove.contains(i))
                res.append(s.charAt(i));
        }
        return res.toString();
    }
}