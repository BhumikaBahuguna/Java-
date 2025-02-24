import java.util.*;
public class AllSubstr {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string: ");
        String str=sc.nextLine();
        for(int i=0;i<=str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
                count++;
            }
        }
        System.out.println("total substrings are:" +count);
    }
}
