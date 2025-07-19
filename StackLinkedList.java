class Node2 {
    int num;
    Node2 next;

    public Node2(int num) {
        this.num = num;
    }
}

public class StackLinkedList {
    Node2 top;

    public void push(int num) {
        Node2 node = new Node2(num);
        node.next = top;
        top = node;
    }

    public void pop() {
        if (top == null) {
            System.out.println("Underflow");
            return;
        }
        top = top.next;
    }

    public void peek() {
        if (top == null) {
            System.out.println("Underflow");
            return;
        }
        System.out.println(top.num);
    }

    public void display() {
        if (top == null) {
            System.out.println("Underflow");
            return;
        }
        Node2 temp=top;
        while(temp!=null){
            System.out.print(temp.num+"->");
            temp=temp.next;
        }
        System.out.println("End");

    }
}
