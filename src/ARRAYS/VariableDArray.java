package ARRAYS;

public class VariableDArray {
	int temp=5;
	int[][] temp1=new int[3][];					//variable dimension array or jagged array
	int[][] temp2= {{1,4,6,7,8},{11,13,45,67,56},{1,4,5,6}};
	int temp3[]=new int[8];
public static void main(String[] args) {
	VariableDArray od1=new VariableDArray();
	System.out.println(od1.temp);
	od1.temp1[0]=new int[4];												//multidimensional array is colllection of references/multidimensional array is array of objects
	od1.temp1[1]=new int[6];																		//here temp1 is reference variable
	od1.temp1[2]=new int[2];
	//conventional for loop
	for(int i=0;i<od1.temp1.length;i++) {
		for(int j=0;j<od1.temp1[i].length;j++) {
			od1.temp1[i][j]=i+j+1;
		}
		
	}
	
	
	
	for(int i=0;i<od1.temp1.length;i++) {
		for(int j=0;j<od1.temp1[i].length;j++)
		System.out.print(od1.temp1[i][j]+" ");
		System.out.println();
	}
	System.out.println();

	
}
}
