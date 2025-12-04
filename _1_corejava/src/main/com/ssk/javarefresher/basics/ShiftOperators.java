package main.com.ssk.javarefresher.basics;

public class ShiftOperators {
    public static void main(String[] args) {
        int a=0x0005;

        // << - Left Shift Operator : 0000 00101 (5) << 2 == 0001 0100 (20)
        System.out.println(" a << 2 : "+(a<<2) );
        // above result 20 is equavalent to 5*(2^2);

        // >> - Right Shift Operator : 0000 00101 (5) >> 2 == 0000 0001 (1)
        System.out.println(" a >> 2 : "+(a>>2));
        // above result 1 is equavalent to 5/(2^2)

        // >>> - Unsigned right shift operator
        System.out.println(" a >>> 2 : "+(a>>>2));

    }
}
