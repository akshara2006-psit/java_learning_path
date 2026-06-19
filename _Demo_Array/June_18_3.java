import java.util.ArrayList;

public class June_18_3 {
  public static String removeDuplicates(String s) {
        ArrayList<Character> list = new ArrayList<>();

        for (char c : s.toCharArray()) {
            list.add(c);
        }

        int i = 1;

        while (i < list.size()) {
            if (list.get(i) == list.get(i - 1)) {
                list.remove(i);
                list.remove(i - 1);

                if (i > 1) {
                    i--;
                }
            } else {
                i++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char c : list) {
            sb.append(c);
        }

        return sb.toString();
    }  
    public static void main(String[] args) {
        String s="abbaca";
        System.out.println("ans: "+removeDuplicates(s));
    }
}
// You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

// We repeatedly make duplicate removals on s until we no longer can.

// Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.
