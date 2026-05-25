package Practice_Sheet.Arrays;

import java.util.Scanner;

public class Program3 {
public static void main(String[] args) {
	int[][] warehouses=new int[4][];
	warehouses[0]=new int[3];
	warehouses[1]=new int[6];
	warehouses[2]=new int[4];
	warehouses[3]=new int[2];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<4;i++) {
		for(int j=0;j<warehouses[i].length;j++) {
			warehouses[i][j]=sc.nextInt();
			
		}
	}
	double maxavg=0;
	int ware=-1;
	for(int i=0;i<4;i++) {
		int sum=0;
		for(int j=0;j<warehouses[i].length;j++) {
			sum=warehouses[i][j];
		}
		System.out.println("The total count for warehouse"+(i+1)+" is "+sum);
		double avg=sum/warehouses[i].length;
		if(avg>maxavg) {
			maxavg=avg;
			ware=i+1;
		}
	}
	System.out.println("The warehouse with the maximum items in a single aisle is "+ware);
}
}
