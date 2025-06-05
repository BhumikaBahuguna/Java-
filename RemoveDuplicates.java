import java.util.Scanner;
public class RemoveDuplicates {
    public static String removeRepeatedChars(String str) {
        StringBuffer result = new StringBuffer();
        boolean[] seen = new boolean[256]; 
        for (char ch : str.toCharArray()) {
            if (!seen[ch]) { 
                result.append(ch);
                seen[ch] = true; 
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String result = removeRepeatedChars(input);
        System.out.println("String after removing repeated characters: " + result);
        sc.close();
    }
}
