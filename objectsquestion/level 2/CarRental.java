import java.util.Scanner;
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;

    CarRental() {
        customerName = "";
        carModel = "Standard";
        rentalDays = 1;
        costPerDay = 1000;
    }

    CarRental(String c, String m, int d, double p) {
        customerName = c;
        carModel = m;
        rentalDays = d;
        costPerDay = p;
    }

    double totalCost() {
	    double k = rentalDays * costPerDay;
        return k;
    }

    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + totalCost());
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("PREM", "BMW", 100, 150000);

        r1.display();
        r2.display();
    }
}