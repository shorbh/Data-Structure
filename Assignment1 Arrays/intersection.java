import java.util.*;
public class intersection{
    static int[] calMax(int x[],int y[],int a){
        int z=0;
        int d[] = new int[a];
        for(int i=0;i<a-1;i++){
            for(int j=0;j<a-i-1;j++){
                if(x[j]>x[j+1]){
                    z=x[j];
                    x[j]=x[j+1];
                    x[j+1]=z;
                }
                if(y[j]>y[j+1]){
                    z=y[j];
                    y[j]=y[j+1];
                    y[j+1]=z;
                }
            }
        }
        int i=0,j=0,k=0;
        while(i<a&&j<a){
            if(x[i]==y[j]){d[k]=x[i];i++;j++;k++;}
            else{
                if(x[i]>y[j]) j++;
                else i++;
            }
        }
        d[k]=-1;
        return d;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();int b[] = new int[a];
        int x[] = new int[a];int y[] = new int[a];
        for(int i=0;i<a;i++) x[i] = sc.nextInt();
        for(int i=0;i<a;i++) y[i] = sc.nextInt();
        b = calMax(x,y,a);
        for(int i=0;b[i]!=-1;i++)System.out.println(b[i]);
    }
}