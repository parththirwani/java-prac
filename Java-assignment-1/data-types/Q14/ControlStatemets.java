package Q14;

public class ControlStatemets {
    int age;
    public ControlStatemets(int age){
        this.age = age;
    }

    public void setAge(int age){
        System.out.print("Enter you age: ");
        this.age= age;
    }

    public void growingAge(){
        for(; this.age<=18; this.age++){
            if(age<18){
                System.out.println("You are currently underage since your age is "+age);
            }else{
                System.out.println("You are now of legal age since your age is "+age);
            }
        }
    }
    public static void main(String[] args) {
        ControlStatemets person= new ControlStatemets(5);
        person.growingAge();
    }
}

