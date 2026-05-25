package ARRAYS;

public class OneDArray {
	int temp=5;
	int[] temp1=new int[5];
	int[] temp2= {1,4,6,7,8};
	int temp3[]=new int[8];
public static void main(String[] args) {
	OneDArray od1=new OneDArray();
	System.out.println(od1.temp);
	//conventional for loop
	for(int i=0;i<od1.temp1.length;i++) {
		od1.temp1[i]=i+9;
	}
	
	//enhanced for loop or for-each loop
	for(int i:od1.temp1)
		System.out.print(i+" ");
	System.out.println();
	
	for(int i=0;i<od1.temp1.length;i++) {
		System.out.print(od1.temp1[i]+" ");
	}
	System.out.println();
	for(int num:od1.temp2)
		System.out.print(num+" ");
	
}
}
