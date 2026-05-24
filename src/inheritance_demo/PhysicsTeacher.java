package inheritance_demo;

public class PhysicsTeacher extends Teacher{
	PhysicsTeacher(int Pid,String Pname,String Padd,long Pph,long Psalary){
		super(Pid,Pname,Padd,Pph,Psalary);
		
	}
	//overrided method
	void toWork() {
		super.toWork();
		System.out.println(Ename+" is physics teacher");
	}
	//static methods can not be overrided
	static void check() {
		System.out.println("from PhysicsTeacher  check");
	}
}
