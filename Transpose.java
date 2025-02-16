public class Transpose {
    public static void main(String[] args) {
        int a1[][] = new int[3][4];
        int a2[][] = new int[4][3];
        int count = 0;

        // Filling the matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                a1[i][j] = count++;
                System.out.print(a1[i][j] + " ");
            }
            System.out.println();
        }

        // Transposing the matrix
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                a2[j][i] = a1[i][j];
            }
        }

        // Printing the transposed matrix
        System.out.println("\nTransposed Matrix:");
        for (int i = 0; i < a2.length; i++) {  // Use `a2.length`, which is 4
            for (int j = 0; j < a2[i].length; j++) { // Use `j++`, not `i++`
                System.out.print(a2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
