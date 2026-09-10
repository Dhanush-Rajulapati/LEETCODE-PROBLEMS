class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String s : words) {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>(
            (a,b) -> {
                if(!a.getValue().equals(b.getValue())) {
                    return a.getValue()-b.getValue();
                }
                return b.getKey().compareTo(a.getKey());
        });
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            pq.add(entry);
            if(pq.size() > k) {
                pq.remove();
            }
        }
        ArrayList<String> res = new ArrayList<>();
        for(int i=0;i<k;i++) {
            res.add(pq.remove().getKey());
        }
        Collections.reverse(res);
        return res;
    }
}