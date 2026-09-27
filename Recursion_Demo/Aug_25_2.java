import java.util.ArrayList;
import java.util.List;

public class Aug_25_2{
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s.toCharArray(), 0, new StringBuilder(), result);
        return result;
    }
    
    private void backtrack(char[] chars, int index, StringBuilder path, List<String> result) {
        if (index == chars.length) {
            result.add(path.toString());
            return;
        }
        
        char c = chars[index];
        if (Character.isLetter(c)) {
            path.append(Character.toLowerCase(c));
            backtrack(chars, index + 1, path, result);
            path.deleteCharAt(path.length() - 1);
            path.append(Character.toUpperCase(c));
            backtrack(chars, index + 1, path, result);
            path.deleteCharAt(path.length() - 1);
        } else {
            path.append(c);
            backtrack(chars, index + 1, path, result);
            path.deleteCharAt(path.length() - 1);
        }
    }
}
// letter case permutation