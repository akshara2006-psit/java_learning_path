public class July_9_1{
    public static String longestCommonPrefix(String arr[]) {
        // code here
         if (arr == null || arr.length == 0)
            return "";
        
        String prefix = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            
            while (!arr[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                
                if (prefix.isEmpty())
                    return "";
            }
        }
        
        return prefix;
    
    }    public static void main(String[] args) {
        String[] arr={"geeksforgeeks","geeks","geek","geezer"};
        String ans=longestCommonPrefix(arr);
        System.out.println(ans);
    }
}
// Given an array of strings arr[]. Return the longest common prefix among each and every strings present in the array. If there's no prefix common in all the strings, return "".