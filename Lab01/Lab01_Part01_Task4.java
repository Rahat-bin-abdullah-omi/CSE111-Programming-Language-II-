import java.util.Scanner;
public class Lab01_Part01_Task4{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
    int ar[]=new int [n];
    for (int a=0;a<ar.length;a++) {
      int n1=sc.nextInt();
      for (int b=0;b<a;b++) {
        if (ar[b]==n1) {
          System.out.print("Enter another\n");
          a--;
          break;
        }
        else {
          ar[a]=n1;
        }
      }
      if (a==0) {
        ar[0]=n1;
      }
    }
    for (int a=0;a<ar.length;a++) {
      System.out.print(ar[a]+"\n");
    }
  }
}