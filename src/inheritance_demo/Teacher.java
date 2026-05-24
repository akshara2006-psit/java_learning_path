package inheritance_demo;

public class Teacher extends Employee{

	Teacher(int Tid,String Tname,String Tadd,long Tph,long Tsalary){
		super(Tid,Tname,Tadd,Tph,Tsalary);
		
	}
	void toWork() {
		super.toWork();
		System.out.println(Ename+" is teaching");
	}
	static void check() {
		System.out.println("from Teacher check");
	}
}
