package inheritance.com;

class Device{
    int deviceId;
    String status;

    Device(int deviceId, String status ){
        this.deviceId = deviceId;
        this.status = status;
    }

}

class Thermostat extends Device {
    String temperatureSetting;

    Thermostat(int deviceId, String status, String temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;

    }

    void displayInfo() {
        System.out.println("Device : " + deviceId);
        System.out.println("Status :" + status);
        System.out.println("TemperatureSetting :" + temperatureSetting);
    }
}



public class SmartHomeDevice {
    public static void main(String[]args){
        Thermostat obj = new Thermostat(1109 , "intermidiate","celcius");
        obj.displayInfo();
    }
}
