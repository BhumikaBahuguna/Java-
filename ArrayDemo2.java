import java.util.*;
public class ArrayDemo {
	void arrayFunc(int arr[],int target) {
		System.out.println("pairs whose sum is "+ target+" are : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(arr[i]+ " + "+arr[j]+" = "+ target);
				}
			}
		}
	}
	void arrayFunc(int a[],int p,int b[],int q) {
		int mergedsize=p+q;
		int [] mergedarray=new int[mergedsize];
		System.arraycopy(a, 0, mergedarray, 0, p);
		System.arraycopy(b, 0, mergedarray, p, q);
		Arrays.sort(mergedarray);
		System.arraycopy(mergedarray, 0, a, 0, p);
		System.arraycopy(mergedarray, p,b, 0, q);
		System.out.println("Sorted Arrays:");
		System.out.println("a: " + Arrays.toString(a));
		System.out.println("b: " + Arrays.toString(b));
	}
	public static void main(String[] args) {
		 ArrayDemo obj = new ArrayDemo();
	        int[] numbers = {4, 6, 5, -10, 8, 5, 20};
	        int target = 10;
	        obj.arrayFunc(numbers, target);
	        int[] a = {1, 5, 6, 7, 8, 10};
	        int[] b = {2, 4, 9};
	        obj.arrayFunc(a, a.length, b, b.length);
	    }
	}
