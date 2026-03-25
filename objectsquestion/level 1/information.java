import java.util.Scanner;
    class employe(){
	String name;
	String id;
	int salary;
	}
	public void info(){
	System.out.println("information of following employe");
	System.out.println(this.name);
	System.out.println(this.id);
	System.out.println(this.salary);
	}
public class information{
	public static void main(String[]args){
	employe e1 = new employe();
	e1.name = "raman";
	e1.id = "bpsrd";
	e1.salary = 50000;
	
	System.out.println(e1.info());
	}
}
 