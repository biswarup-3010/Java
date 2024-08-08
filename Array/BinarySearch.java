import java.util.Scanner;
import java.util.Vector;
class BinarySearch{
    private static int BS(Vector<Integer> arr,int low,int high,int target){
        if(low<high){
            int mid = (low+high)/2;
            if(arr.get(mid)==target) return mid;
            else if(arr.get(mid) > target) return BS(arr,low,mid-1,target);
            return BS(arr,mid+1,high,target);
        }
        return -1;
    }
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        Vector<Integer> arr = new Vector<>();
        for (int i = 1; i <= 10; i++) {
            arr.add(i);
        }
        System.out.print("Enter value for searching : ");
        int n = sc.nextInt();
        System.out.println("Position : "+BS(arr,0,10,n));
    }
}