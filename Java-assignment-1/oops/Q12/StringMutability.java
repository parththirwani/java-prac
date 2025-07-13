package Q12;

public class StringMutability {
    public static void main(String[] args) {
        String str = new String("Hello");
        
        System.out.println("The orignal string is "+str);
        var mutableStr = str.concat(" World");
        System.out.println("Changed the string to: "+mutableStr);


        if (str.equals(mutableStr)){
            System.out.println("String is mutable");
        }else{
            System.out.println("The string is imutable");
        }
    }

}
