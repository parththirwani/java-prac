interface Printable{
    public void print();
}

interface Showable{
    public void show();
}

class MessageClass implements Printable, Showable{
    public void print(){
        System.out.println("Print func");
    }

    public void show(){
        System.out.println("Show func");
    }
}

public class Message{
    public static void main(String[] args) {
        MessageClass messaege = new MessageClass();
        messaege.show();
        messaege.print();
    }
}