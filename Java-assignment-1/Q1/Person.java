class PersonClass{
    private String name;
    private int age;

    public PersonClass(String name , int age){
        this.name = name;
        this.age= age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age>=0){
            this.age= age;
        }else{
            System.out.println("Age must be a positive number");
        }
    }

}

public class Person {
    public static void main(String[] args) {
        PersonClass p = new PersonClass("Alice", 25);

        System.out.println("The name of the person is: " + p.getName());
        System.out.println("The age of the person is: " + p.getAge());

        p.setName("Parth");
        p.setAge(21);

        System.out.println("The updated name of the person is: " + p.getName());
        System.out.println("The updated age of the person is: " + p.getAge());

        p.setAge(-5);
    }
}