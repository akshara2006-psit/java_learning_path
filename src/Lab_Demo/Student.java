package Lab_Demo;

public class Student {
String name;
int rollNo;
Student(String name,int rollNo){
	this.name=name;
	this.rollNo=rollNo;
}
void printDetails() {
	System.out.println("The name of the student is: "+this.name);
	System.out.println("The roll no of the student is: "+this.rollNo);
}
}
