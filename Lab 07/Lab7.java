import java.util.Scanner;
public class Lab7{
    public static void main(String[]args){
        Scanner sc=new Scaner(System.in);
        Stack stack=new ArrayStack();
        String exp=sc.nextLine();
        boolean result=true;
        int id =0;
        char ch="a";
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            if(c=="(" || c=="{" ||c=="["){
                try{
                    Stack.push(c);
                }
                catch(StackOverflowException e){
                    result=false;
                }
            }
        }
                for(int i=0;i<exp.length();i++){
                    char c=exp.charAt(i);
                    if(c==')'){
                        try{
                    Stack.push(c);
                }
                catch(StackOverflowException e){
                    result=false;
                }
                        char a=(char)stack.pop;
                        if(a=='('){
                            result=true;
                        }
                        else{
                            result=false;
                            ch=')';
                            id=i;
                            break;
                        }
                        else if(c=='}'){
                            char a='{}';
                            try{
                    Stack.push(c);
                }
                catch(StackOverflowException e){
                    result=false;
                }
                            if(a=='{'){
                                result=true;
                            }
                            else{
                                result=false;
                                ch='}';
                                id=i;
                                break;
                            }
                        }
                    }
                    else if(c==']'){
                        char a=(char)stack.pop;
                        if(a=='['){
                            result=true;
                        }
                        else{
                            result=false;
                            ch=']';
                            id=i;
                            break;
                        }
                    }
                }
                if(result){
                    System.out.println("This expression is correct");
                }
                else{
                    System.out.println("This expression is NOT correct"/n "Error at character # "+"id"+"."+"ch"+"-not closed.");
                    
                }
            }
        }