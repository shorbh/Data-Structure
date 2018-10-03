import java.util.Scanner;
public class sort{

	public char[] create(char []a){

		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < a.length; i++){

			a[i] = sc.next().charAt(0);
		}
		return a;
	}
	public void print(char []a){

		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();

	}
	public char[] sortArray(char []a){
		for(int i = 0; i < a.length; i++){

			for(int j = 0; j < a.length-1; j++){
				if(a[j+1] < a[j]){

					char temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}	
			return a;
	}
	public static void main(String args[]){

		sort o = new sort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		char []a = new char[n];
		a = o.create(a);
		a = o.sortArray(a);
		System.out.println("the sorted array is ");
		o.print(a);
	}
}