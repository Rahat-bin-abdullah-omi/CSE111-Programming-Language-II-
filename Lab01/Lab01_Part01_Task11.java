import java.util.Scanner;
public class Lab01_Part01_Task11{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in); 
        int x=sc.nextInt();
        System.out.println(allDigitOdd(x));
    }
    public static boolean allDigitOdd(int x){
        boolean test= true;
        while(x>0){
            if(x%2==0){
                test= false;
                break;
            }
            x=x/10;
        }
        return test; 
    }
}