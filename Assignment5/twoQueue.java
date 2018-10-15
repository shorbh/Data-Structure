import java.util.*;
public class twoQueue{
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public void push(int data){
        while(!q1.isEmpty()) q2.add(q1.poll());
        q1.add(data);
        while(!q2.isEmpty()) q1.add(q2.poll());
    }
    public void traverse(){
        System.out.println("values in the stack are:");
        while(!q1.isEmpty()) {System.out.println(q1.peek());q1.poll();}
    }
    public static void main(String[] args) {
        System.out.println("enter the size of stack");
        Scanner sc = new Scanner(System.in);
        twoQueue tq = new twoQueue();
        int a =sc.nextInt();
        int b;
        for(int i=0;i<a;i++) {b = sc.nextInt(); tq.push(b);}
        tq.traverse();
    }
}