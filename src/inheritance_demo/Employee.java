package inheritance_demo;

public class Employee {
	int Eid;
String Ename;
String Eadd;
long Eph;
long Esalary;
Employee(	int Eid,
String Ename,
String Eadd,
long Eph,
long Esalary){
	this.Eid=Eid;
	this.Ename=Ename;
	this.Eadd=Eadd;
	this.Eph=Eph;
	this.Esalary=Esalary;
}
void toWork() {
	System.out.println("to work");
}
static void check() {
	System.out.println("from Employee check");
}

}
