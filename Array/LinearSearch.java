import java.util.*;
class LinearSearch{
    static int Linear_Search(int arr[],int n,int data){
        for(int i=0;i<n;i++){
            if(data==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7},n=7;
        System.out.print("Enter the element you want to search :  ");
        int data = sc.nextInt();
        int pos = Linear_Search(arr,n,data);
        if(pos!=-1)System.out.println("Using Linear search position in the array : "+pos);
        else System.out.println("Not present in the array! ");
    }
}