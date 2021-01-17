public class LinedListBasedmanager implements WRM{
  public Node head;
  
  
  public void registerPatient(Patient d){
    if(head==null){
      head=new Node(null,null);
    }
    Node node=new Node(d,null);
    Node previous =null;
    Node current = head.next;
    while((current!=null)&&(d.id>current.data.id)){
      previous = current;
      current = current.next;
    }
    if(previous==null){
      head.next=node;
    }
    else{
      previous.next=node;
    }
    node.next=current;
      
  }
  
  
  
  public boolean canDoctorGOHome(){
    return head.next==null;
  }
  
  
  
  public void showAllPatient(){
    if(head.next==null){
      System.out.println("no patient left");
    }
    else{
      for(Node n=head.next;n!=null;n=n.next){
        System.out.print(n.data+" ");
      }
      System.out.println();
    }
  }
  
  
  
  public void cancelAll(){
    head.next=null;
  }
  
  
  public Patient servePatient(){
    Patient temp = head.next.data;
    head.next=head.next.next;
    return temp;
  }
  
}
