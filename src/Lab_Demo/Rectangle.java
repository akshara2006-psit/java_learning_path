package Lab_Demo;

public class Rectangle {
int length;
int width;
Rectangle(int length,int width){
	this.length=length;
	this.width=width;
}
void area() {
	int a=this.length*this.width;
	System.out.println("The area of the rectangle is: "+a);
}
}
