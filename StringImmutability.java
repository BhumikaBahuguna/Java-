public class StringImmutability {
    public static void main(String[] args) {
        // Demonstrating String Immutability
        String str1 = "Hello";
        System.out.println("\n------- String  Example -------");
        System.out.println("Original String: " + str1);
        str1.concat(" World"); // Trying to modify the string
        System.out.println("After concat operation: " + str1); // Original string remains unchanged
        // Assigning new value explicitly
        str1 = str1.concat(" World");
        System.out.println("After assigning new value: " + str1); // Now it changes because we reassigned
        System.out.println("\n---- StringBuffer Example ----");
        // Demonstrating StringBuffer Mutability
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Original StringBuffer: " + sb);
        sb.append(" World"); // Modifying StringBuffer in place
        System.out.println("After append operation: " + sb); // Original StringBuffer changes
    }
}
