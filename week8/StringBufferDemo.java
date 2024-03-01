import java.lang.StringBuffer;

class StringBufferDemo{
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("Jetti");
        System.out.println(s.reverse());
        System.out.println(s.append(" Swathi"));
        System.out.println(s.insert(2,"hello"));
        System.out.println(s.replace(3,5, "mvgr"));
        System.out.println(s.delete(2,5));
        System.out.println(s.capacity());
    }
}