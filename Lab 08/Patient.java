import java.util.Scanner;
public class Patient{
  Scanner sc = new Scanner(System.in);
  public int id;
  public String name;
  public String bloodGroup;
  
//  public Patient(){
//    id=sc.nextInt();
//  }
  
  public Patient getProfile(){
    return new Patient();
  }
  
  
  public String toString(){
    return "\nname :"+name+"\nid :"+id+"\nblood group :"+bloodGroup+"\n";
  }
}