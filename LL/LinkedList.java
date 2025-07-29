package LL;

class Node {
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
    static int size = 0;

    //INSERTION OF NODE
    public void insertFirst(int element) {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertEnd(int element) {
        Node newNode = new Node(element);
        if (head == null) {
            insertFirst(element);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }

    public void insertMiddle(int element, int target) {
        if (target == 0) {
            insertFirst(element);
            return;
        }
        if(target>=size){
            insertEnd(element);
            return;
        }
        Node newNode = new Node(element);
        Node temp = head;
        for (int i = 0; i < target - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    //DELETION
    public void deleteFirst() {
        head = head.next;
        if(head==null){
            tail=null;
        }
        size--;
    }

    public void deleteEnd() {
        if (head == null) {
            System.out.println("List is already empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            size--;
            return;
        }
       Node temp=head;
       while(temp.next.next!=null){
           temp=temp.next;
       }
       temp.next=null;
       tail=temp;
       size--;
    }

    public void deleteMiddle(int target){
        if (target < 0 || target >= size) {
            System.out.println("Invalid index.");
            return;
        }

        if (target == 0) {
            deleteFirst();
            return;
        }
        Node temp=head;
        for(int i=0;i<target-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }

    //SEARCH

    public int search(int element){
        Node temp=head;
        int i=0;
        while(temp!=null) {
            if (temp.num == element) {
                return i;
            } else {
                temp = temp.next;
                i++;
            }
        }
        return 0;
    }

    public void reverse(){

    }

    public void display() {
        if (head == null) {
            System.out.println("List Empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.num + "->");
            temp = temp.next;
        }
        System.out.println("End");
        System.out.println("Current Size:" + size);
    }
}
