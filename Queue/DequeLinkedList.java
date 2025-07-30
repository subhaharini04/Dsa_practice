package Queue;

class Node5 {
    int data;
    Node5 next, prev;

    public Node5(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}

public class DequeLinkedList {
    Node5 front = null, rear = null;

    public void insertFront(int data) {
        Node5 node = new Node5(data);
        if (front != null || rear != null) {
            front.prev = node;
            node.next = front;
            front = node;
        } else {
            front = rear = node;
        }
    }

    public void insertEnd(int data) {
        Node5 node = new Node5(data);
        if (front != null || rear != null) {
            rear.next = node;
            node.prev = rear;
            rear = node;
        } else {
            front = rear = node;
        }
    }

    public void deleteFirst() {
        if (rear == null || front == null) {
            System.out.println("Queue is empty");
            return;
        }if(front==rear){
            front=rear=null;
        }else {
            front = front.next;
            front.prev = null;
        }
    }

    public void deleteLast() {
        if (rear == null || front == null) {
            System.out.println("Queue is empty");
            return;
        }
        if(front==rear){
            front=rear=null;
        }else {
            rear = rear.prev;
            rear.next = null;
        }
    }

    public void display() {
        Node5 temp = front;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

}
