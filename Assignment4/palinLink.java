import java.util.Scanner;
class Node
{
	int data;
	Node next;
}
public class palinLink
{
	Node head;
	public void create(int n, palinLink o)
	{
		Scanner s = new Scanner(System.in);
		Node tmp = null;
		while(n > 0)
		{
			n--;
			System.out.println("Enter the data to insert");
			int d = s.nextInt();
			Node newnode = new Node();
			Node newnode1 = new Node();
			newnode.data = d;
			newnode1.data = d;
			if(head == null)
			{
				head = newnode;
				tmp = newnode;
			}
			else
			{
				tmp.next = newnode;
				tmp = tmp.next;
			}
			if(o.head == null) o.head = newnode1;
			else
			{
				newnode1.next = o.head;
				o.head = newnode1;
			}
		}
	}
	public void display()
	{
		Node tmp = head;
		while(tmp != null)
		{
			System.out.println(tmp.data + " ");
			tmp = tmp.next;
		}
	}
	public boolean palin(palinLink o)
	{
		Node tmp = o.head,ptr = head;
		while(tmp != null)
		{
			if(tmp.data != ptr.data) return false;
			tmp = tmp.next;
			ptr = ptr.next;
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of list");
		int n = sc.nextInt();
		if(n>0){
		palinLink obj = new palinLink();
		palinLink o = new palinLink();
		obj.create(n,o);
		if(o.palin(obj)) System.out.println("Yes palindrome");
		else System.out.println("Not palindrome");
		}
	}
}