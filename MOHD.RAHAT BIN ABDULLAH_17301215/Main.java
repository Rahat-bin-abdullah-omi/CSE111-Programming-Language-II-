import java.util.Scanner;
public class Main {

 public static void main(String[] args) {
  
  @SuppressWarnings("resource")
  Scanner sc = new Scanner(System.in);
  Recursion recur = new Recursion();
  System.out.println("Enter a number to see its Factorial, Fibonacci and Binary results");
  int m = sc.nextInt();
  
  System.out.println("Task 01");
  int a = recur.Factorial(m); // number can be user defined, thus can find the nth factorial
  System.out.println("Facorial : " +a);
  
  
  System.out.println("Task 02");
  int b =recur.Fibonacci(m);
  System.out.println("Fibonacci number : "+b);
  
  System.out.println("Task 03");
  int arr[]= {10,20,30,40,50,60};
  System.out.println("Array printed Recursively");
  recur.RecursiveArray(arr, 0);
  System.out.println();
  
  System.out.println("Task 04");
  String c =recur.BinaryNumber(m);
  System.out.println("Binary Number : "+c);
  
  System.out.println("Task 05");
  System.out.println("Select the number you want to raise the power of the element");
  int n = sc.nextInt();
  double d = recur.power(m, n);
  System.out.println(m +" ^ " + n +" = "+ d);
  
  System.out.println("Task06");
  //System.out.println("Linked List Sum");
  Node head=recur.ConvertSingly(arr);
  int e=(int)recur.LinearListSum(head);
  System.out.println("Sum of elements in a list: "+e);
  
  System.out.println("Task07");
  System.out.println("Linked List Printed Backward");
  recur.ReverseList(head);
  System.out.println();
  
  System.out.println("Task08");
  int[]brr= {20,10,50,30,60,40};
  System.out.println("Unsorted Array");
  recur.RecursiveArray(brr, 0);
  System.out.println();
  System.out.println("Selection Sort Done Recursively");
  recur.recurSelectionSort(brr, 0);
  recur.RecursiveArray(brr, 0);
  System.out.println();
  
  System.out.println("Task09");
  System.out.println("Unsorted Array");
  int[] crr= {20,10,50,30,60,40};
  recur.RecursiveArray(crr, 0);
  System.out.println();
  System.out.println("Inserion Sort Done Recursively");
  recur.insertionSortRecursive(crr, crr.length);
  recur.RecursiveArray(crr, 0);
  System.out.println();
  
//  System.out.println("Task10");
//  int[] drr= {20,10,50,30,60,40};
//  System.out.println("Selection Sort Done Recursively Linked List");
//  

  //recur.printList(head1);

 }

}
