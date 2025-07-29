package Queue;

class Node4 {
    int data;
    Node4 next;

    public Node4(int data) {
        this.data=data ;
        next = null;
    }
}

public class QueueCircularLinkedList {
    Node4 front = null;
    Node4 rear = null;

    public void enqueue(int num) {
        Node4 node = new Node4(num);
        if (rear == null || front == null) {
            rear = front = node;
            rear.next = front;
        } else {
            rear.next = node;
            rear = node;
            rear.next = front;
        }
    }

    public void dequeue(){
        if(rear == null || front == null){
            System.out.println("Queue is empty");
            return;
        }
        if(front==rear){
            front=rear=null;
        }else{
            front=front.next;
            rear.next=front;
        }
    }

    public void display(){
        if(rear==null||front==null){
            System.out.println("Queue is empty");
            return;
        }
        Node4 temp = front;
        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while (temp != front);
    }
}
