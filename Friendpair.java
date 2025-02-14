import java.util.Scanner;
class Friendpair {
    static int sum_of_divisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum + num;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = sc.nextInt();
        int sum1 = sum_of_divisors(num1);
        int sum2 = sum_of_divisors(num2);
        double ratio1 = (double) sum1 / num1;
        double ratio2 = (double) sum2 / num2;
        if (ratio1 == ratio2) {
            System.out.println(num1 + " and " + num2 + " are friendly pairs.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not friendly pairs.");
        }
        if (sum1 > 2 * num1 && sum2 > 2 * num2) {
            System.out.println("Both are abundant numbers.");
        } else {
            System.out.println("Both are not abundant numbers.");
        }

        sc.close();
    }
}
