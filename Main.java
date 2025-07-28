public class Main {
    public static void main(String[] args) {
        QueueCircularLinkedList queue=new QueueCircularLinkedList();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.display();
        System.out.println();
        queue.dequeue();
        queue.display();
        System.out.println();
        queue.enqueue(6);
        queue.display();
        System.out.println();
        queue.dequeue();
        queue.display();
        System.out.println();
    }
}
