class Solution {
    public int nthUglyNumber(int n) {
        if(n == 1) {
            return 1;
        }
        HashSet<Long> set = new HashSet<>();
        PriorityQueue<Long> pq = new PriorityQueue<>();
        set.add(1L);
        pq.add(1L);
        n--;
        while(n-- > 0) {
            long num = pq.remove();
            if(set.add(num*2))
                pq.add(num*2);
            if(set.add(num*3))
                pq.add(num*3);
            if(set.add(num*5))
                pq.add(num*5);
        }
        long res = pq.remove();
        return (int)res;
    }
}