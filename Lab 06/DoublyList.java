public class DoublyList{
    public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object [] a){
        head = new Node(null, null, null);
        Node tail = head;
        
        for(int i = 0; i<a.length; i++){
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
        tail.next=head; // Making it circular
        head.prev=tail;
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode(){
        // TO DO
      int count =0;
      for(Node n=head.next;n!=head;n=n.next)
      {count++;}
        
        return count; // please remove this line!
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
        // TO DO    
    for(Node n=head.next;n!=head;n=n.next)
    {System.out.println(n.element);}
    }
    
    public void backwardprint(){
        // TO DO  
      for(Node n=head.prev;n!=head;n=n.prev)
      {System.out.println(n.element);}
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        // TO DO  
      Node n=head.next;
      for(int i=0;i<=idx;n=n.next,i++)
      {if(i==idx)
        {return n;}}
        
        return null; // please remove this line!
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        // TO Do
         Node n=head.next;
      for(int i=0;n!=head;n=n.next,i++)
      {if(n.element.equals(elem))
        {return i;}}
      return -1;
         
        // please remove this line!
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        // TO DO
       Node p=nodeAt(idx);
       Node n=p.prev;
       Node r=new Node(elem,null,null);
       n.next=r;
       r.next=p;
       r.prev=n;
       p.prev=r;
    }
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        // TO DO
       Node p=nodeAt(index);
       Node n=p.prev;
       Node r=p.next;
       n.next=r;
       r.prev=n;
        
        
        return p.element; // please remove this line!
    }
    
    
    
}