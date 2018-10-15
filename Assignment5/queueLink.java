import java.util.*;
class queue{
    int data;
    queue next;
    queue(int data){
        this.data = data;
        this.next = null;
    }
}
class Stack1{
	Node top;
	Stack1(){
		top = null;
	}
	public void push(int data){
		Node newnode = new Node();
		newnode.data = data;
		newnode.next = null;
		if(top == null){
			top = newnode;
		}
		else{
			newnode.next = top;
			top = newnode;
		}	

	}
	public void display(){
		Node tmp = top;
		while(tmp != null){
			System.out.print(tmp.data+" ");
			tmp = tmp.next;
		}
	}
	public int pop(){
		if(top == null){
			System.out.println("Underflow");
			return -1;
		}
			int d = top.data;
			top = top.next;
			return d;
	}
}
public class queueLink{
    public queue front;
    public queue rear;
    public queue enquque(queue head){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element");
        queue tmp = new queue(sc.nextInt());
        if(head == null){
            head = tmp;
            front = rear = tmp;
        }
        else{
            rear.next = tmp;
            rear = rear.next;
        }
        return front;
    }
    public queue dequeue(queue head){
        if(head == null){System.out.println("underflow");return head;}
        else{
            front = head.next;
            head = null;
            head = front;
        }
        return front;
    }
    public void display(queue head){
        while(head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static void main(String args[]){
        queue head = null;
        queueLink q = new queueLink();
        char ch = ' ';
        Scanner sc = new Scanner(System.in);
        while(head == null || ch == 'y'){
            head = q.enquque(head);
            System.out.println("want to insert another data y or n");
            ch = sc.next().charAt(0);
        }
        System.out.println("elements in the queue are:");
        q.display(head);
        head = q.dequeue(head);
        System.out.println("after the deleting the element queue are:");
        q.display(head);
        System.out.println("enter the size of stack");
        Stack1 s = new Stack1();
        int a =sc.nextInt();
        for(int i=0;i<a;i++) s.push(sc.nextInt());
        System.out.println("Stack elements are");
        s.display();
        s.pop();
        System.out.println("after deleting the element stack elements are");
        s.display();
    }
}