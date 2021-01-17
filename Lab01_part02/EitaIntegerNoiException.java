public class EitaIntegerNoiException extends Exception{
  Exception e;
   EitaIntegerNoiException(Exception a) {
     e=a;
   }
   public String toString(){
     return "EitaIntegerNoiException";
  }
}
  