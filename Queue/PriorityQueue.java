package Queue;

import java.util.ArrayList;

class setOfValue{
    int num;
    int priority;

    public setOfValue(int num, int priority) {
        this.num = num;
        this.priority = priority;
    }
}

public class PriorityQueue {
    ArrayList<setOfValue> list=new ArrayList<>();
    public void insert(int num,int priority){
       setOfValue value=new setOfValue(num,priority);
        list.add(value);
    }

    public void remove(){
       int minValue=Integer.MAX_VALUE;
       int minIndex=-1;
        for(int i=0;i< list.size();i++){
          if(list.get(i).priority<minValue){
              minValue=list.get(i).priority;
              minIndex=i;
          }
       }
        list.remove(minIndex);
    }

    public void peek(){
        int minValue=Integer.MAX_VALUE;
        int value=0;
        for(int i=0;i< list.size();i++){
            if(list.get(i).priority<minValue){
                minValue=list.get(i).priority;
                value=list.get(i).num;
            }
        }
        System.out.println(value);
    }

    public void display(){
        for (int i=0;i< list.size();i++){
            System.out.println("Value: "+list.get(i).num+" Priority: "+list.get(i).priority);
        }
        System.out.println();
    }
}
