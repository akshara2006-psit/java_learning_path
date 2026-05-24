import java.util.Scanner;

public class javabasicspractice {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int x=sc.nextInt();
        // int y=sc.nextInt();
        // System.out.printf("the number before %d %d\n ",x,y);
        // program to reverse a number using third variable
        // int temp=x;
        // x=y;
        // y=temp;
        // System.out.printf("the number after %d %d \n",x,y);
// ------print pattern like ------
// *
// **
// ***
// ****
// for(int i=1;i<5;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }



// ------Reverse a number and check if it’s a palindrome.
/*int n=sc.nextInt();
int temp=n;
int rev=0;
while(n!=0){
int d=n%10;
rev=rev*10+d;
n=n/10;
}
n=temp;
if(n==rev)
System.out.println("the number is palindrome");
else
System.out.println("the number is not palindrome");*/

// -------Find the sum of digits of a number.
/*int n=sc.nextInt();
int sum=0;
int temp=n;
while(n!=0){
    int d=n%10;
    sum=sum+d;
    n=n/10;
}
System.out.print("the sum of digits is:");
System.out.println(sum);*/

// ------Generate the Fibonacci series up to n terms.
/*int n=sc.nextInt();
int a=0;
int b=1;
for(int i=0;i<=n;i++){
    if(i==0 || i==1)
    System.out.print(i+" ");
    else{
        int c=a+b;
        a=b;
        b=c;
        System.out.print(b+" ");
    }
}*/




    }
    
}
