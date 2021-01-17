import java.util.Scanner;
public class Lab01_Part01_Task9{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int [] a= new int[10];
        System.out.println("Enter the values ");
        for(int i=0;i<a.length; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        int a1[]= new int[10];
        a1=Square(a);
        display(a1);       
    }
    public static int[] Square(int[] a){
        for(int i=0;i<a.length; i++){
            a[i]=(int)Math.pow(a[i],2);
        }
        return a;
    }
    
    public static void display(int a[]){
        for(int i=0;i<a.length; i++){
        System.out.print(a[i]+ " ");
        }
    }
}
        
        
        
        