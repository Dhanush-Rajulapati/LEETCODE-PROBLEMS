class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String []start = startTime.split(":");
        String []end = endTime.split(":");
        
        int h1 = Integer.parseInt(start[0]);
        int m1 = Integer.parseInt(start[1]);
        int s1 = Integer.parseInt(start[2]);

        int h2 = Integer.parseInt(end[0]);
        int m2 = Integer.parseInt(end[1]);
        int s2 = Integer.parseInt(end[2]);

        int s = h1*3600+m1*60+s1;
        int e = h2*3600+m2*60+s2;

        return e-s;
    }
}