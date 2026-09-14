import java.util.HashMap;

public class long_distincct_char_substr {
     public int longestUniqueSubstr(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int i = 0;
        int j = 0;
        int maxLen = 0;

        while (j < s.length()) {

            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while (map.size() < j - i + 1) {
                char left = s.charAt(i);

                map.put(left, map.get(left) - 1);

                if (map.get(left) == 0) {
                    map.remove(left);
                }

                i++;
            }
            maxLen = Math.max(maxLen, j - i + 1);

            j++;
        }

        return maxLen;
    }
}
// Given a string s, find the length of the longest substring with all distinct characters. 