package main.com.ssk.java.basics;

public class RelationalOperator {
    public static void main(String[] args) {
        boolean condition=true;
        int a=20,b=10;
        int aArr[]={1,2,3},bArr[]={1,2,3};
        // == : Equalts to
        System.out.println("condition == true : "+(condition==true));
        // Arrays cannot be compared with relation oprators because object store ref not values.
        System.out.println("aArr == bArr : "+(aArr==bArr));

        // > : Greater than
        System.out.println("a > b : "+(a>b));

        // < : Less than
        System.out.println("a < b : "+(a<b));

        // != : Not Equals to
        System.out.println("a != b : "+(a!=b));

        // <= : Less than or Equalts to
        System.out.println("a < b : "+(a<=b));

        // >= : Greater than or Equalts to
        System.out.println("a > b : "+(a>=b));

    }
}
