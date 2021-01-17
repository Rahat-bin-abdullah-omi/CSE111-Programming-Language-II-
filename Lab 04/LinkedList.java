public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
   head = new Node(a[0], null);
   Node headTail =head;
   for(int m =1; m<a.length; m++){
    Node p = new Node(a[m],null);
    headTail.next = p;
    headTail = headTail.next;
   }
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
   head = h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    int count = 0;
   for(Node n= head; n!=null;n=n.next)
   {
   count++;
  }
   return count;
  }
  
  /* prints the elements in the list */
  public void printList(){
    for(Node n =head; n!=null; n=n.next)
   {
    System.out.print(" "+ n.element);
   }
   System.out.println();
    
  }    
  
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
   if(idx<0||idx>=countNode()){
    throw new IndexOutOfBoundsException();
   }
   int m =0;
   for(Node n =head;n!=null; n =n.next){
    if(m==idx){
     return n; 
    }
    m++;
   }
  return null;
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
     if(idx<0||idx>countNode()){
    return null;
   }
   int m =0;
   for(Node n =head;n!=null; n =n.next){
    if(m==idx){
     return n.element; 
    }
    m++;
   }
    return null; 
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
  if(idx<0||idx>countNode()){
    return null;
   }
   int m =0;
   for(Node n =head;n!=null; n =n.next){
    if(m==idx){
     Object older =n.element; 
     n.element = elem;
     return older; 
    }
    m++;
   }
    
    return null; // please remove this line!
  
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
   int m =0;
   for(Node n =head;n!=null; n =n.next){
    if(n.element==elem){
     int indexNumber =m;
     return indexNumber ; 
    }
    m++;
   }
    return -1; //done
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
     for(Node n =head;n!=null; n =n.next){
    if(n.element==elem){
      return true;
    }
  }
    return false; // done
  }
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
     Node newHead = null;
   Node newTail = null;
   for(Node n = head;n!=null; n=n.next){
    Node newNode =new Node(n.element ,null);
    if(newHead ==null){
     newHead = newNode;
     newTail = newHead;
    }
    else{
     newTail.next = newNode;
     newTail = newTail.next;
    }
   }
   
    return newHead; // done
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    // TO DO
    return null; // please remove this line!
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    // TO DO
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    // TO DO
    return null; // please remove this line!
  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
    // TO DO
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
    // TO DO
  }
  
}