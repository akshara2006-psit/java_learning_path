public class Aug_10_1{
     public static String oddEven(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) {
                continue;
            }

            int position = i + 1; 
            if (position % 2 == 0 && freq[i] % 2 == 0) {
                count++;
            }
            else if (position % 2 != 0 && freq[i] % 2 != 0) {
                count++;
            }
        }

        return count % 2 == 0 ? "EVEN" : "ODD";
    }
}
// Given a string s of lowercase English characters, determine whether the summation of x and y is EVEN or ODD.
// where:

// x is the count of distinct characters that occupy even positions in the English alphabet and have even frequency. 
// y is the count of distinct characters that occupy odd positions in the English alphabet and have odd frequency.