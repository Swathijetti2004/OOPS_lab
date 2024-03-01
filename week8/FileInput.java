import java.io.*;
class FileInput {
    public static void main(String[] args) throws IOException{
    try{
        FileOutputStream i=new FileOutputStream("abc.txt");
        System.out.println(i.getChannel());
        System.out.println(i.getFD());
        String a="dfgdfgd";
        char c[]=a.toCharArray();
        for(int j=0;j<(a.length());j++){
            i.write(c[j]);
        }

        }catch(FileNotFoundException obj){
            System.out.println("not fojt");
        }
    }
}