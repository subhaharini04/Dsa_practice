public class Main {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertFirst(9);
        list.display();
        list.insertEnd(2);
        list.insertEnd(3);
        list.insertEnd(4);
        list.insertEnd(5);
        list.insertEnd(6);
        list.display();
        list.insertMiddle(15,3);
        list.display();
        list.deleteMiddle(4);
        list.display();
        System.out.println("position of element : "+ list.search(15));
    }
}
