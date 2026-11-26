class Solution {
    public boolean canAliceWin(int n) {
        int count = 10;
        boolean turn = false;
        while(n >= count) {
            n -= count;
            count--;
            turn = !turn;
        }
        return turn;
    }
}