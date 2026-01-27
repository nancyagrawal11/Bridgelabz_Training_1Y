import java.util.Scanner;
    class percentage{
		public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the marks of physics");
			int physics = sc.nextInt();
			System.out.println("enter the marks of chemistry");
			int chemistry = sc.nextInt();
			System.out.println("enter the marks of maths");
			int maths = sc.nextInt();
			int totalMarks = 150;
			int sum = physics + chemistry + maths;
			double average = sum / 3;
			System.out.println("the average of marks is :"+average);
			double percentage = (sum / totalMarks)*100;
			System.out.println("the percentage is :"+percentage);
			if(percentage<=39%){
				System.out.println("the grade is F--);
			}
			else if(percentage>40% && percentage<49%){
				System.out.println("the grade is E");
			}
			else if(percentage>50% && percentage<59%){
				System.out.println("the grade is D");
			}
			else if(percentage>60% && percentage<69%){
				System.out.println("the grade is C");
			}
			else if(percentage>70% && percentage<79%){
				System.out.println("the grade is B");
			}
			else if(percentage>80% && percentage<100%){
				System.out.println("the grade is A");
			}
			else{
				System.out.println("fail");
			}
		}
	}