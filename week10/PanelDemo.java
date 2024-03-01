import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.*;
class LoginValid{
    Label userLabel,passwordLabel;
    TextField userText,passText, status;
    Button submit;
    LoginValid(){
        Frame f=new Frame("Login Form");
        f.setSize(400,400);
        f.setVisible(true);
        f.setResizable(false);
        f.setLayout(null);
        f.setIconImage(Image );

       Label FirstNameLabel=new Label("FIRST NAME:");
        FirstNameLabel.setBackground(Color.gray);
        FirstNameLabel.setBounds(100,100,80,20);

        Panel p=new Panel();
        p.setBackground(Color.gray);
        p.add(FirstNameLabel);
        p.setBounds(20,20,50,50);

        f.add(p);
    }
}
class PanelDemo{
    public static void main(String[] args) {
        LoginValid obj=new LoginValid();
    }
}
