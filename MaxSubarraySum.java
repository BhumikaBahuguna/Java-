import java.util.Scanner;
public class MaxSubarraySum{
	public static int find(int arr[],int start[],int end[]) {
		int maxsum=Integer.MIN_VALUE ,currentsum=0 ;
		int tempstart=0;
		for(int i=0;i<arr.length;i++) {
			if(currentsum==0) tempstart=i;
			currentsum+=arr[i];
			if(currentsum>maxsum) {
				maxsum=currentsum;
				start[0]=tempstart;
				end[0]=i;
			}
			if(currentsum <0 ) currentsum=0;
		}
		return maxsum;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements :");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int[] start= {0},end= {0};
		int largestsum=find(arr,start,end);
		System.out.print("the largest sum is " +largestsum+" of subarray: [");
		for(int i=start[0];i<=end[0];i++) {
			System.out.print(arr[i]+(i==end[0] ?"":" , "));
		}
		System.out.println("]");
	}
}
