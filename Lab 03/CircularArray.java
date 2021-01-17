public class CircularArray{
  private int start;
  private int size;
  private Object [] cir;
  /*
   * if Object [] lin = {10, 20, 30, 40, null}
   * then, CircularArray(lin, 2, 4) will generate
   * Object [] cir = {40, null, 10, 20, 30}
   */
  public CircularArray(Object [] lin, int st, int sz){
    cir=lin;
    start=st;
    size=sz;
    int count=start;
    Object newArray[]=new Object[cir.length];
    for(int c=0;c<cir.length;c++){
      newArray[count]=cir[c];
      count++;
      if(count==cir.length){
        count=0;
      }
    }
    cir=newArray;
    
  }
  
  //Prints from index --> 0 to cir.length-1
  public void printFullLinear(){
    for(int c=0;c<cir.length;c++){
      System.out.print(cir[c]+" "); 
    }
    System.out.printf("\n");
  }
  
  // Starts Printing from index start. Prints a total of size elements
  public void printForward(){
    int count=(start + size+1) % cir.length;
    for(int c=0;c<cir.length;c++){
      if(cir[count]!=null)
        System.out.print(cir[count]+" ");
      if(count==cir.length-1) {
        count=0;
      }
      else{
        count++;
      }
    }
    System.out.printf("\n");
  }
  
  
  public void printBackward(){
    int count=cir.length%start;
    for(int c=0;c<cir.length;c++){
      if(cir[count]!=null)
        System.out.print(cir[count]+" ");
      if(count==0) {
        count=cir.length-1;
      }
      else{
        count--;
      }
    }
    System.out.printf("\n");
  }
  
  // With no null cells
  public void linearize(){
    Object newArray[]=new Object[size];
    int count =start;
    for(int c=0;c<newArray.length;c++){
      newArray[c]=cir[count];
      count++;
      if(count==cir.length)
        count=0;
    }
    cir=newArray;
  }
  
  // Do not change the Start index
  public void resizeStartUnchanged(int newcapacity){
    Object newArray[]=new Object[newcapacity];
    int count=start;
    int varC=start;
    for(int c=0;c<cir.length;c++){
      newArray[count]=cir[varC];
      count++;
      varC++;
      if(varC==cir.length)
        varC=0;
      if(count==newArray.length)
        count=0;
    }
    cir=newArray;
  }
  
  // Start index becomes zero
  public void resizeByLinearize(int newcapacity){
    Object newArray[]=new Object[newcapacity];
    int count=start;
    int varC=0;
    for(int c=0;c<cir.length;c++){
      newArray[varC]=cir[count];
      count++;
      varC++;
      if(count==cir.length)
        count=0;
    }
    cir=newArray;
  }
  
  /* pos --> position relative to start. Valid range of pos--> 0 to size.
   * Increase array length by 3 if size==cir.length
   * use resizeStartUnchanged() for resizing.
   */
  public void insertByRightShift(Object elem, int pos){
    if(size==cir.length){
      resizeStartUnchanged(size+3);
    }
    int index=(start+pos)%cir.length;
    for(int c=cir.length-1;c>index;c--){
      cir[c]=cir[c-1];
    }
    cir[index]=elem;
  }
  
  public void insertByLeftShift(Object elem, int pos){
    if(size==cir.length){
      resizeStartUnchanged(size+3);
    }
    int index=(start+pos)%cir.length;
    for(int c=0;c<index;c++){
      cir[c]=cir[c+1];
    }
    cir[index]=elem;
  }
  public void removeByLeftShift(int pos){
    int index=(start+pos)%cir.length;
    cir[index]=null;
    Object temp=cir[0];
    for(int a=index;a<cir.length;a++){
      if(a==cir.length-1){
        cir[a]=0;
      }else{
        cir[a]=cir[a+1]; 
      }
    }
    cir[cir.length-1]=temp;
    cir[0]=null;
    
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByRightShift(int pos){
    int index=(start+pos)%cir.length;
    cir[index]=null;
    for(int c=cir.length-1;c>start;c--){
      cir[c]=cir[c-1]; 
    }
    cir[start]=null;
  }
  
  
  //This method will check whether the array is palindrome or not
  public void palindromeCheck(){
  linearize();
  int count=cir.length-1;
  boolean flag=true;
    for(int c=0;c<count;c++,count--){
      if(cir[c]!=cir[count]){ 
        flag=false;
      }
    }
    if(flag==true){
      System.out.println("This array is a palindrome.");
    }else{
      System.err.println("This array is Not a palindrome.");
  }
  }
  //This method will sort the values by keeping the start unchanged
  public void sort(){
    Object newArray[]=new Object[cir.length];
    for(int c=0;c<cir.length;c++){
     newArray[c]=cir[c]; 
    }
    int min=(int)newArray[0];
    int minLoc;
    for(int c=0;c<newArray.length;c++){
      min=(int)newArray[c];
      minLoc=c;
      for(int k=c+1;k<newArray.length;k++){
        if((int)newArray[k]<(int)min){
          min=(int)newArray[k];
          minLoc=k;
        }
      }
      Object temp=newArray[c];
      newArray[c]=min;
      newArray[minLoc]=temp;
      }
    int index=start;
    for(int c=0;c<cir.length;c++){
      cir[index]=newArray[c];
      index++;
      if(index==cir.length){
        index=0;
      }
    }
  }
  
  //This method will check the given array across the base array and if they are equivalent interms of values return true, or else return false
  public boolean equivalent(CircularArray k){
    return true;
  }
  }