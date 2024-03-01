class Parent{
        int a=10;
        int b=20;
        void add(){
            System.out.println("Sum of a , b is : "+a+b);
        }
        private void helloPrivate(){
            System .out.println("Private Hello Method") ;
        }
        public void helloPublic(){
            System .out.println("Public Hello Method") ;
        }
        protected void helloProtected(){
            System .out.println("Protected Hello Method") ;
        }
}
class PPPInheri extends Parent{
    public static char main(String [] args){
        Parent obj=new Parent();
        //obj.helloPrivate();
        obj.helloProtected();
        obj.helloPublic();
        return 'a';
    }
}