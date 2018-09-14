import java.util.*;
public class wave{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();int i,j;
        int x[][] = new int[a][a];
        for(i=0;i<a;i++) for(j=0;j<a;j++) x[i][j] = sc.nextInt();
        for(i=0;i<a;i++){
            if(i%2==0){j=0; while(j<a){System.out.print(x[i][j] + " ");j++;}}
            else {j=a-1; while(j>=0){System.out.print(x[i][j] + " ");j--;}}
        }
    }
}