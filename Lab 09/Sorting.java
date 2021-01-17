import java.util.*;
public class Sorting{
    public static void main(String[]args){
  int a [] =new int [6];
  Scanner key = new Scanner(System.in);
  System.out.println("please enter 6 numbers");
  for(int i = 0 ; i<a.length; i++){
   int input = key.nextInt();
   a[i]= input;
  }
  System.out.println("This Is Selection Sort Based On Array");
  print(slectionSort(a));
  
  System.out.println("This Is Insertion Sort Based On Array");
  print(insertionSort(a));
  
  System.out.println("This Is Singly Ordered List Using Bubble Sort ");
  print_list(singlyList_bubbleSort(a));
  
  System.out.println("This Is Singly Ordered List Using Selection Sort");
  print_list(singlyList_selectionSort(a));
  
  System.out.println("This Is Doubly Ordered List Using Insertion Sort");
  print_list(doublyList_insertionSort(a));
  
  
  System.out.println("Enter the key you want to find in a selection sorted array");
  int k = key.nextInt();
  int b =binarySearch(slectionSort(a),k);
  System.out.println(b);
  System.out.println("Enter the key you want to find in a insertion sorted array");
  int y = key.nextInt();
  int x =binarySearch(insertionSort(a), y);
  System.out.println(x);
  
 }

 public static void print(int[] m){
  for(int a = 0; a<m.length; a++){
   System.out.print(" "+ m[a]);
  }
  System.out.println();
 }

 public static int[] slectionSort(int [] m){
  for(int i = 0; i<m.length-1; i++){
   int minValue = i;
   for(int j = i+1; j< m.length; j++){
    if(m[j]<m[minValue])
     minValue = j;
   }
   int newVal = m[i];
   m[i]= m[minValue];
   m[minValue]= newVal;
  }
  return m;
 }
 public static int [] insertionSort(int[] n){
  int newVal;
  int key;
  int keyLoc;
  for(int i = 1; i < n.length; i++){
   key = n[i];
   keyLoc = i;
   for(int j =i-1; j>=0 ; j --){
    if(key<n[j]){
     newVal = n[keyLoc];
     n[keyLoc--]= n[j];
     n[j]= newVal;
    }
   }
  }
  return n;
 }
 public static Node singlyList_bubbleSort(int [] d){
  Node head = convert(d,1);
  int temp;
  Node pred;
  Node adj;
  for(int j = 0; j<d.length-1; j++){
   adj = head.next;
   Node n = head;
   while(n!= null){
    pred = n;
    if(pred.val>adj.val){
     temp = pred.val;
     pred.val = adj.val;
     adj.val = temp;
    }
    adj = adj.next;
    if(adj == null)
     break;
    n = n.next;
   }
  }
  
  return head;
 }
 public static void print_list(Node head){
  for(Node n = head ; n!= null; n= n.next){
   System.out.print(" " + n.val);
  }
  System.out.println();
 }
 public static Node singlyList_selectionSort(int []e) 
 {
  Node head = convert(e,1);
  for(Node node1 = head; node1!=null; node1 = node1.next){
   Node min = node1;
   for(Node node2 = node1; node2!=null; node2 = node2.next){
   if(min.val > node2.val){
   min = node2;
   }

   }
   Node temp = new Node(node1.val,null);
   node1.val = min.val;
   min.val = temp.val;
  }
  
  
  return head;
 }
 public static Node convert(int [] v, int r){
  if(r==1){
  Node head = new Node(v[0],null);
  Node tail = head;
  for(int i = 1; i<v.length; i ++){
   Node newNode = new Node(v[i], null);
   tail.next= newNode;
   tail = newNode;
  }
  return head;
  }else{
   Node head = new Node(v[0],null, null);
   Node tail = head;
   for(int i = 1; i< v.length; i++){
    Node newNode = new Node(v[i], null, null);
    tail.next = newNode;
    newNode.prev=tail;
    tail = tail.next;
   }
   return head;
  }
 }
 public static Node doublyList_insertionSort(int[] f){
  Node head=convert(f, 2);
  Node x = head.next;
  
  while(x!= null){
   Node min = x;
   Node y = x.prev;
   while(y!=null){
    if(y.val<min.val){
     min =y;
     Node temp = new Node(y.val ,null, null);
     y.val = min.val;
     min.val = temp.val;
    }
    y= y.prev;
   }
   x= x.next;
  }
  return head;
 }
 public static int binarySearch(int[] sorted, int key){
  int start = 0;
  int end = sorted.length;
  while(start<end){
   int mid = (start+end)/2;
   if(sorted[mid]==key)
    return mid;
   else if(key>sorted[mid]){
    start =mid;
    
   }else {
    end = mid;
    
   }
  }
  return -1;

 }
}