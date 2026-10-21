class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int repeated_val = 0;
        int missing_val = 0;
        int n = grid.length;
        int[] temp = new int[n*n];
        int[] res = new int[2];

        for (int[] row : grid) {
            for (int val : row) {
                if (temp[val - 1] != 0) {
                    repeated_val = val;
                    //continue;
                } else {
                    temp[val - 1] = val;
                }
            }
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 0) {
                missing_val = i + 1;
            }
        }

        res[0] = repeated_val;
        res[1] = missing_val;

        return res;

    }
}