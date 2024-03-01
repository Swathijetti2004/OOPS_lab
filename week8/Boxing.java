import java.lang.*;
import java.util.*;
class Boxing{
    public static void main(String[] args) {
        //ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
        List<String> names =new ArrayList<>();
        names.add("swathi");
        names.add("Lakshmi");
        names.add("Sowmya");
        System.out.println("Array of names are :"+names);
        names.remove("Lakshmi");
        System.out.println("Array of names are after removing :"+names);
        names.clear();
        System.out.println("Array of names are after clearig :"+names);
       
        Integer n1=new Integer(5);//using wrapper class
        int n2=n1;//premitive data type
        System.out.println("num 1 value is :"+n1 + "\nnum 2 value is : " + n2);
        n1+=1;
        System.out.println("After incrementing num 1 value is :"+n1 + "\nnum 2 value is : " + n2);
    }
}