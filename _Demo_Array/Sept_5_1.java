public class Sept_5_1{
 
    String reverses(String s) {
        char[] ch = s.toCharArray();

        int i = 0;
        int j = ch.length - 1;

        while (i < j) {
            if (ch[i] == ' ') {
                i++;
            }
            else if (ch[j] == ' ') {
                j--;
            }
            else {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;

                i++;
                j--;
            }
        }

        return new String(ch);
    }
}
// Reverse String with spaces intact