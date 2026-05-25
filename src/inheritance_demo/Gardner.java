package inheritance_demo;

public class Gardner extends Employee{
	Gardner(int Gid,String Gname,String Gadd,long Gph,long Gsalary){
		super(Gid,Gname,Gadd,Gph,Gsalary);}
	void toWork() {
		System.out.println(Ename+" is planting trees ");
	}
}
