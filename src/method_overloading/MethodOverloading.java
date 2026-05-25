package method_overloading;

public class MethodOverloading {
	 int add(int a, int b) {
	        return a + b;
	    }

	    double add(double a, double b) {
	        return a + b;
	    }
	    
	    void show(int a) {
    	    System.out.println("int method");
    	}

    	void show(double a) {
    	    System.out.println("double method");
    	}
	    public static void main(String args[]) {
	    	MethodOverloading calc=new MethodOverloading();
	    	System.out.println(calc.add(10,10));
	    	calc.show(10);      
	    	calc.show(10.5);    

	    }
}
