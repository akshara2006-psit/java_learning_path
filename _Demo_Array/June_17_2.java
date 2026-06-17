import java.util.Arrays;

public class June_17_2 {
    
    public static  boolean checkInclusion(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        if (n > m) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < n; i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(freq1, freq2))
            return true;

        for (int i = n; i < m; i++) {
            freq2[s2.charAt(i) - 'a']++;
            freq2[s2.charAt(i - n) - 'a']--;

            if (Arrays.equals(freq1, freq2))
                return true;
        }

        return false;
    }
    public static void main(String[] args) {
        String s1="eibaooo";
        String s2="ab";
        if(checkInclusion(s2, s1)){
            System.out.println("yes it contains permutation");
        }
        else{
            System.out.println("no it  not contains permutation");
        }
    }
}

// Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

// In other words, return true if one of s1's permutations is the substring of s2.

 