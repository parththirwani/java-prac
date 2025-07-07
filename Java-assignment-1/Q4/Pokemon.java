package Q4;

class PokemonClass {
    String name;
    String type;

    public PokemonClass(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void introduction() {
        System.out.println("I am a " + name + " and I am of type " + type);
    }

    public void makeSound() {
        System.out.println("No sound");
    }

    // Method overloading example
    public void attack(String move) {
        System.out.println(name + " used " + move + "!");
    }

    public void attack(String move, int power) {
        System.out.println(name + " used " + move + " with power " + power + "!");
    }
}

// Subclass demonstrating overriding
class Pikachu extends PokemonClass {

    public Pikachu(String name, String type) {
        super(name, type);
    }

    // Overriding makeSound()
    @Override
    public void makeSound() {
        System.out.println("Pika pika!");
    }

    // Method overloading in subclass
    public void makeSound(String mood) {
        System.out.println("Pika pika (" + mood + ")!");
    }
}

public class Pokemon {
    public static void main(String[] args) {
        PokemonClass bulbasaur = new PokemonClass("Bulbasaur", "Grass");
        bulbasaur.introduction();
        bulbasaur.makeSound();
        bulbasaur.attack("Vine Whip");
        bulbasaur.attack("Razor Leaf", 60);

        System.out.println("-------------------");

        Pikachu pika = new Pikachu("Pikachu", "Electric");
        pika.introduction();
        pika.makeSound();  
        pika.makeSound("happy"); 
        pika.attack("Thunderbolt");
        pika.attack("Volt Tackle", 90); 
    }
}
