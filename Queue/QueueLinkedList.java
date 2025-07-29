package Queue;

class Node3{
    int data;
    Node3 next;

    public Node3(int data){
        this.data=data;
        this.next=null;
    }
}

public class QueueLinkedList {
    Node3 front=null;
    Node3 rear=null;

    public void enqueue(int num){
        Node3 node=new Node3(num);
        if(rear==null){
            rear=node;
            front=node;
            return;
        }
        rear.next=node;
        rear=node;
    }

    public void dequeue(){
        if(front==null ){
            System.out.println("Queue is empty");
            rear=null;
            return;
        }
        front=front.next;
    }

    public void diplay(){
        if(front==null){
            System.out.println("Queue is empty");
            rear=null;
            return;
        }
        Node3 temp=front;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("rear");
    }
}
