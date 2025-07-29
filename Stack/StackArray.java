package Stack;

public class StackArray {
    int[] arr;
    int top;
    int capacity;

    public StackArray(int size) {
        arr=new int[size];
        top=-1;
        capacity=size;
    }

    public void push(int num){
        if(top==capacity-1){
            System.out.println("Stack overflow");
            return;
        }
        arr[++top]=num;
    }

    public void pop(){
        if(top==-1){
            System.out.println("Stack underflow");
        }
        top--;
    }
    public void topElement() {
        System.out.println(arr[top]);
    }

    public void display(){
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+"->");
        }
        System.out.println("top");
    }
}
