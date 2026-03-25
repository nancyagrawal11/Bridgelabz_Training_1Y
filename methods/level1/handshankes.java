import java.util.Scanner;
class HandShakes{
       static int  display(int n){
	   System.out.println("number of max handshakes");
	    int ans = (n*(n-1)))/2;
	    return ans;
	    }
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	 if(numberOfStudents < 2){
        System.out.println("At least 2 students are needed for a handshake");
        } else {
	display(a);
	}
}	
	