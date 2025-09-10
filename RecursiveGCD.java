/*
Recursive GCD (Euclidean Algorithm)
Implement a recursive method to compute the greatest common divisor (GCD) of two numbers.
Input: gcd(24, 36) → Output: 12
*/

]public class RecursiveGCD {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b); 
    }
    public static void main(String[] args) {
        int a = 24, b = 36;
        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
    }
}
