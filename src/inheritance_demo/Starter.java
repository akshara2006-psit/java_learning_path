package inheritance_demo;

public class Starter {
public static void main(String[] args) {
	Employee e=new Employee(101,"akshara","ask@123",7895666,150000);
//	Employee e=new Employee();
	System.out.println(e.Ename);
	e.toWork();
	Teacher t1=new Teacher(101,"akshara","ask@123",7895666,150000);
	System.out.println(t1.Ename);
	t1.toWork();
	Gardner g1=new Gardner(101,"akshara","ask@123",7895666,150000);
	System.out.println(g1.Ename);
	g1.toWork();
	PhysicsTeacher pt1=new PhysicsTeacher(101,"akshara","ask@123",7895666,150000);
	System.out.println(pt1.Ename);
	pt1.toWork();
	pt1.check();
	
}
}
