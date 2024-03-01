// pure abstraction using interfaces in Java
interface Dept{
    int a=90;
    void classRooms();
    void seminarHall();
    void washRooms();
    void staffRooms();
}
 interface DeptMEC{
    int a=20;
    void classRooms();
    void seminarHall();
    void washRooms();
    void staffRooms();
}
class CseDept implements  Dept,DeptMEC{
   public void classRooms(){
        System.out.println("Cse dept have 12 class rooms"+a);
    }
    public void staffRooms(){
        System.out.println("Cse dept have satff rooms");
    }
    public void seminarHall(){
        System.out.println("Cse dept has one seminar hall");
    }
    public void washRooms(){
        System.out.println("Cse dept have wash rooms");
    }
}
class Interfaces{
    public static void main(String[] args) {
        CseDept cse=new CseDept();
        cse.classRooms();
        cse.staffRooms();
        cse.washRooms();
    }
}