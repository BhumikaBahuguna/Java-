class Demo1 {
    public static void main(String args[]) {
        // Check if a command-line argument is provided
        if (args.length == 0) {
            System.out.println("Error: Please provide a number as a command-line argument.");
            return;
        }

        try {
            // Parse the input number
            int n = Integer.parseInt(args[0]);

            // Check if the number is non-negative
            if (n < 0) {
                System.out.println("Error: Please provide a non-negative integer.");
                return;
            }

            // Calculate factorial
            int f = 1;
            for (int i = n; i > 0; i--) {
                f *= i;
            }

            // Output the result
            System.out.println("Factorial of " + n + " is: " + f);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide a valid integer.");
        }
    }
}
