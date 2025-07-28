public class CircularQueue {
    int arr[];
    int front;
    int rear;
    int capacity;

    public CircularQueue(int size) {
        arr = new int[size];
        front = -1;
        rear = -1;
        capacity = size;
    }

    public void enqueue(int num) {
        if ((rear + 1 )% capacity == front) {
            System.out.println("Queue is full");
            return;
        }
        if(front==-1 && rear==-1){
          front=rear=0;
        }else {
            rear=(rear + 1) % capacity;
        }
        arr[rear]=num;
    }

    public void dequeue(){
        if(rear==-1||front==-1){
            System.out.println("Queue is empty");
            return;
        }
        if(front==rear){
            front=rear=-1;
        }else{
            front=(front + 1) % capacity;
        }
    }

    public void display(){
        if(rear==-1||front==-1){
            System.out.println("Queue is empty");
            return;
        }
        int i=front;
        while(true){
            System.out.print(arr[i]+"->");
            if(i==rear) break;
            i=(i+1)%capacity;
        }

    }
}
