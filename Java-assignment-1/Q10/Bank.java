package Q10;

final class BankClass{
    String name;
    float money;
    
    public BankClass(String name, float money){
    this.money= money;
    this.name= name;    
    }

    public final void getInfo(){
        System.out.println("The bank name is "+name+" and they have "+money);
    }    
}


public class Bank {
    public static void main(String[] args) {
        final int money = 100;
        BankClass myBank = new BankClass("HDFC", money);
        myBank.getInfo();
    }
}
