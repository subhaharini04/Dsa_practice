public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.insertFirst(9);
        list.insertFirst(3);
        list.display();
        list.insertEnd(4);
        list.insertEnd(6);
        list.display();
        list.insertIndex(2,2);
        list.insertIndex(8,4);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.deleteIndex(2);
        list.display();
        list.reverse();
        list.display();
    }
}
