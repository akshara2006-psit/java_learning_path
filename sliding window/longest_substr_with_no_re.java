import java.util.HashMap;
import java.util.Map;

public class longest_substr_with_no_re{
    public int longestKSubstr(String s, int k) {
        int n = s.length();
        Map<Character, Integer> freq = new HashMap<>();
        int i = 0, j = 0;
        int maxLen = -1;

        while (j < n) {
            char c = s.charAt(j);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            j++;
            while (freq.size() > k) {
                char leftChar = s.charAt(i);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                i++;
            }
            if (freq.size() == k) {
                maxLen = Math.max(maxLen, j - i);
            }
        }

        return maxLen;
    }
}

// You are given a string s consisting only lowercase alphabets and an integer k. Your task is to find the length of the longest substring that contains exactly k distinct characters.
