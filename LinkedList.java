class Node{
    int num;
    Node next;

    public Node(int num) {
        this.num = num;
    }
}
public class LinkedList {
    Node head;
    Node tail;

    public void insert(int num){
        Node node=new Node(num);
        if(head==null){
            head = node;
            return;
        }
        Node current=head;
        while (current.next!=null){
            current=current.next;
        }
        current.next=node;
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
