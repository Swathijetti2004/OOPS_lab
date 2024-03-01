/*Using a constructor and destructor in Java, Write a Java class 'Student' and assign the following :
1. default constructor (string collegeName = "MVGR", int collegeCode=33)
2. parameterized constructor (string fullName, double semPerentage)
Also create the objects respectivelty asd display their values. */
class ParamConst{
        String fullName;
        double semPerentage;
        String collegeName;
        int collegeCode;
        ParamConst(){
            collegeName="MVGR";
            collegeCode=33;
        }
        ParamConst(String fullName,double semPerentage){
            this.fullName=fullName;
            this.semPerentage=semPerentage;
        }
        ParamConst(ParamConst p1,ParamConst p2){
            System.out.println("Name : "+p1.fullName);
            System.out.println("Sempercentage : "+p1.semPerentage);
            System.out.println("College Name : "+p2.collegeName);
            System.out.println("college Code : "+p2.collegeCode);
        }
        public static void main(String[] args) {
            ParamConst obj1=new ParamConst("Radha",81.999);
            ParamConst obj2=new ParamConst();
            ParamConst obj=new ParamConst(obj1,obj2);
            obj=null;
            obj1=null;
            obj2=null;
            System.gc();
        }
        protected void finalize(){
            System.out.println("Dead");
        }
}