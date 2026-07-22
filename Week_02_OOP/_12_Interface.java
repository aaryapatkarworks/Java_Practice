interface Bluetooth {

    void connectBluetooth();

}

interface WiFi {

    void connectWiFi();

}

class SmartTV implements Bluetooth, WiFi {

    @Override
    public void connectBluetooth() {

        System.out.println("Bluetooth Connected");

    }

    @Override
    public void connectWiFi() {

        System.out.println("WiFi Connected");

    }

}

public class _12_Interface {

    public static void main(String[] args) {

        SmartTV tv = new SmartTV();

        tv.connectBluetooth();

        tv.connectWiFi();

    }

}