import java.util.Scanner;
    class friends{
	    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age of amar");
		int age1 = sc.nextInt();
		System.out.println("enter age of akbar");
		int age2 = sc.nextInt();
		System.out.println("enter age of anthony");
		int age3 = sc.nextInt();
		System.out.println("enter height of amar");
		double height1 = sc.nextDouble();
		System.out.println("enter height of akbar");
		double height2 = sc.nextDouble();
		System.out.println("enter height of anthony");
		double height3 = sc.nextDouble();
		    if(age1<age2 && age1<age3){
		    System.out.println("the youngest is amar");
			}
		    else if(age2<age1 && age2<age3){
		    System.out.println("the youngest is akbar");
			}
		    else if(age3<age1 && age3<age2){
		    System.out.println("the youngest is anthony");
			}
			else{
			System.out.println("all are equal in age");
			}
		    if(height1>height2 && height1>height3){
			System.out.println("tallest is amar");
		    }
		    else if(height2>height1 && height2>height3){
		    System.out.println("tallest is akbar");
		    }
		    else if(height3>height1 && height3>height2){
		    System.out.println("tallest is anthony");
		    }
		    else{
			System.out.println("all are equal in height");
		    }
		}
	}
		
		