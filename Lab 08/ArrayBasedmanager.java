import java.util.Arrays;
public class ArrayBasedmanager implements WRM{
  public int capacity = 10;
  public int size=0;
  
  Patient[] items = new Patient[capacity];
  
  public int getLeftChildIndex(int parentIndex){
    return 2*parentIndex+1;
  }
  public int getRightChildIndex(int parentIndex){
    return 2*parentIndex+2;
  }
  public int getParentIndex(int childIndex){
    return (childIndex-1)/2;
  }
  
  public boolean hasLeftChild(int index){
    return getLeftChildIndex(index)<size;
  }
  public boolean hasRightchild(int index){
    return getRightChildIndex(index)<size;
  }
  public boolean hasParent(int index){
    return getParentIndex(index)>=0;
  }
  
  public Patient leftChild(int index){
    return items[getLeftChildIndex(index)];
  }
  
  public Patient rightChild(int index){
    return items[getRightChildIndex(index)];
  }
  public Patient parent(int index){
    return items[getParentIndex(index)];
  }
  
  public void swap(int indexOne,int indexTwo){
    Patient temp=items[indexOne];
    items[indexOne]=items[indexTwo];
    items[indexTwo]=temp;
  }
  
  public void ensureExtraCapacity(){
    if(size==capacity){
      items=Arrays.copyOf(items,capacity*2);
      capacity*=2;
    }
  }
  
  public Patient peek() throws problem{
    if(size==0) throw new problem();
    return items[0];
  }
  
  public Patient servePatient(){
    Patient item=items[0];
    items[0]=items[size-1];
    size--;
    heapifyDown();
    return item;
  }
  
  public void registerPatient(Patient item){
    ensureExtraCapacity();
    items[size]= item;
    size++;
    heapifyUp();
  }
  
  public void heapifyUp(){
    int index=size-1;
    while(hasParent(index)&&parent(index).id>items[index].id){
      swap(getParentIndex(index),index);
      index=getParentIndex(index);
    }
  }
  
  public void heapifyDown(){
    int index=0;
    while(hasLeftChild(index)){
      int smallerChildIndex=getLeftChildIndex(index);
      if(hasRightchild(index)&&((rightChild(index).id)<(leftChild(index).id))){
        smallerChildIndex=getRightChildIndex(index);
      }
      if((items[index].id)<(items[smallerChildIndex].id)){
        break;
      }else{
        swap(index,smallerChildIndex);
      }
      index=smallerChildIndex;
    }
  }
  
  public boolean canDoctorGOHome(){
    return size==0;
  }
  
  public void showAllPatient(){
    if(size==0){
      System.out.println("no patient left");
    }
    else{
      for(int i=0;i<size;i++){
        System.out.println(items[i]);


      }
    }
  }
  
  public void cancelAll(){
    for(int i=0;i<size;i++){
      items[i]=null;
    }
    size=0;
  }
}