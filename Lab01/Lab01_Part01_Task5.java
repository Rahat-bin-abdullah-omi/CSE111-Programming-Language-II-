import java.util.Scanner;
public class Lab01_Part01_Task5{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a[] = new int [15];
        int count[]= new int[10];
        
        System.out.println("Enter the numbers ");
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
            count[a[i]]++;
        }
        for(int j=0; j<count.length; j++){
            System.out.println(j +" was found "+count[j]+" times");
        }
    }
}