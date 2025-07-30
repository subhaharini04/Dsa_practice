import Queue.DequeArray;
import Queue.DequeLinkedList;
import Queue.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue queue=new PriorityQueue();
        queue.insert(1,4);
        queue.insert(2,3);
        queue.insert(3,1);
        queue.insert(4,1);
        queue.display();
        queue.peek();
        queue.remove();
        queue.display();
        queue.remove();
        queue.display();
    }
}
