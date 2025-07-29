package Queue;

public class QueueArray {
    int[] arr;
    int front;
    int rear;
    int capacity;

    public QueueArray(int size){
        arr=new int[size];
        front=0;
        rear=-1;
        capacity=size;
    }

    public void enqueue(int num){
        if(rear==capacity-1){
            System.out.println("Queue is overflow");
            return;
        }
        arr[++rear]=num;

    }

    public void dequeue(){
        if(front>rear){
            System.out.println("Queue is underflow");
            return;
        }
        front++;
    }

    public void diplay(){
        if(front>rear){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+"->");
        }
        System.out.println("rear");
    }
}
