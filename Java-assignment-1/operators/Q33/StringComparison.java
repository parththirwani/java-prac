package operators.Q33;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

        System.out.println("Using == operator:");
        System.out.println("str1 == str2: " + (str1 == str2));     // true (same reference from string pool)
        System.out.println("str1 == str3: " + (str1 == str3));     // false (new object)

        System.out.println("\nUsing equals() method:");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true (same content)
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true (same content)
    }
}
