package ARRAYS;

public class TwoDArray {
	int temp=5;
	int[][] temp1=new int[5][4];
	int[][] temp2= {{1,4,6,7,8},{11,13,45,67,56},{1,4,5,6}};
	int temp3[]=new int[8];
public static void main(String[] args) {
	TwoDArray od1=new TwoDArray();
	System.out.println(od1.temp);
	//conventional for loop
	for(int i=0;i<od1.temp1.length;i++) {
		for(int j=0;j<od1.temp1[i].length;j++) {
			od1.temp1[i][j]=i+9;
		}
		
	}
	
	//enhanced for loop or for-each loop
//	for(int i:od1.temp1.length)
//		System.out.print(i+" ");
//	System.out.println();
	
	for(int i=0;i<od1.temp1.length;i++) {
		for(int j=0;j<od1.temp1[i].length;j++)
		System.out.print(od1.temp1[i][j]+" ");
		System.out.println();
	}
	System.out.println();
//	for(int num:od1.temp2)
//		System.out.print(num+" ");
	for(int i=0;i<od1.temp2.length;i++) {
		for(int j=0;j<od1.temp2[i].length;j++)
		System.out.print(od1.temp2[i][j]+" ");
		System.out.println();
	}
	
}
}
