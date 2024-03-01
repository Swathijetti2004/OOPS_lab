class Student{
    String collegeName;
    int collegeCode;
    String fullName;
    double semPerentage;
    Student(){
        collegeName="MVGR";
        collegeCode=33;
        System.out.println("College Name : "+collegeName);
        System.out.println("College Code: "+collegeCode);
    }
    Student(String fullName,double semPerentage){
        this.fullName=fullName;
        this.semPerentage=semPerentage;
        System.out.println("Name : "+fullName);
        System.out.println("Sem-Percentage : "+semPerentage);
    }
    public static void main(String []args){
        Student obj=new Student();
        Student obj2=new Student("Tanooj",95.34);
        obj=null;
        obj2=null;
        System.gc();
     }
     protected void finalize(){
         System.out.println("Destroyed!!!");
     }
}
// class ParamConstJava{
//     public static void main(String []args){
//        Student obj=new Student();
//        Student obj2=new Student("Tanooj",95.34);
//        obj=null;
//        obj2=null;
//        System.gc();
//     }
//     protected void finalize(){
//         System.out.println("Destroyed!!!");
//     }
// }