import java.util.*;
class BinarySearch{
    static int Binary_Search(int arr[],int start,int end,int data){
        if(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==data) {
                return mid;
            }
            else if(arr[mid]>data){
                return Binary_Search(arr,mid+1,end,data);
            }
            else {
                return Binary_Search(arr,start,mid-1,data);
            }
        }
        return -1;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7},n=7;
        System.out.print("Enter the element you want to search :  ");
        int data = sc.nextInt();
        int pos = Binary_Search(arr,0,n-1,data);
        if(pos!=-1)System.out.println("Using Linear search position in the array : "+pos);
        else System.out.println("Not present in the array! ");
    }
}