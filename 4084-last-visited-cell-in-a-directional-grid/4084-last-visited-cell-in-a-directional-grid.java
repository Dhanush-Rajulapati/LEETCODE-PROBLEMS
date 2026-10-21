class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        HashSet<String> set = new HashSet<>();
        set.add("0.0");
        int row = 0;
        int col = 0;
        int n = grid.length;
        int m = grid[0].length;
        while(true) {
            int nextRow = row;
            int nextCol = col;
            if(grid[row][col] == 'R') {
                nextCol++;
            }
            if(grid[row][col] == 'L') {
                nextCol--;
            }
            if(grid[row][col] == 'U') {
                nextRow--;
            }
            if(grid[row][col] == 'D') {
                nextRow++;
            }
            String next = nextRow+"."+nextCol;
            if((nextRow >= n || nextCol >= m || nextRow < 0 || nextCol < 0) || set.contains(next)) {
                return new int[] {row,col};
            }
            set.add(next);
            row = nextRow;
            col = nextCol;
        }
    }
}