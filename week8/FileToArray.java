import java.io.*;
import java.util.Scanner;
class FileToArray{
    public static void main(String[] args) throws IOException {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter source file : " );
        String f1=s.next();
        System.out.println("Enter destination file : " );
        String f2=s.next();
        FileInputStream input=null;
        FileOutputStream output=null;
        try{
            input=new FileInputStream(f1);
            output=new FileOutputStream(f2);

            int ch=input.read();
            while(ch!=-1){
                output.write(ch);
                ch=input.read();
            }
            System.out.println("File copied success");
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }finally{
            if(input!=null){
                input.close();
            }
            if(output!=null){
                output.close();
            }
        }
    }
    
}