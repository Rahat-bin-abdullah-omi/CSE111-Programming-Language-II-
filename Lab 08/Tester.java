import java.util.Scanner;
public class Tester{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("how many user do you want to entry");
    int count = sc.nextInt();
    WRM m;
    System.out.println("press 1 if you want to use array based linked list\n"+"press 2 if you want to use linked lised");
    int press=sc.nextInt();
    if(press==1){
    m= new ArrayBasedmanager();
    }else{
      m=new LinedListBasedmanager();
    }
    
    Patient pr[] = new Patient[count];
    for(int i=0;i<pr.length;i++){
      pr[i]=new Patient();
      sc.nextLine();
      System.out.println("name please");
      pr[i].name=sc.nextLine();
      System.out.println("blood group please");
      pr[i].bloodGroup=sc.nextLine();
      System.out.println("id please");
      pr[i].id=sc.nextInt();
      m.registerPatient(pr[i]);
      System.out.println(pr[i].id+" was registed");
    }
    System.out.println("all the user was registered . now it is time to call the patient");
    m.showAllPatient();
    System.out.println(m.canDoctorGOHome());
    for(int i=0;i<pr.length;i++){
      try{      
        System.out.print(m.servePatient());
      }catch(Exception e){
      }
    }
    m.showAllPatient();
    System.out.println(m.canDoctorGOHome());
    m.cancelAll();
    System.out.println(m.canDoctorGOHome());
    
  }
}