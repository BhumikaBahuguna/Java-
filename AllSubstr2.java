import java.util.*;
public class AllSubstr2 {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string: ");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                for(int k=i;k<=j;k++){
                    System.out.print(str.charAt(k));
                }
                System.out.println();
                count++;
            }
        }
        System.out.println("total substrings are:" +count);
    }
}
