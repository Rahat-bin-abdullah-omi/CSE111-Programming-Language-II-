public class Node{
  Node next;
  Node previous;
  Patient data;
  
  
  public Node(Patient data, Node next){
    this.data=data;
    this.next=next;
  }
}