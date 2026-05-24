package visibility_modifier;

public class Main {
public static void main(String[] args) {
	Visible check=new Visible();
	System.out.println(check.a); //default
//	System.out.println(check.c); //private
	System.out.println(check.u); //public
	System.out.println(check.p); //protected
}
}
