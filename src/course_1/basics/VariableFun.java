package course_1.basics;

public class VariableFun {
    public static void main(String[] args) {
        int age; // declaration
        age = 33; // initialization

        // Variables:
        byte var1 = 10;
        short var2 = 10;
        int var3 = 10;
        long var4 = 10;
        float var5 = 10;
        double var6 = 10;
        boolean var7 = true;
        boolean var8 = false;
        char var9 = 'A';
        String var10 = "Hello World";

        // Constants:
        final byte CONST_VAR1 = 10;
        final short CONST_VAR2 = 10;
        final int CONST_VAR3 = 10;
        final long CONST_VAR4 = 10;
        final float CONST_VAR5 = 10;
        final double CONST_VAR6 = 10;
        final boolean CONST_VAR7 = true;
        final boolean CONST_VAR8 = false;
        final char CONST_VAR9 = 'A';
        final String CONST_VAR10 = "Hello World";

        System.out.println(var1);
        System.out.println(CONST_VAR1);

        // Type Casting (narrowing and widening
        double myDouble = 3.14;
        float myFloat;
        double yourDouble;

        myFloat = (float) myDouble; // narrowing/lossy conversion
        yourDouble = myFloat; // widening/lossless conversion

        System.out.println(yourDouble);
    }
}