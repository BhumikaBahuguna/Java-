import java.util.*;
public class ArrayOperations {
    public static void occurences(int arr[]){
        for(int i=0;i<arr.length;i++){
            boolean counted =false;

        for(int j=0;j<i;j++){
            if(arr[i]==arr[j]){
                counted =true;
                break;
            }
        }
        if(!counted){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
            }
        }
        System.out.println(arr[i] +" appears "+count+" times.");
    }
}

}
public static int secLargest(int arr[]){
    int largest=arr[0],secondlargest=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            secondlargest=largest;
            largest=arr[i];
        }
        else if(arr[i]>secondlargest && arr[i]!=largest){
            secondlargest=arr[i];
        }
    }
    return secondlargest;
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size: ");
    int n=sc.nextInt();
    int [] arr=new int[n];
    System.out.println("enter elements: ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("element occurences : ");
    occurences(arr);
    int res=secLargest(arr);
    System.out.println("second largest number:" + res);

}
}
