import java.util.Scanner;
public class marksloop{
	public static void main(Sting[]args){
		for(int i=1;i>=10;i++){
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		System.out.println(marks);
		if(marks<50){
			System.out.println("fail");
		}
		else if(marks>=50 && marks<60){
			System.out.println("D");
		}
			else if(marks>=60 && marks<70){
			System.out.println("C");
			}
			else if(marks>=70 && marks<80){
			System.out.println("A");
			}
			}
			else if(marks>=80 && marks<90){
			System.out.println("O");
			}
			else if(marks>=90 && marks<100){
			System.out.println("O+");
			}
			else{
				System.out.println("invalid output");
			}
	}
}	
			
			