public class Lab01_Part02_Task7{
    public static void main(String[] args){
        BankAccount acc1= new BankAccount();
        BankAccount acc2= new BankAccount();
        BankAccount acc3= new BankAccount();
        acc1.setName("Rahim");
        acc1.setAddress("Dhaka");
        acc1.setBalance(23456);
        acc1.setAccountID("11");
        acc2.setName("Karim");
        acc2.setBalance(3456);
        acc2.setAddress("Barishal");
        acc2.setAccountID("12");
        acc3.setName("Zaman");
        acc3.setAddress("Comilla");
        acc1.addInterest();
        acc2.addInterest();
        System.out.println(acc1.getName());
        System.out.println(acc2.getName());
        System.out.println(acc3.getName());
        System.out.println(acc1.getAddress());
        System.out.println(acc2.getAddress());
        System.out.println(acc3.getAddress());
    }
}
              
               
        