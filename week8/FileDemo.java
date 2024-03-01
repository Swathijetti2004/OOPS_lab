import java.io.*;
import java.util.Scanner;
class FileDemo{
    public static void main(String[] args) throws Exception{
        try{
            Scanner inp=new Scanner(System.in);

            System.out.println("Enter source file name : ");
            String source=inp.nextLine();

            System.out.println("Enter destination file name : ");
            String dest=inp.nextLine();

            File f1=new File(source);
            File f2=new File(dest);
            copyFile(f1,f2);
        }catch(FileNotFoundException e){
            System.out.println("File not found ...... ");
            e.getStackTrace();
        }

    }
    public static void copyFile(File f1,File f2) throws Exception {
        
            FileReader input=new FileReader(f1);
            FileWriter output=new FileWriter(f2);
        try{
            int ch=input.read();
            while(ch!=-1){
                output.write(ch);
                System.out.println(ch);
                ch=input.read();
             }
        }
        finally{
            if(input!=null){
                input.close();
            }
            if(output!=null){
                output.close();
            }
            System.out.println("File copied successfully"); 
        }
    }
}