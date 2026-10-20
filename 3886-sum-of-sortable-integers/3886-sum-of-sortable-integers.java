class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int []temp = nums.clone();
        Arrays.sort(temp);
        List<Integer> divisors = new ArrayList<>();
        for(int i=1;i*i<=n;i++)
            {
                if(n%i == 0)
                {
                    divisors.add(i);
                    if(i != n/i)
                    {
                        divisors.add(n/i);
                    }
                }
            }
        int res = 0;
        for(int num : divisors)
            {
                if(isValid(nums,temp,num))
                    res += num;
            }
        return res;
    }
    public boolean isValid(int []nums,int []temp,int k)
    {
        for(int i=0;i<nums.length;i+=k)
            {
                int []block1 = Arrays.copyOfRange(nums,i,i+k);
                int []block2 = Arrays.copyOfRange(temp,i,i+k);
                if(!valid(block1,block2))
                    return false;
            }
        return true;
    }
    public boolean valid(int []block1,int []block2)
    {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<block1.length;i++)
            {
                sb1.append(block1[i]);
                sb2.append(block2[i]);
            }
        String s1 = sb1.toString();
        String s2 = sb2.toString();
        s1 = s1+s1;
        return kmp(s1,s2);
    }
    public boolean kmp(String s,String p)
    {
        int n = s.length();
        int m = p.length();
        int []lps = computeLps(p);
        int i = 0,j = 0;
        while(i < n)
        {
            if(s.charAt(i) == p.charAt(j))
            {
                i++;
                j++;
                if(j == m)
                    return true;
            }
            else
            {
                if(j != 0)
                    j = lps[j-1];
                else
                    i++;
            }
        }
        return false;
    }
    public int[] computeLps(String p)
    {
        int []lps = new int[p.length()];
        int i = 1,len = 0;
        while(i < p.length())
        {
            if(p.charAt(i) == p.charAt(len))
            {
                len++;
                lps[i] = len;
                i++;
            }
            else
            {
                if(len != 0)
                {
                    len = lps[len-1];
                }
                else
                {
                    i++;
                }
            }
        }
        return lps;
    }
}