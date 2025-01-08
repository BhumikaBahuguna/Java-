import java.util.*;
public class Function11 {

        // Function to compute GCD using Euclidean algorithm
        public static int gcd(int a, int b) {
            // While b is not zero, continue to apply the Euclidean algorithm
            while (b != 0) {
                int temp = b;
                b = a % b;  // Set b to the remainder of a divided by b
                a = temp;   // Set a to the old value of b
            }
            return a;  // When b becomes 0, a contains the GCD
        }
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
        }
    }
