import java.util.LinkedList;
import java.util.Queue;

public class ReplaceOsWithXs {
    void fill(char[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        Queue<int[]> q = new LinkedList<>();

        // Add boundary O's
        for (int i = 0; i < n; i++) {
            if (mat[i][0] == 'O') {
                q.offer(new int[]{i, 0});
                mat[i][0] = '#';
            }

            if (mat[i][m - 1] == 'O') {
                q.offer(new int[]{i, m - 1});
                mat[i][m - 1] = '#';
            }
        }

        for (int j = 0; j < m; j++) {
            if (mat[0][j] == 'O') {
                q.offer(new int[]{0, j});
                mat[0][j] = '#';
            }

            if (mat[n - 1][j] == 'O') {
                q.offer(new int[]{n - 1, j});
                mat[n - 1][j] = '#';
            }
        }

        // BFS without direction arrays
        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int r = cell[0];
            int c = cell[1];

            // Up
            if (r > 0 && mat[r - 1][c] == 'O') {
                mat[r - 1][c] = '#';
                q.offer(new int[]{r - 1, c});
            }

            // Down
            if (r < n - 1 && mat[r + 1][c] == 'O') {
                mat[r + 1][c] = '#';
                q.offer(new int[]{r + 1, c});
            }

            // Left
            if (c > 0 && mat[r][c - 1] == 'O') {
                mat[r][c - 1] = '#';
                q.offer(new int[]{r, c - 1});
            }

            // Right
            if (c < m - 1 && mat[r][c + 1] == 'O') {
                mat[r][c + 1] = '#';
                q.offer(new int[]{r, c + 1});
            }
        }

        // Replace surrounded O's and restore safe O's
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 'O') {
                    mat[i][j] = 'X';
                } else if (mat[i][j] == '#') {
                    mat[i][j] = 'O';
                }
            }
        }
    }
}
