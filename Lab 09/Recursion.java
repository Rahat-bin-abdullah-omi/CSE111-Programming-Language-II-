
public class Recursion implements MethodCalls {

 // The factorial method
 public int Factorial(int n) {
  
  if(n==1) { // base condition
   return 1;
  }
  int factorial = n*Factorial(n-1); // main code
  return factorial;
 }

 // The fibonacci method
 public int Fibonacci(int y) {
  if(y>=0) 
  {
    if(y == 1 || y == 2) // 1st and 2nd terms are base case thus its fixed to 1
    {
     return 1; 
    
    }else if(y==0) // for 0th term it is also fixed to 0
    {
     return 0;
    }
    return Fibonacci(y-1) + Fibonacci(y -2);  
  }
  return -1;
 }
 

 // The Recursive array print method
 public void RecursiveArray(int []arr, int i) {
  if(i<arr.length) 
  {
   System.out.print(" " + arr[i]); 
   RecursiveArray(arr, i+1);
  }
 }

 // The decimal to binary conversion method 
 public String BinaryNumber(int b) {
  int a;
  if(b>0) 
  {
   a =b % 2;
   return BinaryNumber(b/2)+ ""+ a;
  }
  return "";
 }

 // The method to calculate power of a given element
 public double power(int m, int n) {
  
   if (n == 0) {
          return 1.0;
      }
      if (n < 0) {
          // Negative power.
          if (m == 0) {
              throw new IllegalArgumentException(
                      "It's impossible to raise 0 to the power of a negative number");
          }
          return 1 / power(m, -n);
      } else {
          // Positive power

          double powerOfHalfN = power(m, n / 2);
          if (n % 2 == 1) {
              // Odd n
              return m * powerOfHalfN * powerOfHalfN;
          } else {
              // Even n
              return powerOfHalfN * powerOfHalfN;
          }
      }
 }

 //  method to sum non dummy headed linked list 
 public Object LinearListSum(Node head) {
  Object sum =0;
  if(head!=null) 
  {
   sum = (int)head.e+ (int)LinearListSum(head.next);
  }
  return sum; 
 }
 //method to print non dummy headed linked list backwards
 public void ReverseList(Node head) 
 {
  if(head.next != null)
  {
   ReverseList(head.next);
  }
  System.out.print(" "+ head.e);
 }
 public int getMinimumIndex(int[]c ,int d) 
 {
  if(d==c.length-1)
   return d;
  int x = getMinimumIndex(c, d+1);
  if(c[d]<c[x])
   return d;
  else
   return x;
 }
 public void recurSelectionSort(int[] b , int n) 
 {
  if(n==b.length-1) 
  {
   return;
  }
  
  int gMI = getMinimumIndex(b,n+1);
  if(b[gMI]<b[n]) 
  {
   int temp = b[n];
   b[n]= b[gMI];
   b[gMI]= temp;
  }
  recurSelectionSort(b ,n+1);
   
 }
    public void insertionSortRecursive(int arr[], int n)
    {
        // Base case
        if (n <= 1)
            return;
      
        // Sort first n-1 elements
        insertionSortRecursive( arr, n-1 );
      
        
        int last = arr[n-1];
        int j = n-2;
      
        
        while (j >= 0 && arr[j] > last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
   
   
    public void printList(Node head) 
    {
     if(head!= null) 
     {
      System.out.print(" " + head.e);
      printList(head.next);
     }
    }

public void swapNodes(Node head_ref, Node currX, Node currY, Node prevY){
    
 head_ref = currY ;
    prevY.next = currX ;

    Node temp = currY.next;
    currY.next = currX.next;
    currX.next  = temp;
    }

 // method to convert arrays to linked lists
 public Node ConvertSingly(int [] a) 
 {
  Node head = new Node(a[0],null);
  Node tail = head;
  for(int i =1; i<a.length; i++) 
  {
   Node newNode = new Node(a[i],null);
   tail.next = newNode;
   tail = newNode;
  }
  return head;
 }

}
