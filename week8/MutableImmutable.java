import java.lang.*;
public class MutableImmutable {
    public static void main(String[] args) {
        Integer a=new Integer(20);//mutable
        String s="swathi";//mutable
        float f=2.3f;//mutable
        StringBuffer str=new StringBuffer("good");//immutable
        StringBuilder strBuild=new StringBuilder("MVGR ");//immutable
        Boolean bool=false;//immutable

        System.out.println("int before : "+System.identityHashCode(a));
        a=90+1;
        System.out.println("int after : "+System.identityHashCode(a));

        System.out.println("boolean before : "+System.identityHashCode(bool));
        bool=true;
        System.out.println("boolean after : "+System.identityHashCode(bool));

        System.out.println("String before : "+System.identityHashCode(s));
        s=s+"jetti";
        System.out.println("String after : "+System.identityHashCode(s));

        System.out.println("float before : "+System.identityHashCode(f));
        f=f+1;
        System.out.println("float after : "+System.identityHashCode(f));

        System.out.println("String buffer before : "+System.identityHashCode(str));
        str.append("morning");
        System.out.println("String beffer after : "+System.identityHashCode(str));

        System.out.println("String builder before : "+System.identityHashCode(strBuild));
        strBuild.append("College");
        System.out.println("String builder after : "+System.identityHashCode(strBuild));

    }
}