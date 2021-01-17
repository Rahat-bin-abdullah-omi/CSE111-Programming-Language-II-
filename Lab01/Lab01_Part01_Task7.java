import java.util.Scanner;
public class Lab01_Part01_Task7{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int a[]= new int[10];
        
        System.out.println("Enter the numbers ");
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The entered numbers are ");
        for(int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("Enter a number ");
        int num=sc.nextInt();
        
        for(int i=1; i<3*num; i++){
            System.out.println("*");
        }
    }
}