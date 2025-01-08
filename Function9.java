import java.util.*;
public class Function9 {
    public static void voteEliigible(int age){
        if(age>18){
            System.out.println("eligible to vote");
        }else{
            System.out.println("not eligible to vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        voteEliigible(age);
    }
}
