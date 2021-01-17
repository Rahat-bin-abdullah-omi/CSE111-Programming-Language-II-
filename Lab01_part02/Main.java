public class Main{
  public static void main(String[] args){
    BankAccount acc1=new BankAccount("Mehedi","Mohakhali","17301098",5000.4);
    BankAccount acc2=new BankAccount("Hasan","Banani","14503465",2000.6);
    BankAccount acc3=new BankAccount("Tishan","Gulshan","15201568",6000);
    acc1.addInterest();
    acc3.addInterest();
    System.out.println(acc1.getName()+" "+acc1.getAddress()+" "+acc1.getAccountID()+" "+acc1.getBalance());
    System.out.println(acc2.getName()+" "+acc2.getAddress()+" "+acc2.getAccountID()+" "+acc2.getBalance());
    System.out.println(acc3.getName()+" "+acc3.getAddress()+" "+acc3.getAccountID()+" "+acc3.getBalance());
    
  }
}