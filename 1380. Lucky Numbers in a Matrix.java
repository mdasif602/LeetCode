class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            int min = Integer.MAX_VALUE;
            int col = -1;
            for (int j = 0; j < n; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                    col = j;
                }
            }
            int flag = 0;
            for (int j = 0; j < m; j++) {
                 if (matrix[j][col] > min) {
                    flag = 1;
                    break;
                 }
            }
            if (flag == 0) {
                ans.add(min);
            }
        }

        return ans;
    }
}
