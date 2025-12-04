package main.com.ssk.javarefresher.basics;

public class BitewiseOperators {
    public static void main(String[] args) {

        // considering binary numbers for bitwise operations
        int a = 0x0005, b = 0x0007;

        // & - bitwise AND 0101 & 0111 = 0101
        System.out.println("a & b : "+(a&b));

        // | - bitwise OR 0101 | 0111 = 0111
        System.out.println("a | b : "+(a|b));

        // ^ - bitwise XOR  0101 ^ 0111 = 0010
        System.out.println("a ^ b : "+(a^b));

        // ~ - bitwise COMPLIMENTARY ~0101 = 1010
        System.out.println("~a : "+(~a));
    }
}
