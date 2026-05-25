package java7_new_features;

import java.io.FileReader;
import java.io.IOException;

public class Newtry {
public static void main(String[] args) {
	try(FileReader fr=new FileReader("data.txt")){
		int i;
		int k=10/0;
		while((i=fr.read())!=-1) {
			System.out.println((char)i);
		}
	}
	catch(IOException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
		System.out.println("Error: "+e);
	}
	catch(Exception e) {
		System.out.println(e);
	}
			
}
}
  