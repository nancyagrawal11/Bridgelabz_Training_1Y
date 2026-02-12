import java.util.*;
    class arrayAge{
		public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number of students");
			int n = sc.nextInt();
			int []age = new int[n];
		    for(int i=0;i<n;i++) {
				age[i]=sc.nextInt();
			    if(age[i]>= 18 ){
				System.out.println("the student is eligible for voting");
			    }
			    else if (age<18){
				System.out.println("the student is not  eligible for voting");
			    }
			    else{
				System.out.println(" invalid input ");
			    }
			}
		}
	}
	
			
	   