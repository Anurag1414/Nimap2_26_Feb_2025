
abstract class TV {
    abstract void turnOn();
    abstract void turnOff();
    
}

class TVRemote extends TV {
    @Override
    void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}

public class Main {
    public static void main(String[] args) {
        TV remote = new TVRemote();
        remote.turnOn();   
        remote.turnOff();  
    }
}
