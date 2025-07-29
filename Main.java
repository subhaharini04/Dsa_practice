import Queue.DequeArray;

public class Main {
    public static void main(String[] args) {
        DequeArray queue=new DequeArray(5);
        queue.insertFront(1);
        queue.insertFront(2);
        queue.display();
        System.out.println();
        queue.insertEnd(3);
        queue.insertEnd(4);
        queue.display();
        System.out.println();
        queue.deleteFirst();
        queue.display();
        System.out.println();
        queue.deleteLast();
        queue.display();
    }
}
