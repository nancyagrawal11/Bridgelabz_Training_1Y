package inheritance.com;

class Order{
    int orderId;
    int orderDate;

    Order(int orderId , int orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }


}

class ShippedOrder extends Order{
    int trackingNumber ;

    ShippedOrder(int orderId , int orderDate , int trackingNumber ) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }



}
class DeliverOrder extends ShippedOrder{
    int deliveryDate;

    DeliverOrder( int orderId , int orderDate, int trackingNumber,int deliveryDate){
        super(orderId, orderDate , trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    void displayInfo() {
        System.out.println("orderId : " + orderId);
        System.out.println("orderDate :" + orderDate);
        System.out.println("TrackingNumber :" +trackingNumber  );
        System.out.println("DeliveryDate :" +deliveryDate );
    }
}

public class OrderMangament {
  public   static void  main(String[]args) {
      DeliverOrder obj = new DeliverOrder(2544,250326,5648,280326);
      obj.displayInfo();
  }

}
