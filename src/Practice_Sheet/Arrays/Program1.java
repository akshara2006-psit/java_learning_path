package Practice_Sheet.Arrays;

import java.util.Scanner;

public class Program1 {
public static void main(String[] args) {
	int[][] screens=new int[3][];
	screens[0]=new int[3];
	screens[1]=new int[5];
	screens[2]=new int[2];
	Scanner sc=new Scanner(System.in);
	double maxAvg=0;
	int bestScreen=-1;
	for(int i=0;i<3;i++) {
		for(int j=0;j<screens[i].length;j++) {
			screens[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<3;i++) {
		int sum=0;
		for(int j=0;j<screens[i].length;j++) {
			sum=sum+screens[i][j];
		}
		 double avg = (double) sum / screens[i].length;
         if (avg > maxAvg) {
             maxAvg = avg;
             bestScreen = i + 1;
         }
		
		System.out.println("The tickets sold for "+(i+1)+" is "+sum );
	}
	System.out.println("The screen that had the highest average tickets per row is:"+bestScreen);
	
	
}
}
