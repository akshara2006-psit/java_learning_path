
    
public class BinaryMaze {
    public int shortestPath(int[][] mat, int[] src, int[] dest) {
        int n = mat.length;
        int m = mat[0].length;
        if (mat[src[0]][src[1]] == 0 ||
            mat[dest[0]][dest[1]] == 0) {
            return -1;
        }

        // Source and destination are the same
        if (src[0] == dest[0] && src[1] == dest[1]) {
            return 0;
        }

        int[][] dist = new int[n][m];

        for (int i = 0; i < n; i++) {
            java.util.Arrays.fill(dist[i], -1);
        }

        java.util.Queue<int[]> q = new java.util.LinkedList<>();

        q.offer(new int[]{src[0], src[1]});
        dist[src[0]][src[1]] = 0;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            int[] curr = q.poll();

            int r = curr[0];
            int c = curr[1];

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                // Check boundaries and blocked/visited cells
                if (nr >= 0 && nr < n &&
                    nc >= 0 && nc < m &&
                    mat[nr][nc] == 1 &&
                    dist[nr][nc] == -1) {

                    dist[nr][nc] = dist[r][c] + 1;

                    if (nr == dest[0] && nc == dest[1]) {
                        return dist[nr][nc];
                    }

                    q.offer(new int[]{nr, nc});
                }
            }
        }

        return -1;
    }
}