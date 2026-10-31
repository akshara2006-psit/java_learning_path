import java.util.LinkedList;
import java.util.Queue;

public class No_Of_islands {
    public int countIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;

        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 'L') {
                    count++;

                    grid[i][j] = 'W';
                    q.offer(new int[]{i, j});

                    while (!q.isEmpty()) {
                        int[] curr = q.poll();
                        int r = curr[0];
                        int c = curr[1];

                        // Up
                        if (r - 1 >= 0 &&
                            grid[r - 1][c] == 'L') {
                            grid[r - 1][c] = 'W';
                            q.offer(new int[]{r - 1, c});
                        }

                        // Down
                        if (r + 1 < n &&
                            grid[r + 1][c] == 'L') {
                            grid[r + 1][c] = 'W';
                            q.offer(new int[]{r + 1, c});
                        }

                        // Left
                        if (c - 1 >= 0 &&
                            grid[r][c - 1] == 'L') {
                            grid[r][c - 1] = 'W';
                            q.offer(new int[]{r, c - 1});
                        }

                        // Right
                        if (c + 1 < m &&
                            grid[r][c + 1] == 'L') {
                            grid[r][c + 1] = 'W';
                            q.offer(new int[]{r, c + 1});
                        }

                        // Top-left
                        if (r - 1 >= 0 && c - 1 >= 0 &&
                            grid[r - 1][c - 1] == 'L') {
                            grid[r - 1][c - 1] = 'W';
                            q.offer(new int[]{r - 1, c - 1});
                        }

                        // Top-right
                        if (r - 1 >= 0 && c + 1 < m &&
                            grid[r - 1][c + 1] == 'L') {
                            grid[r - 1][c + 1] = 'W';
                            q.offer(new int[]{r - 1, c + 1});
                        }

                        // Bottom-left
                        if (r + 1 < n && c - 1 >= 0 &&
                            grid[r + 1][c - 1] == 'L') {
                            grid[r + 1][c - 1] = 'W';
                            q.offer(new int[]{r + 1, c - 1});
                        }

                        // Bottom-right
                        if (r + 1 < n && c + 1 < m &&
                            grid[r + 1][c + 1] == 'L') {
                            grid[r + 1][c + 1] = 'W';
                            q.offer(new int[]{r + 1, c + 1});
                        }
                    }
                }
            }
        }

        return count;
    }
}
