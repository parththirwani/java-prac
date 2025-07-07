class AnimalClass{
    String name;
    String type;

    public AnimalClass(String name, String type){
        this.name= name;
        this.type = type;
    }

    public void makeSound(){
        System.out.println("Generic animal sound");
    }

    public void Introduction (){
        System.out.println("My name is "+name+" and i am a "+type);
    }
}

class Dog extends AnimalClass{
    
    Dog(String name, String type){
        super(name, type);
    }

    @Override
    public void makeSound(){
        System.out.println("Bhow bhow");
    }
}

class Cat extends AnimalClass{
    Cat(String name, String type){
        super(name, type);
    }
    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
}

public class Animal{
    public static void main(String[] args) {
        AnimalClass dog = new Dog("Rocky", "Dog");
        AnimalClass cat = new Cat("Whiskers", "Cat");

        dog.makeSound();
        dog.Introduction();

        cat.makeSound();
        cat.Introduction();

    }
}
