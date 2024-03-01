class ElderSis{
        int numOfDressesE=10;
        void displayNumOfDressesE(){
        System.out.println("Number of Elder sister dresses : "+numOfDressesE);
        }
}
class YoungerSis extends ElderSis{
        int numOfDressesY=10;
        void displayNumOfDressesY(){
        numOfDressesY=numOfDressesY+numOfDressesE;
        System.out.println("Number of Younger sister dresses : " + numOfDressesY);
    }
}
class SimpleInheri{
    public static void main(String[] args) {
        YoungerSis obj=new YoungerSis();
        obj.displayNumOfDressesE();
        obj.displayNumOfDressesY();        
    }
}