package com.ssk.java.dsaprep.recursion.practice;

/*
    Power
		Given a base a and an exponent b. Your task is to find a^b. The value could be large enough. So, calculate a^b % 1000000007.
		Example
			{
			"a": 2,
			"b": 10
			}
			Output:
				1024

		Constraints:
			0 <= a <= 104
			0 <= b <= 109
			a and b together won't be 0
*/

public class Power {
    public static void main(String[] args) {
        Long a=2L , b=10L;

        System.out.println(new Power().getPower(a,b));
    }

    public int getPower(Long a, Long b){
        // base cases
        if(a==0)   return 0;
        if(b==0)   return 1;

        a%=1000000007;
        long output=getPower(a,b/2);
        output=(output*output)%1000000007;
        // if b is odd we will one extra power
        if(b%2!=0)  output=(output*a)%1000000007;
        return (int)output;
    }
}
