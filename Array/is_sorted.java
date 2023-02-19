import java.util.*;
class is_sorted{
    // function for checking the array is sorted in ascending order or descending order or not
    static boolean is_sort_A(int []arr, int n){
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]) { 
                return false;
            }
        }
        return true;
    }
    static boolean is_sort_D(int []arr, int n){
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]) { 
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements :");
        int [] arr = new int [n];
        for(int i = 0; i<n;i++){
            System.out.print("Enter element no "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        if(is_sort_A(arr,n)) {
            System.out.println("Sorted array in Ascending order");
        }
        else if(is_sort_D(arr,n)) {
            System.out.println("Sorted array in Descending order");
        }
        else {
            System.out.println("Unsorted array");
        }
    }
}