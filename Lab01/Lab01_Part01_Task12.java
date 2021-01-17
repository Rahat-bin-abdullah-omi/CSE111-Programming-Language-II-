import java.util.*;
public class Lab01_Part01_Task12{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter the 1st date");
    System.out.println("Month??");
    int m1=sc.nextInt();
    System.out.println("Day??");
    int d1=sc.nextInt();
    System.out.println("please enter the 2nd date");
    System.out.println("Month??");
    int m2=sc.nextInt();
    System.out.println("Day??");
    int d2=sc.nextInt();
    System.out.println(dateCheck(m1,d1,m2,d2));
  }
  public static boolean s;
  public static boolean dateCheck(int month1,int day1,int month2,int day2){
    if(month1<month2 || (month1==month2 && day1<day2)){
      s=true;
    }else {
      s=false;
    }
    return s;
  }
}