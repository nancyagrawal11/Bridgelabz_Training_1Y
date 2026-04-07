
import java.util.Scanner;

public static class Question1{
    public void primitiveToWrapper() {
        Scanner sc = new Scanner(System.in);
        IO.println("enter the number :");
        int num1 = sc.nextInt();
        Integer num2 = num1;
        IO.println("primitive:" + num1);
        IO.println("wrapper:" + num2);

    }
}
 public static void main(String[]args) {
    Question1 q1 = new Question1();
    q1.primitiveToWrapper();
}





