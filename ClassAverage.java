public class ClassAverage {
    public static void main(String[] args) {
        int arr[]={89,67,99,87,34,69,88,100,61,94,98,96,91,33,21};
        double sum=0.0;
        double avg=0.0;
        int min=arr[0],max=arr[0];
        for(int i=0;i<arr.length;i++){
            sum+=i;
            if(arr[i]<min)
                min=arr[i];
            if(arr[i]>max)
                max=arr[i];
        }
        avg=sum/15;
        System.out.println("average is :"+avg);
        System.out.println("min marks are :"+min);
        System.out.println("max marks are :"+max);
    }
}
