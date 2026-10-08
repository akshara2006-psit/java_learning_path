import java.util.HashMap;
import java.util.Map;

public class check_if{
    boolean search(String txt, String pat) {
      
      int n = txt.length();
        int m = pat.length();
        if (m > n) return false;

        Map<Character, Integer> patMap = new HashMap<>();
        Map<Character, Integer> windowMap = new HashMap<>();
        for (char c : pat.toCharArray()) {
            patMap.put(c, patMap.getOrDefault(c, 0) + 1);
        }

        int i = 0, j = 0;
        while (j < n) {
            char addChar = txt.charAt(j);
            windowMap.put(addChar, windowMap.getOrDefault(addChar, 0) + 1);
            if ((j - i + 1) == m) {
                if (patMap.equals(windowMap)) return true;
                char removeChar = txt.charAt(i);
                windowMap.put(removeChar, windowMap.get(removeChar) - 1);
                if (windowMap.get(removeChar) == 0) {
                    windowMap.remove(removeChar);
                }
                i++;
            }
            j++;
        }
        return false;
    }
}
// Check if permutation is substring 