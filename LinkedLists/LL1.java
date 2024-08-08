import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    public Node InsertAtEnd(Node Head,int data){
        Node newNode = new Node(data);
        if(Head == null){
            Head = newNode;
        }else{
            Node h = Head;
            while(h.next != null){
                h = h.next;
            }
            h.next = newNode;
        }
        return Head;
    }
    public void Display(Node Head){
        Node h = Head;
        while(h != null){
            System.out.printf(h.data + " --> ");
            h=h.next;
        }
        System.out.println();
    }
}
class LL1{
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter number of elements : ");
        int n = sc.nextInt();
        LinkedList list = new LinkedList();
        Node head = new Node(0);
        while(n-- > 0){
            list.InsertAtEnd(head,sc.nextInt());
        }
        list.Display(head.next);
    }
}