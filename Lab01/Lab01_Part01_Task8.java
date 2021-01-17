import java.util.Scanner;
public class Lab01_Part01_Task8{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);       
        System.out.println("Enter the size of the arrays");
        int num=sc.nextInt();
        int[] A= new int[num];
        int[] B=new int[num];
        int[] C=new int[num];
        System.out.println("Enter values for the first array ");
        for(int i=0;i<A.length; i++){
            A[i]=sc.nextInt();
        }
        System.out.println("Enter values for the second array ");
        for(int i=0;i<B.length; i++){
            B[i]=sc.nextInt();
        }
        for(int i=0;i<C.length; i++){
            C[i]=5*A[i]-B[i];
        }
        for(int i=0;i<C.length; i++){
            System.out.print(C[i]+" ");
        }
    }
}