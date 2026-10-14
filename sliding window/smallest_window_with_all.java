import java.util.HashMap;

public class smallest_window_with_all {
    public int findSubString(String s) {

        int n = s.length();
        HashMap<Character, Integer> original = new HashMap<>();

        for (char ch : s.toCharArray()) {
            original.put(ch, original.getOrDefault(ch, 0) + 1);
        }
        HashMap<Character, Integer> map = new HashMap<>();

        int i = 0;
        int j = 0;
        int ans = n;

        while (j < n) {

            char ch = s.charAt(j);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if (map.size() == original.size()) {

                ans = Math.min(ans, j - i + 1);
                while (map.size() == original.size()) {

                    ans = Math.min(ans, j - i + 1);

                    char left = s.charAt(i);

                    map.put(left, map.get(left) - 1);

                    if (map.get(left) == 0) {
                        map.remove(left);
                    }

                    i++;
                }
            }

            j++;
        }

        return ans;
    }
}
// Smallest window length with all