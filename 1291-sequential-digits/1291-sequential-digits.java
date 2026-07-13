class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        // String num = "123456789";
        // List<Integer> res = new ArrayList<>();
        // int l = (low+"").length();
        // int h = (high+"").length();
        // for(int i=l;i<=h;i++) {
        //     for(int j=0;j<=9-i;j++) {
        //         int n = Integer.parseInt(num.substring(j,j+i));
        //         if(n >= low && n <= high) {
        //             res.add(n);
        //         }
        //         if(n > high) {
        //             break;
        //         }
        //     }
        // }
        // return res;

        List<Integer> res  = new ArrayList<>();
        for(int i=1;i<=9;i++) {
            int curr = i;
            int next = i+1;
            while(curr <= high && next <= 9) {
                curr = curr*10+next;
                if(curr <= high && curr >= low) {
                    res.add(curr);
                }
                next++;
            }
        }
        Collections.sort(res);
        return res;
    }
}