package instanceBlock;

public class MethodDemo {
private int a,b;
//MethodDemo(int a,int b){
//	this.a=a;
//	this.b=b;
//}
int getA() {
	return a;
}
void setA(int a) {
	this.a=a;
}
int getB() {
	return b;
}
void setB(int b) {
	this.b=b;
}
int add(int a,int b) {
	return a+b;
}
//MethodDemo add(int a,int b) {
//	return new MethodDemo();
//}
//MethodDemo add(ABC a,ABC b) {
//	return new MethodDemo();
//}
int sub(int a,int b) {
	return a-b;
}
int mul() {
	int mul=a*b;
	return mul;
	
}

//public static void main(String[] args) {
//	MethodDemo s1=new MethodDemo(12,8);
//	s1.add(12, 8);
//	s1.sub(12, 8);
//	
//}
}
