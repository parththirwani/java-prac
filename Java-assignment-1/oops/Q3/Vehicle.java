interface VehicleInterface{
    void start();
    void stop();
}

class Car implements VehicleInterface{
    public void start(){
        System.out.println("The car is starting");
    }
    public void stop(){;
        System.out.println("The car is stopping");
    }
}

class Bike implements VehicleInterface{
    public void start(){
        System.out.println("The Bike is starting");
    }
    public void stop(){
        System.out.println("The Bike is stopping");
    }
}

public class Vehicle{
    public static void main(String[] args){
        VehicleInterface myCar = new Car();
        VehicleInterface myBike = new Bike();

        myBike.start();
        myBike.stop();

        myCar.start();
        myCar.stop();
    }
}