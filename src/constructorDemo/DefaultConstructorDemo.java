package constructorDemo;

public class DefaultConstructorDemo {
int a=5;
float f=5.05f;
DefaultConstructorDemo(int a,float f){
	System.out.println("from userdefined constructor"+a+" "+f);
	//here only a1 and f1 variables are initialized they are local variable
	//a=a1;
//	f=f1;
	this.a=a;
	this.f=f;
	
}
void prn1() {
	System.out.println("from defaultconstructor demo prin1() method "+a);
	prn2();

}
void prn2() {
	System.out.println("from democonstructor prn2() method "+f);
}
}
