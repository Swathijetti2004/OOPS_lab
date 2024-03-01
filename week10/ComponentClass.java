import java.awt.Component;
import java.awt.Container;
import java.awt.*;
class ComponentClass{
    ComponentClass(){
        //Component c=new Component();
        Frame f=new Frame("Event registration Form");
        Label welcome=new Label("WELCOME TO TECH CRECITA");
        welcome.setBounds(100,50,200,30);
        //welcome.setBackground(Color.pink);
        f.add(Component welcome);
    }
    public static void main(String[] args) {
        ComponentClass obj=new ComponentClass();
    }
}