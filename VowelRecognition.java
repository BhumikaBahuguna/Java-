import java.util.*;
public class VowelRecognition {
   public static int countVowelSubstrings(String s) {
        int n = s.length();
        int totalVowelCount = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch=='A' || ch=='E' || ch=='I' || ch=='O' ||ch=='U') {
                // Each character appears in (i + 1) * (n - i) substrings
                totalVowelCount += (i + 1) * (n - i);
            }
        }       
        return totalVowelCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of test cases: ");
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            System.out.println("input "+(i+1) +" string: ");
            String str=sc.nextLine();
            System.out.println(countVowelSubstrings(str));
        }
    }
}

