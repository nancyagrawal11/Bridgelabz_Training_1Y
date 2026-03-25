import java.util.Scanner;
class SimpleInterest{
        double display(double principle , double time, int rate){
	    double si = principle*rate*time/100;
	    return si;
	    }
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	double c = sc.nextDouble();
	SimpleInterset obj = new SimpleInterest();
	obj.display(a,b,c);
	}
}
	
