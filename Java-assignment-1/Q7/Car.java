package Q7;

public class Car {
    public static void main(String[] args) {
        AllCars GenericCar = new AllCars("Seltos", "Kia");
        GenericCar.getCarInfo();

        BMW Z5 = new BMW("Z5");
        Z5.getCarInfo();
        System.out.println(Z5.getBrand());
    }
}
class AllCars{
    String name;
    String brand;

    public AllCars(String name , String brand){
        this.name= name;
        this.brand= brand;
    }

    public AllCars(String name)
    {
        this.name = name;
    }

    public String getBrand(){
        return this.brand;
    }

    public void getCarInfo(){
        System.out.println("The car name is "+name+" and the brand is "+brand);
    }
}

class BMW extends AllCars{
    BMW(String name){
        super(name);
    }

    public void getCarInfo(){
        System.out.println("The car name is "+name+" and the brand is BMW");
    }
}


