//Demonstrate method/function overriding in Java
class Parent{
    void add(int a,int b){
        System.out.println("sum of "+a+" and "+b+" is "+(a+b));
    }
    void add(float a,float b){
        System.out.println("sum of floats "+a+" and "+b+" is "+(a+b));
    }
    void add(double a,double b){
        System.out.println("sum of doubles "+a+" and "+b+" is "+(a+b));
    }
}
class Child extends Parent{
    void add(int a,int b,int c){
        System.out.println("sum C ., of "+a+" and "+b+" is "+(a+b));
    }
    void add(String a,String b){
        System.out.println("Cancatenation of "+a+" and "+b+" is "+a+" "+b);
    }
}
class Overriding{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.add(2,3);//calls the method having two integers as parameters
        obj.add(2,3,54);
        obj.add(2.3f,0.4f);//calls the method having two floating point numbers as parameters
        obj.add(2.3,0.4);//calls the method having two doubles as parameters
        obj.add("MVGR","COLLEGE");//calls the method having two strings as parameters
        obj.add(2.3f,5);//gives the heighest priority to floating method
    }
}