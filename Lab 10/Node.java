public class Node {
 public Node next;
 public Node prev;
 public int val;
 public Node(int x, Node n)
 {
  next = n;
  val = x;
 }
 public Node(int x, Node n, Node p)
 {
  next = n;
  val = x;
  prev = p;
 }

}