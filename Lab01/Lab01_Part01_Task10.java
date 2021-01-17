import java.util.*;
public class Lab01_Part01_Task10{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter the date");
    System.out.println("Month??");
    int m=sc.nextInt();
    System.out.println("Day??");
    int d=sc.nextInt();
    System.out.println(season(m,d));
  }
  public static String s;
  public static String season(int month,int day){
    if((month==12 && day>=16)|| month==1 || month==2|| (month==3 && day<=15)){
      s="Winter";
    }else if((month==3 && day>=16)|| month==4 || month==5|| (month==6 && day<=15)){
      s="Spring";
    }else if((month==6 && day>=16)|| month==7 || month==8|| (month==9 && day<=15)){
      s="Spring";
    }
    else if((month==9 && day>=16)|| month==10 || month==11|| (month==12 && day<=15)){
      s="Fall";
    }
    
    return s;
  }
}