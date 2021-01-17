import java.util.Scanner;
public class Lab01_Part01_Task6{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a[] = new int [5];
        System.out.println("Enter the numbers");
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        System.out.println(Palindrome(a));
    }
    public static boolean Palindrome(int a[]){
        boolean b= true;
        int j=a.length-1;
        for(int i=0; i<j; i++){
            if(a[i]!=a[j]){
                b=false;
                break;
            }
            j--;
        }
        return b;
    }
}