package out.gla;

import out.gla.DefaultInterface.CreditCard;
import out.gla.DefaultInterface.Payment;
import out.gla.DefaultInterface.UPI;
import out.gla.DefiningAndImplementingInterfaces.AirConditioner;
import out.gla.DefiningAndImplementingInterfaces.Light;
import out.gla.DefiningAndImplementingInterfaces.SmartDevice;
import out.gla.DefiningAndImplementingInterfaces.Television;
import out.gla.FunctionalInterfaces.TemperatureService;
import out.gla.MarkerInterface.BackupService;
import out.gla.MarkerInterface.TempData;
import out.gla.MarkerInterface.UserData;
import out.gla.StaticMethodInterfaces.Security;

public class Runner {
    public static void main(String[] args) {

        SmartDevice device1 = new Light();
        SmartDevice device2 = new AirConditioner();
        SmartDevice device3 = new Television();
        device1.turnOn();
        device2.turnOn();
        device3.turnOn();

        device1.turnOff();
        device2.turnOff();
        device3.turnOff();


        double[] readings = {24.5, 28.0, 31.2, 35.6, 29.0};

        TemperatureService service = new TemperatureService(30.0);

        service.checkTemperature(readings);


        String password = "Insure@123";


        boolean result = Security.isStrongPassword(password);

        if (result)
            System.out.println("Password is strong.");
        else
            System.out.println("Password is weak.");


        Payment credit = new CreditCard();
        Payment upi = new UPI();

        credit.processPayment(1000);
        credit.refund(200);

        upi.processPayment(500);
        upi.refund(100);


        UserData user = new UserData("Rahul", "rahul@mail.com");
        TempData session = new TempData("ABC123");

        BackupService.processBackup(user);
        BackupService.processBackup(session);
    }
}