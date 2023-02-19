import java.util.*;
class SearchX{
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
        System.out.print("Enter no of rows and columns : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Enter the elements row wise:");
        int [][] arr = new int [m][n];
        for(int i=0;i<m;i++){
            for(int j = 0;j<n;j++){
                System.out.print("Enter element no ("+i+","+j+")"+" : ");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j = 0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("\n\nEnter the element you want to search :  ");
        int data = sc.nextInt();
        int pos1=-1,pos2=-1;
        for(int i=0;i<m;i++){
            int x=Binary_Search(arr[i],0,n-1,data);
            if(x!=-1) {
                pos1=x;
                pos2=i;
                break;
            }
        }
        if(pos1!=-1)System.out.println("Using Linear search position in the array : ("+pos2+","+pos1+")");
        else System.out.println("Not present in the array! ");
    }
}