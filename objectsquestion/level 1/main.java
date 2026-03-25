import java.util.Scanner;
    class circle{
	public double area(double r){
		System.out.println("area of circle is:");
	double ans = 3.14*r*r;
    return ans;
	public class circumference(double r){
		System.out.println("circumference of circle is:");
		double answer = 2*3.14*r;
		return answer;
	}
public class main{
	public static void main(String[]args){
	circle obj = new circle();
	Scanner sc = new Scanner(System.in);
	double radius = sc.nextDouble();
	
	System.out.println(obj.area(radius));
	
	System.out.println(obj.circumference(radius));
	}
}
	
