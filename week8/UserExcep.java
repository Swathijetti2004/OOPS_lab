import java.util.*;
class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}
class UserExcep{
    public static void main(String[] args) throws MyException{

        try{
            hello();
        }catch(MyException e){
            //e.printStackTrace();
        }
    }
    static void hello() throws MyException{
        int a=90;
            if(a<99){
                throw new MyException("Inavlid number");
            }
            else{
                System.out.println("WElcom");
    
            }
    }
}
// class InvalidCredentialsException extends Exception {
//     InvalidCredentialsException(String msg) {
//         super(msg);
//     }
// }
// class UserExcep {
//     void Check(String id,String password) throws InvalidCredentialsException {
//          if(id!="student" || password!="9999"){
//                 throw new InvalidCredentialsException("No such user with username - " + id);
//         } else {
//             System.out.println("Login Successful");
//         }

//     }

//     public static void main(String[] args) throws InvalidCredentialsException {
//         UserExcep obj = new UserExcep();
//         Scanner sc=new Scanner(System.in);
//         String id = sc.next();
//         String password= sc.next();
//         obj.Check(id,password);
//     }
// }