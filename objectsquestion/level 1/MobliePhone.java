import java.util.Scanner;
    class MobilePhone {
        void info(String brand , String model , int price){
	        System.out.println("brand name: " + itemCode);
            System.out.println("model name: " + itemName);
            System.out.println("Price: " + price);
	    }
		public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String a = "Samsung";
		String b = "S24";
		int c = 85000;
		MobilePhone p1 = new MobilePhone();
		int ans = p1.info(a,b,c);
		System.out.println(ans);
		}
	}	
    