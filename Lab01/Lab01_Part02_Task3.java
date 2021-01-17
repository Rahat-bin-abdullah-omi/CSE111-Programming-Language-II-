import java.util.Scanner;
public class Lab01_Part02_Task3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        try{
            int x,n=sc.nextInt();
            int a[]=new int[n];
            a[5]=99;
            x=n/0;
        }
        catch(ArithmeticException a){
            System.err.println(a);
        }
        catch(ArrayIndexOutOfBoundsException b){
            System.err.println(b);
        }
        finally{
            System.out.println("THE END");
        }
    }
}
    