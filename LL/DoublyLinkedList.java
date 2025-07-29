package LL;

class Node1 {
    int data;
    Node1 next;
    Node1 prev;

    public Node1(int data) {
        this.data = data;
    }

    public Node1(int data, Node1 next, Node1 prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

public class DoublyLinkedList {
    Node1 head;
    Node1 tail;
    static int size = 0;

    public void insertFirst(int data) {
        Node1 node = new Node1(data);
        if (head == null) {
            head = node;
            size++;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
        size++;
    }

    public void insertEnd(int data) {
        Node1 node = new Node1(data);
        if (head == null) {
            insertFirst(data);
            return;
        }
        Node1 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        tail = node;
        size++;
    }

    public void insertIndex(int data,int index){
        Node1 node=new Node1(data);
        if(index<0 || index>size){
            System.out.println("Enter the correct Index");
            return;
        }
        if(index==0){
            insertFirst(data);
            return;
        }
        if(index==size){
            insertEnd(data);
            return;
        }
        Node1 temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next.prev=node;
        temp.next=node;
        node.prev=temp;
        size++;
    }

    public void deleteFirst(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        if (head != null) {
            head.prev = null;
        }else {
            tail=null;
        }
        size--;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            size--;
            return;
        }
        Node1 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        tail=tail.prev;
        tail.next=null;
        size--;
    }

    public void deleteIndex(int index){
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }
        if(index==0){
            deleteFirst();
            return;
        }
        if(index==size-1){
          deleteLast();
          return;
        }
        Node1 temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
        size--;
    }
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void reverse(){
        Node1 temp=null;
        Node1 current=head;
        while(current!=null){
            temp=current.prev;
            current.prev=current.next;
            current.next=temp;
            current=current.prev;
        }
        if(temp!=null){
            head=temp.prev;
        }
    }
}
