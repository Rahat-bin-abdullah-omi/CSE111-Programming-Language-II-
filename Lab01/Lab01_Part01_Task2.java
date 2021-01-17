import java.util.Scanner;
public class Lab01_Part01_Task2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    int array[]=new int [10];
    for (int a=0;a<array.length;a++) {
      array[a]=sc.nextInt();
    }
    int min=array[0];
    int max=array[0];
    int maxNum=0,minNum=0,maxPos=0,minPos=0;
    for (int a=0;a<array.length;a++) {
      if (array[a]>max) {
      max=array[a];
      maxPos=a;
      maxNum=array[a];
      }
      if (array[a]<min) {
      min=array[a];
      minPos=a;
      minNum=array[a];
      }
    }
    array[maxPos]=minNum;
    array[minPos]=maxNum;
    for (int a=0;a<array.length;a++) {
    System.out.print(array[a]+" ");
    }
  }
}