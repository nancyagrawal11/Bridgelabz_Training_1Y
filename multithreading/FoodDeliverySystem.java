package multithreading;

// Order class
class Order {
    private int orderId;
    private String restaurantName;
    private int deliveryTime; // in seconds
    private String deliveryType;

    public Order(int orderId, String restaurantName, int deliveryTime, String deliveryType) {
        this.orderId = orderId;
        this.restaurantName = restaurantName;
        this.deliveryTime = deliveryTime;
        this.deliveryType = deliveryType;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public String getDeliveryType() {
        return deliveryType;
    }
}

// Runnable class
class DeliveryAgent implements Runnable {
    private Order order;

    public DeliveryAgent(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();

        long startTime = System.currentTimeMillis();

        try {
            System.out.println("Agent: " + t.getName() +
                    " | Order ID: " + order.getOrderId() +
                    " | Restaurant: " + order.getRestaurantName() +
                    " | Type: " + order.getDeliveryType() +
                    " | Status: Picked Up");

            Thread.sleep(order.getDeliveryTime() * 1000);

            System.out.println("Agent: " + t.getName() +
                    " | Order ID: " + order.getOrderId() +
                    " | Status: In Transit");

            Thread.sleep(1000); // small delay

            System.out.println("Agent: " + t.getName() +
                    " | Order ID: " + order.getOrderId() +
                    " | Status: Delivered");

        } catch (InterruptedException e) {
            System.out.println(e);
        }

        long endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime) / 1000;

        System.out.println("Order " + order.getOrderId() +
                " completed in " + totalTime + " seconds\n");
    }
}

// Main class
public class FoodDeliverySystem {
    public static void main(String[] args) {

        // Creating orders
        Order o1 = new Order(101, "Pizza Hut", 3, "Express");
        Order o2 = new Order(102, "Dominos", 5, "Standard");
        Order o3 = new Order(103, "KFC", 4, "Economy");
        Order o4 = new Order(104, "Burger King", 2, "Express");
        Order o5 = new Order(105, "Subway", 6, "Standard");

        // Creating threads
        Thread t1 = new Thread(new DeliveryAgent(o1), "Agent-1");
        Thread t2 = new Thread(new DeliveryAgent(o2), "Agent-2");
        Thread t3 = new Thread(new DeliveryAgent(o3), "Agent-3");
        Thread t4 = new Thread(new DeliveryAgent(o4), "Agent-4");
        Thread t5 = new Thread(new DeliveryAgent(o5), "Agent-5");

        // Setting priorities
        t1.setPriority(Thread.MAX_PRIORITY); // Express (10)
        t4.setPriority(Thread.MAX_PRIORITY); // Express (10)

        t2.setPriority(Thread.NORM_PRIORITY); // Standard (5)
        t5.setPriority(Thread.NORM_PRIORITY); // Standard (5)

        t3.setPriority(3); // Economy (3)

        // Start threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // Wait for completion
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("All orders delivered successfully!");
    }
}
