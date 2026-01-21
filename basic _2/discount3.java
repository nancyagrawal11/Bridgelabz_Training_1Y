
   class Discount3{
   public static void main(String[]args){
   System.out.println("Enter student fees");
   int fees = 125000;
   System.out.println("Enter discount given");
   int discountGiven= 10;
    int  discountAmount  = (fees*discountGiven/(100));
   System.out.println("amount :"+discountAmount);
   int amount = fees - discountAmount;
   System.out.println(amount);
   
   
  
   }
 }