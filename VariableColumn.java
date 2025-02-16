public class VariableColumn {
    public static void main(String[] args) {
        int a[][] = new int[3][]; // Declare a jagged array
        a[0] = new int[2]; // Row 0 has 2 columns
        a[1] = new int[4]; // Row 1 has 4 columns
        a[2] = new int[3]; // Row 2 has 3 columns

        // Filling the array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) { // Use a[i].length for correct column size
                a[i][j] = i + j;
            }
        }

        // Printing the jagged array
        System.out.println("Jagged Array:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
