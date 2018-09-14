import java.util.*;
public class maxElement{
    static int calMax(int x[],int a){
        int c=x[0];
        for(int i=0;i<a;i++) if(x[i]>c) c=x[i];
        return c;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();int b = 0;
        int x[] = new int[a];
        for(int i=0;i<a;i++) x[i] = sc.nextInt();
        b = calMax(x,a);
        System.out.println("Maximum Element in array is : "+b);
    }
}