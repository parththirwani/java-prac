package Q11;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        System.out.println("After appending "+sb);

        sb.replace(6, 11, "java");
        System.out.println("After replacing "+sb);

        sb.delete(6, 11);
        System.out.println("After deleting "+sb);

        sb.insert(6, ",");
        System.out.println("After inserting "+sb);

        sb.reverse();
        System.out.println("After reversing"+sb);

    }
}
