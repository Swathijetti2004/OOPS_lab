/*Using a constructor and destructor in Java, Write a Java class 'Student' and assign the following :
* string fullName
* int rollNum
* double semPerentage
* string collegeName
* int collegeCode */
import java.lang.*;
import java.util.Scanner;
class ConstDest{
    String fullName;
    int rollNum;
    double semPerentage;
    String collegeName;
    int collegeCode;

    ConstDest(){
        System.out.println("Hello, welcome to my program");
        fullName="Mounika";
        rollNum=69;
        semPerentage=91.4;
        collegeName="MVGR";
        collegeCode=33;
    }
    void display(){
        System.out.println("Name : "+fullName);
        System.out.println("RollNum : "+rollNum);
        System.out.println("Sempercentage : "+semPerentage);
        System.out.println("College Name : "+collegeName);
        System.out.println("college Code : "+collegeCode);
    }
    public static void main(String[] args) {
        ConstDest obj=new ConstDest();
        obj.display();
        obj=null;
        System.gc();
    }
    protected void finalize(){
        System.out.println("Dead");
    }
}