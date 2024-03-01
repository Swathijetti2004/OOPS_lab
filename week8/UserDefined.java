import java.lang.Exception;
import java.util.Scanner;
class UserDefinedException extends Exception{
    UserDefinedException(String s){
        super(s);
    }
}
class UserDefined{

    void check(String s) throws UserDefinedException{
        try{
               if(s.contains("@")){
                throw  new UserDefinedException("input should not contains @....");
                }
                    System.out.println("Correct input"); 
        }catch(UserDefinedException e){
                System.out.println("wrong input");
                e.printStackTrace();
        }  
    }
    public static void main(String[] args)  throws UserDefinedException{
            UserDefined obj=new UserDefined();
            Scanner inp=new Scanner(System.in);
            String s=inp.nextLine();
            obj.check(s);
    }
}