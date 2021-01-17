import java.util.*;
public class QuadEqn{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    System.out.println((a+"x2 +"+b+"x "+"+"+c));
    System.out.println((int)firstRoot(a,b,c));
  }
  public static double firstRoot(int A,int B,int C){
    double root=(-B+Math.sqrt(B*B-4*A*C))/2*A;
    return root;
  }
}