public class count_ocuur_of_anagram{
    int search(String pat, String txt) {
        int k = pat.length();
        int[] freq = new int[26];
        for (char ch : pat.toCharArray()) {
            freq[ch - 'a']++;
        }
        int ans = 0;
        int i = 0, j = 0;

        while (j < txt.length()) {
            freq[txt.charAt(j) - 'a']--;
            if (j - i + 1 < k) {
                j++;
            }
            else {
                boolean isAnagram = true;
                for (int x : freq) {
                    if (x != 0) {
                        isAnagram = false;
                        break;
                    }
                }
                if (isAnagram) {
                    ans++;
                }
                freq[txt.charAt(i) - 'a']++;
                i++;
                j++;
            }
        }

        return ans;
    }
}
// count occurences of anagram