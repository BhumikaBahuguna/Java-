import java.util.Scanner;

public class MostOccuring {
    public static int mostoccur(int arr[]){
        int maxcount=0;
        int mostoccuring=arr[0];
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>maxcount){
                maxcount=count;
                mostoccuring=arr[i];
            }
        }
        return mostoccuring;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=mostoccur(arr);
        System.out.println("most occuring element is : "+result);
    }
}
