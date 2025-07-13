package Q8;

// Interfaces
interface StudentInterface {
    void getRollNo();
}

interface PersonInterface {
    void getAdhar();
}

// Base Human class
class HumanClass {
    String role;
    int expierence;

    public HumanClass(String role, int expierence) {
        this.role = role;
        this.expierence = expierence;
    }

    public void getInfo() {
        System.out.println("The role of the person is " + role + " and has experience of " + expierence + " years.");
    }

    public void setInfo(String role, int expierence) {
        this.role = role;
        this.expierence = expierence;
    }
}

// Employee class with overloaded getInfo
class Employee extends HumanClass {
    public Employee(String role, int expierence) {
        super(role, expierence);
    }

    @Override
    public void getInfo() {
        System.out.println("The person is working as " + role + " and has experience of " + expierence + " years.");
    }

    // Overloaded method
    public void getInfo(String message) {
        System.out.println("Message for employee: " + message);
    }
}

// Student class implementing both interfaces
class Student extends HumanClass implements StudentInterface, PersonInterface {
    int rollNo;
    int adhar;

    // Constructor calls super with default values
    public Student(int rollNo, int adhar) {
        super("Student", 0); // or customize if needed
        this.rollNo = rollNo;
        this.adhar = adhar;
    }

    @Override
    public void getRollNo() {
        System.out.println("The Roll Number of the student is: " + rollNo);
    }

    @Override
    public void getAdhar() {
        System.out.println("The Aadhar number of the student is: " + adhar);
    }

    @Override
    public void getInfo() {
        System.out.println("Student Info - Roll No: " + rollNo + ", Aadhar: " + adhar);
    }
}

// Main class to test all
public class Humans {
    public static void main(String[] args) {
        Employee emp = new Employee("Engineer", 4);
        emp.getInfo();
        emp.getInfo("Excellent performance");

        Student stu = new Student(123, 987654321);
        stu.getInfo();
        stu.getRollNo();
        stu.getAdhar();
    }
}
