import java.util.*;
public class MyReader{
  //modify following line so that this method can throw Exception
  public static int readInteger( )throws EitaIntegerNoiException {
    Scanner k = new Scanner(System.in);
    
    int answer;
    
    String s;
    s=k.nextLine();
    try{
      if (s.contains(".")){
        throw new EitaIntegerNoiException(" ");
        
      }
      else{    
        
      }
    }
    catch(EitaIntegerNoiException a){
      throw a;
    }
    
  }
}