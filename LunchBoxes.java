import java.util.Scanner;
public class LunchBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases: ");
        int T = sc.nextInt();
        while (T-- > 0) {
            System.out.println("Enter total lunch boxes and number of schools: ");
            int N = sc.nextInt(); 
            int M = sc.nextInt();  
            int[] requirements = new int[M];
            for (int i = 0; i < M; i++) {
                requirements[i] = sc.nextInt();
            }
            for (int i = 0; i < M - 1; i++) {
                for (int j = i + 1; j < M; j++) {
                    if (requirements[i] > requirements[j]) {
                        int temp = requirements[i];
                        requirements[i] = requirements[j];
                        requirements[j] = temp;
                    }
                }
            }
            int count = 0, totalUsed = 0;
            for (int i = 0; i < M; i++) {
                if (totalUsed + requirements[i] <= N) {
                    totalUsed += requirements[i];
                    count++;
                } else {
                    break; 
                }
            }
            System.out.println("Maximum schools that can receive lunch boxes: " + count);
        }
        sc.close();
    }
}
