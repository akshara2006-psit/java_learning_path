package visibility_modifier;

public class Visible {
private int c=30;
int a=25;
protected int p=40;
public int u=20;
public static void main(String[] args) {
	Visible check=new Visible();
	System.out.println(check.a); //default
	System.out.println(check.c); //private
	System.out.println(check.u); //public
	System.out.println(check.p); //protected
}

}

