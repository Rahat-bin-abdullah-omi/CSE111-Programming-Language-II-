public class ListStack implements Stack
{
      int size;
      Node top;
      
      
      public ListStack()
      {
            size = 0;
            top = null;
      }
      
      // The number of items on the stack
      public int size()
      {
            int count = 0;
            
            for(Node n = top; n!=null; n = n.next)
            {
                  ++count;
            }
            return count;
      }
// Returns true if the stack is empty
      public boolean isEmpty()
      {
        if(top==null){
            return true;
        }else{
          return false;
      }
// Pushes the new item on the stack, throwing the
// StackOverflowException if the stack is at maximum capacity. It
// does not throw an exception for an "unbounded" stack, which
// dynamically adjusts capacity as needed.
      public void push(Object e){
            Node n = new Node(e, null);
            if(isEmpty())
            {
                  top = n;
            }
            
            n.next = top;
            top = n;
            return;
      }
// Pops the item on the top of the stack, throwing the
// StackUnderflowException if the stack is empty.
      public Object pop() throws StackUnderflowException
      {
            if(isEmpty())
            {
                  throw new StackUnderflowException();
            }
            Node node = top;
            Object o = top.val;
            top = top.next;
            node = null;
            return o;
      }
// Peeks at the item on the top of the stack, throwing
// StackUnderflowException if the stack is empty.
      public Object peek() throws StackUnderflowException
      {
            if(isEmpty())
            {
                  throw new StackUnderflowException();
            }
            return top.val;
      }
// Returns a textual representation of items on the stack, in the
// format "[ x y z ]", where x and z are items on top and bottom
// of the stack respectively.
      public String toString()
      {
            if(isEmpty())
            {
                  return "Empty Stack";
            }
            String a = "";
            Node node = top;
            
            while(node!=null)
            {
                  a = a+node.val+" ";
                  node = node.next;
            }
            return "[ "+a+"]";
      }
// Returns an array with items on the stack, with the item on top
// of the stack in the first slot, and bottom in the last slot.
      public Object[] toArray()
      {
            Object[] array = new Object[size()];
            Node node = top;
            for(int i = 0; i<array.length; ++i)
            {
                  array[i] = node.val;
                  node = node.next;
            }
            return array;
      }
// Searches for the given item on the stack, returning the
// offset from top of the stack if item is found, or -1 otherwise.
      public int search(Object e)
      {
            int count = 0;
            for(Node n = top; n!=null; n = n.next)
            {
                  if(n.val==e)
                  {
                        return count;
                  }
                  else
                  {
                        ++count;
                  }
            }
            return -1;
      }
}