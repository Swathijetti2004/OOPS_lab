/*Write a Java class 'AccessSpecifierDemo' with the following members:
Member Variables :
1. private int priVar
2. protected int proVar
3. public int pubVar
Member Methods:
1. public void setVar(int priValue,int proValue, int pubValue)
2. public void getVar()
Assign values for each member variable(priVar,proVar,pubvar) and using methods(setVar(),getVar()) and disaply them */
class AccessSpecifierDemo{
    private int priVar;
    protected int proVar;
    public int pubVar;
    public void setVar(int priValue,int proValue, int pubValue){
            this.priVar=priValue;
            this.proVar=proValue;
            this.pubVar=pubValue;
        }
    public void getVar() {
            System.out.println("Private variable : "+priVar);
            System.out.println("Protected variable : "+proVar);
            System.out.println("Public variable : "+pubVar);
        } 
}
class AbsEncap{
    public static void main(String[] args) {
        AccessSpecifierDemo obj=new AccessSpecifierDemo();
        obj.setVar(10,20,30);
        obj.getVar();
    }
}