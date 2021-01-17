public class ArrayStack implements Stack
{
      int size;
      Object [] data;
      
      public ArrayStack(){
            size=0;
            data = new Object[5];
      }
      
      // The number of items on the stack
      public int size(){
            int count = 0;
            
            for(int i = 0; i<data.length; ++i)
            {
                  if(data[i]!=null)
                  {
                        ++count;
                  }
                  else break;
            }
            return count;
      }
// Returns true if the stack is empty
      public boolean isEmpty()
      {
        if(data[0]==null){
          return true;
        } else{
          return false;
      }
// Pushes the new item on the stack, throwing the
// StackOverflowException if the stack is at maximum capacity. It
// does not throw an exception for an "unbounded" stack, which
// dynamically adjusts capacity as needed.
        public void push(Object e){
          
      if(size==data.length){
        throw new StackOverflowException();
      }
                  if(data[size]==null){
                        data[size] = e;
                        size++;
                        break;
                  }
                
            }
      }
// Pops the item on the top of the stack, throwing the
// StackUnderflowException if the stack is empty.
      public Object pop(){
            if(size==0)
            {
                  throw new StackUnderflowException();
            } else {
                  Object o = null;
                  int p=size-1;
                   o=data[p];
                   data[p]=null;
                  }
                  return o;
            }
      }
// Peeks at the item on the top of the stack, throwing
// StackUnderflowException if the stack is empty.
      public Object peek()
      {
            if(isEmpty())
            {
                  throw new StackUnderflowException();
            }
            
            if(size()==data.length)
            {
                  return data[data.length-1];
            }
            else
            {
                  Object o = null;
                  for(int i = 0; i<data.length; ++i)
                  {
                        if(data[i]==null)
                        {
                              o = data[i-1];
                              break;
                        }
                  }
                  return o;
            }
      }
// Returns a textual representation of items on the stack, in the
// format "[ x y z ]", where x and z are items on top and bottom
// of the stack respectively.
      public String toString(){
            if(isEmpty()) {
                  return "Empty Stack";
            }
            String a = "";
            
            for(int i = data.length-1; i>=0; --i){
                  if(data[i]!=null){
                        a = a+data[i]+" ";
                  }
                  
            }
            return "[ "+a+"]";
      }
// Returns an array with items on the stack, with the item on top
// of the stack in the first slot, and bottom in the last slot.
      public Object[] toArray(){
            if(isEmpty()) {
                  Object[] a = {"Empty Stack"};
                  return a;
            }else{
                  Object[] a = new Object[size()];
                  int j = 0;
                  for(int i = a.length-1; i>=0; --i)
                  {
                        a[i] = data[j];
                        ++j;
                  }
                  return a;
            }
      }
// Searches for the given item on the stack, returning the
// offset from top of the stack if item is found, or -1 otherwise.
      public int search(Object e){
        if(isEmpty()) {
          return -1;
        }
            int count = 0;
            int p = size-1;
            
            for(int i = p; i>=0; --i){
                  if(data[i]==e){
                        break;
                  }
                  else
                  {
                        ++count;
                  }
            }
            return count;
      }
      
      
}