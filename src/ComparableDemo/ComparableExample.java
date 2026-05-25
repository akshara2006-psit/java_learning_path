package ComparableDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	double salary;
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	public String toString() {
		return "ID: "+id+" name: "+name+" salary: "+salary;
		
		
	}
	

public int compareTo(Employee e) {
		return Double.compare(this.salary, e.salary);
	}
}
public class ComparableExample {
public static void main(String[] args) {
	List <Employee> list=new ArrayList<>();
	list.add(new Employee(1,"Tom",15000));
	list.add(new Employee(2,"Harry",40000));
	list.add(new Employee(3,"Jerry",30000));
	list.add(new Employee(4,"Bheem",20000));
	list.add(new Employee(5,"Dora",50000));
	
	System.out.println("----------------------------List of Employee --------------------");
	for(Employee e:list) {
		System.out.println(e);
	}
	
	Collections.sort(list);
	System.out.println("List after sorting-----------");
	for(Employee e:list) {
		System.out.println(e);
	}
	
}
}
