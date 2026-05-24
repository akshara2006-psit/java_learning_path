package Practice_Sheet.Arrays;

import java.util.Scanner;

public class Program2 {
public static void main(String[] args) {
	int[][] batches=new int[3][];
	batches[0]=new int[4];
	batches[1]=new int[2];
	batches[2]=new int[5];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<3;i++) {
		for(int j=0;j<batches[i].length;j++) {
			batches[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<3;i++) {
		int sum=0;
		for(int j=0;j<batches[i].length;j++) {
			sum=sum+batches[i][j];
		}
		double avg=sum/batches[i].length;
		System.out.println("The total attendance for "+(i+1)+" batch is "+sum);
		System.out.println("The average weekly attendance of batch "+(i+1)+" is "+avg);
	}
}
}
