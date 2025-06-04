import java.util.Scanner;
public class ArrayOperations1{
	public static void CountOcurrences(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			boolean counted=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					counted=true;
					break;
				}
			}
			if(!counted) {
				int count=1;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
					}
				}
				System.out.println(arr[i] +" appears "+ count +" times");
			}
		}
	}
	public static int SecLargest(int arr[]) {
		int largest=arr[0];
		int secondlar=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondlar=largest;
				largest=arr[i];
			}else if(arr[i]>secondlar && arr[i]!=largest) {
				secondlar=arr[i];
			}
		}
		return secondlar;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements :");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Occurences of elements: ");
		CountOcurrences(arr);
		int res=SecLargest(arr);
		System.out.println("Second largest element is: "+res);
	}
}
