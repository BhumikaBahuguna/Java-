class BubbleSort{
    void bubbleSort(int a[]){
    int n=a.length;
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
}
void printArray(int a[]){
    int n=a.length;
    for(int i=0;i<n;i++){
        System.out.println(a[i]+" ");
    }
}
public static void main(String args[]){
    int a[]={3,8,6,5,12,87,56};
    BubbleSort ob=new BubbleSort();
    ob.bubbleSort(a);
    System.out.println("sorted array");
    ob.printArray(a);
}
}