import java.util.Arrays;
import java.util.Scanner;
public class stringsearch {
    public static void main(String[] args)
    {
Scanner sc= new Scanner(System.in);
String str="AKSHARA";
char c='H';
System.out.println(Arrays.toString(str.toCharArray()));
int len=str.length();
for(var i=0;i<len;i++)
{
 if(str.charAt(i)==c)
 {
    System.out.println("the given char is present in string"+i);
 }
}

        
        
    }
    
}
