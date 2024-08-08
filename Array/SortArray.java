import java.util.Vector;
import java.util.Scanner;
class SortAlgo{
    public static void BubbleSort(Vector<Integer>arr,int n){
        for(int i = 0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr.get(i)>arr.get(j)){
                    int temp = arr.get(i);
                    arr.set(i,arr.get(j));
                    arr.set(j,temp);
                }
            }
        }
    }
    public static void SelectionSort(Vector<Integer> arr,int n){
        int minPos = -1;
        for(int i =0;i<n-1;i++){
            minPos = i;
            for(int j=i+1;j<n;j++){
                if(arr.get(minPos)>arr.get(j)) minPos=j;
            }
            int temp = arr.get(i);
            arr.set(i,arr.get(minPos));
            arr.set(minPos,temp);
        }
    }
    public static void InsertionSort(Vector<Integer> arr,int n){
        for(int i=1;i<n;i++){
            int key = arr.get(i);
            int j=i-1;
            for(;j>=0 && arr.get(j)>key;j--){
                arr.set(j+1,arr.get(j));
            }
            arr.set(j+1,key);
        }
    }
    private static int Partition(Vector<Integer> arr,int low,int high){
        int pivot = arr.get(high);
        int i = low;
        for(int j=low;j<high;j++){
            if(arr.get(j)<pivot){
                int temp = arr.get(j);
                arr.set(j,arr.get(i));
                arr.set(i,temp);
                i++;
            }
        }
        int temp = arr.get(i);
        arr.set(i,arr.get(high));
        arr.set(high,temp);
        return i;
    }
    public static void QuickSort(Vector<Integer> arr,int low,int high){
        if(low<high){
            int pivot = Partition(arr,low,high);
            QuickSort(arr,low,pivot-1);
            QuickSort(arr,pivot+1,high);
        }
    }
    private static void Merge(Vector<Integer> arr,int low,int mid,int high){
        int[] current = new int[high - low + 1];
        int i=low,j=mid+1;
        int count=0;
        while(i<=mid && j<=high){
            if(arr.get(i)<arr.get(j)){
                current[count++] = arr.get(i++);
            }
            else{
                current[count++] = arr.get(j++);
            }
        }
        while(i<=mid){
            current[count++] = arr.get(i++);
        }
        while(j<=high){
            current[count++] = arr.get(j++);
        }
        for(int it = 0;it<count;it++){
            arr.set(low+it,current[it]);
        }
    }
    public static void MergeSort(Vector<Integer>arr,int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            MergeSort(arr,low,mid);
            MergeSort(arr,mid+1,high);
            Merge(arr,low,mid,high);
        }
    }
    public static void Display(Vector<Integer> arr){
        System.out.println("Array elements are : ");
        for(int i : arr){
            System.out.printf(i+", ");
        }
    }
}
class SortArray{
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter no of elements : ");
        int n = sc.nextInt();
        Vector<Integer> arr = new Vector<>(n);
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        // SortAlgo.BubbleSort(arr,n) ;
        // SortAlgo.SelectionSort(arr,n) ;
        // SortAlgo.InsertionSort(arr,n) ;
        // SortAlgo.QuickSort(arr,0,n-1); 
        SortAlgo.MergeSort(arr,0,n-1); 
        SortAlgo.Display(arr);
    }
}