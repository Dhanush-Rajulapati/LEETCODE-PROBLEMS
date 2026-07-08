class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if(rows == 1)
            return encodedText;
        int n = encodedText.length();
        int c = (int)Math.ceil((double)n/rows);
        char [][]mat = new char[rows][c];
        int idx = 0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<c;j++)
                mat[i][j] = encodedText.charAt(idx++);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<c;i++)
        {
            int r = 0,col = i;
            while(r < rows && col < c)
            {
                sb.append(mat[r][col]);
                r++;
                col++;
            }
        }
        return sb.toString().stripTrailing();
    }
}