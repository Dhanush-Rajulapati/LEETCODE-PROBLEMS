class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int res = -1;
        int dist = Integer.MAX_VALUE;
        int idx = 0;
        for(int []drone : drones) {
            int currDist = Math.abs(target[0]-drone[0])+Math.abs(target[1]-drone[1]);
            if(currDist <= drone[2] && dist > currDist) {
                res = idx;
                dist = currDist;
            }
            idx++;
        }
        return res;
    }
}