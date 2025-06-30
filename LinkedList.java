class Node{
    int num;
    Node next;
    public Node(int num) {
        this.num = num;
    }

    public Node(int num, Node next) {
        this.num = num;
        this.next = next;
    }
}
public class LinkedList {
    Node head;
    Node tail;
    static int size=0;


    public void insertFirst(int num){
         Node newNode=new Node(num);
         newNode.next=head;
         head=newNode;
         size++;
    }
public void insertEnd(int num){
        Node newNode=new Node(num);
        if(head==null){
            insertFirst(num);
            return;
        }
            tail.next = newNode;
            tail = newNode;
            size++;
}

public void insertMiddle(int num,int target){
        if(target == 0){
            insertFirst(num);
            return;
        }
        if(size == target){
            insertEnd(num);
            return;
        }
        Node temp=head.next;
        for (int i=1;i<target;i++){
           temp=temp.next;
        }
        Node newNode=new Node(num,temp.next);
        temp.next=newNode;
    size++;
    }

    public void display(){
        if(head==null){
            System.out.println("List Empty");
        }
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.num+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }
}
