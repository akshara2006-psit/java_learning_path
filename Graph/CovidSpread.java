import java.util.*;

class CovidSpread{
    public int covidSpread(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        Queue<int[]> q = new LinkedList<>();
        int uninfected = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 2) {
                    q.offer(new int[]{i, j});
                } else if (mat[i][j] == 1) {
                    uninfected++;
                }
            }
        }

        if (uninfected == 0) return 0;

        int time = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            boolean spread = false;

            for (int k = 0; k < size; k++) {
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];

                // Up
                if (r - 1 >= 0 && mat[r - 1][c] == 1) {
                    mat[r - 1][c] = 2;
                    q.offer(new int[]{r - 1, c});
                    uninfected--;
                    spread = true;
                }

                // Down
                if (r + 1 < n && mat[r + 1][c] == 1) {
                    mat[r + 1][c] = 2;
                    q.offer(new int[]{r + 1, c});
                    uninfected--;
                    spread = true;
                }

                // Left
                if (c - 1 >= 0 && mat[r][c - 1] == 1) {
                    mat[r][c - 1] = 2;
                    q.offer(new int[]{r, c - 1});
                    uninfected--;
                    spread = true;
                }

                // Right
                if (c + 1 < m && mat[r][c + 1] == 1) {
                    mat[r][c + 1] = 2;
                    q.offer(new int[]{r, c + 1});
                    uninfected--;
                    spread = true;
                }
            }

            if (spread) time++;
        }

        return uninfected == 0 ? time : -1;
    }
}