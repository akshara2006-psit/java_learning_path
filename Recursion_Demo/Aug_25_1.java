import java.util.ArrayList;
import java.util.Collections;

public class Aug_25_1 {
      ArrayList<String> permutation(String s) {
        ArrayList<String> result = new ArrayList<>();
        backtrack(s, 1, new StringBuilder().append(s.charAt(0)), result);
        Collections.sort(result);
        return result;
    }

    private void backtrack(String s, int index, StringBuilder path, ArrayList<String> result) {
        if (index == s.length()) {
            result.add(path.toString());
            return;
        }
        path.append(s.charAt(index));
        backtrack(s, index + 1, path, result);
        path.deleteCharAt(path.length() - 1);
        path.append(" ").append(s.charAt(index));
        backtrack(s, index + 1, path, result);
        path.deleteCharAt(path.length() - 1); 
        path.deleteCharAt(path.length() - 1); 
    }
}
// permutation with space