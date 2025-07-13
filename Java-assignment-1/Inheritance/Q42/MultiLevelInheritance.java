package Inheritance.Q42;

class Animals{
    String name;
    int age;

    Animals(String name, int age){
        this.name= name;
        this.age= age;
        System.out.println("The animal name is "+name+" and age is "+age);
    }
}

class Dog extends Animals{
    String sound;

    Dog(String sound, String name, int age){
        super(name, age);
        this.sound= sound;
        System.out.println("The animal name is "+name+" and age is "+age+" and makes "+sound+" sound");
    }
}

class Husky extends Dog{
    String type;
    Husky(String sound, String name, int age, String type){
        super(sound, name, age);
        this.type= type;
        System.out.println("The animal name is "+name+" with type "+type+" and age is "+age+" and makes "+sound+" sound");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Husky husky = new Husky("Woof Woof", "Snowy", 2, "Brown");
    }
    
}
