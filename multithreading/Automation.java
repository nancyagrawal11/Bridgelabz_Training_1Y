package multithreading;


class Device implements Runnable {
    private String deviceName;
    private int interval;

    public Device(String deviceName, int interval) {
        this.deviceName = deviceName;
        this.interval = interval;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                    "Device: " + deviceName +
                            " | Thread: " + t.getName() +
                            " | Priority: " + t.getPriority() +
                            " | Cycle: " + i +
                            " | Time: " + java.time.LocalTime.now()
            );

            try {
                Thread.sleep(interval); // Sleep based on device interval
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Main class
public class Automation{
    public static void main(String[] args) {


        Thread tempSensor = new Thread(new Device("Temperature Sensor", 5000), "Temp-Thread");
        Thread securityCam = new Thread(new Device("Security Camera", 3000), "Security-Thread");
        Thread lightControl = new Thread(new Device("Light Controller", 4000), "Light-Thread");
        Thread doorMonitor = new Thread(new Device("Door Lock Monitor", 6000), "Door-Thread");


        securityCam.setPriority(Thread.MAX_PRIORITY);
        tempSensor.setPriority(7);
        lightControl.setPriority(5);
        doorMonitor.setPriority(5);


        tempSensor.start();
        securityCam.start();
        lightControl.start();
        doorMonitor.start();


        try {
            tempSensor.join();
            securityCam.join();
            lightControl.join();
            doorMonitor.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}

