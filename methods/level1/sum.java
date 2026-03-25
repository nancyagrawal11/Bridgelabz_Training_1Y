import java.util.Scanner;
public class NaturalNumbers{
    int sum(int n ){
	System.out.println("sum of n natural numbers is:");
	int add = 0;
	for(int i = 0 ; i<n ; i++){
	add = add+i;
	return add;
	}
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	NaturalNumbers r = new NaturalNumbers();
	r.sum(num);
	}
}
	