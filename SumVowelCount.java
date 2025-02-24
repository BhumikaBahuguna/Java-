import java.util.*;
public class SumVowelCount {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string: ");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                String s1=str.substring(i,j+1);
                for(int k=0;k<s1.length();k++){
                char ch =s1.charAt(k);
                    if(ch =='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'
                       || ch=='A' || ch=='E' || ch=='I' || ch=='O' ||ch=='U')
                    sum+=1;
                }
            }
        }
        System.out.println("total sum of vowels are: "+ sum);
    }
}
