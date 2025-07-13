package Q13;

public class PrimitiveDefaults {
    // Used to store small integers (1 byte). Range: -128 to 127
    byte b;

    // Used for slightly larger integers (2 bytes). Range: -32,768 to 32,767
    short s;

    // Most commonly used integer type (4 bytes). Range: ~ -2 billion to +2 billion
    int i;

    // Used when a wider range than int is needed (8 bytes)
    long l;

    // Used for single-precision floating point numbers (4 bytes)
    float f;

    // Used for double-precision floating point numbers (8 bytes). More precise than float.
    double d;

    // Used to store a single character (2 bytes, uses Unicode)
    char c;

    // Used to store true/false values (1 bit logically, but JVM uses 1 byte)
    boolean bool;

    public void printDefaults() {
        System.out.println("byte: " + b);         // Default: 0
        System.out.println("short: " + s);        // Default: 0
        System.out.println("int: " + i);          // Default: 0
        System.out.println("long: " + l);         // Default: 0L
        System.out.println("float: " + f);        // Default: 0.0f
        System.out.println("double: " + d);       // Default: 0.0d
        System.out.println("char: '" + c + "'");  // Default: '\u0000' (null character)
        System.out.println("boolean: " + bool);   // Default: false
    }

    public static void main(String[] args) {
        PrimitiveDefaults obj = new PrimitiveDefaults(); // Object created to access instance variables
        obj.printDefaults(); // Print default values of all primitive types
    }
}
