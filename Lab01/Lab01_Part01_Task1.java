import java.util.Scanner;
public class Lab01_Part01_Task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length of the array");
        int l= sc.nextInt();
        int[] a= new int [l];
        System.out.println("Enter the numbers ");
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        for(int j=0; j<a.length; j++){
            if(a[0]==6||a[a.length-1]==6){
                System.out.println("TRUE");
                break;
            }
            else{
                 System.out.println("FALSE");
            }
        }
    }
}

                
            