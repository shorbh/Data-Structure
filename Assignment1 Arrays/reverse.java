import java.util.*;
public class reverse{
    static int[] rev(int []x,int n){
        int a=0;
        for(int i=0;i<n/2;i++){
            a=x[i];
            x[i]=x[n-i-1];
            x[n-i-1]=a;
        }
        return x;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();int i,j;
        int x[] = new int[n];
        for(i=0;i<n;i++) x[i] = sc.nextInt();
        x = rev(x,n);
        for(i=0;i<n;i++) System.out.print(x[i] + " ");
    }
}