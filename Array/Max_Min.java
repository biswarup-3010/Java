import java.util.*;
class Max_Min{
    // function for maximum element 
    static int max(int []arr,int n){
        int m = 0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[m]) {
                m = i;
            }
        }
        return arr[m];
    }
    // function for minimum element 
    static int min(int []arr,int n){
        int m = 0;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[m]) {
                m = i;
            }
        }
        return arr[m];
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
            System.out.println();
        }
        System.out.println("Maximum value in the array : "+ max(arr,n));
        System.out.println("Minimum value in the array : "+ min(arr,n));
    }
}