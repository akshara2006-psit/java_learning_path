
    
public class AlienDictionary {
    public String findOrder(String[] words) {
        int n = words.length;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[26];
        boolean[] used = new boolean[26];

        // Create adjacency list
        for (int i = 0; i < 26; i++) {
            adj.add(new ArrayList<>());
        }

        // Mark characters used in words
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                used[ch - 'a'] = true;
            }
        }

        // Compare adjacent strings
        for (int i = 0; i < n - 1; i++) {
            String s1 = words[i];
            String s2 = words[i + 1];

            int j = 0;
            int k = 0;

            // Move both pointers while characters are equal
            while (j < s1.length() && k < s2.length()
                    && s1.charAt(j) == s2.charAt(k)) {
                j++;
                k++;
            }

            // First different characters give the ordering
            if (j < s1.length() && k < s2.length()) {
                int u = s1.charAt(j) - 'a';
                int v = s2.charAt(k) - 'a';

                if (!adj.get(u).contains(v)) {
                    adj.get(u).add(v);
                    indegree[v]++;
                }
            }
            // Invalid prefix case
            else if (k == s2.length() && s1.length() > s2.length()) {
                return "";
            }
        }

        // BFS: Kahn's Algorithm
        Queue<Integer> q = new LinkedList<>();

        int total = 0;

        for (int i = 0; i < 26; i++) {
            if (used[i]) {
                total++;

                if (indegree[i] == 0) {
                    q.add(i);
                }
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!q.isEmpty()) {
            int u = q.poll();
            ans.append((char) (u + 'a'));

            for (int v : adj.get(u)) {
                indegree[v]--;

                if (indegree[v] == 0) {
                    q.add(v);
                }
            }
        }

        // If a cycle exists, not all characters are processed
        if (ans.length() != total) {
            return "";
        }

        return ans.toString();
    }
}