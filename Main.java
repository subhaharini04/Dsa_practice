import Queue.DequeArray;
import Queue.DequeLinkedList;

public class Main {
    public static void main(String[] args) {
        DequeLinkedList queue=new DequeLinkedList();
        queue.insertFront(1);
        queue.insertFront(2);
        queue.display();
        queue.insertEnd(3);
        queue.insertEnd(4);
        queue.display();
        queue.deleteFirst();
        queue.display();
        queue.deleteLast();
        queue.display();
    }
}
