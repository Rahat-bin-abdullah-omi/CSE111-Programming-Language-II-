import java.util.*;
public class Task3{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
      int x,n=sc.nextInt();
      try{
      int a[]=new int[n];
      a[5]=99;
      x=n/0;
    }
    catch(ArrayIndexOutOfBoundsException r){
      System.out.println(r);
    }
    catch(ArithmeticException a){
      System.out.println(a);
    }
  }
}
