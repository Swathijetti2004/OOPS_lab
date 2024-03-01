import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.*;

class LoginValid{
    Label userLabel,passwordLabel;
    TextField userText,passText, status;
    Button submit;
    LoginValid(){
        Frame f=new Frame("Login Form");

        f.setSize(250,250);
        f.setVisible(true);
        f.setResizable(false);
        f.setLayout(null);

        userLabel=new Label("User name:");
        userLabel.setBackground(Color.gray);
        userLabel.setBounds(20,50,60,20);

        userText=new TextField(20);
        userText.setBounds(100,50,60,20);

        passwordLabel=new Label("Password:");
        passwordLabel.setBackground(Color.gray);
        passwordLabel.setBounds(20,100,60,20);

        passText=new TextField(20);
        passText.setBounds(100,100,60,20);
        passText.setEchoChar('*');

        submit=new Button("Submit");
        submit.setBackground(Color.gray);
        submit.setBounds(50,130,50,20);

        f.add(userLabel);
        f.add(passwordLabel);
        f.add(userText);
        f.add(passText);
        f.add(submit);

        submit.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    //Success objs=new Success();
                    if(userText.getText().equals("Student") && passText.getText().equals("1234")){
                        JOptionPane.showMessageDialog(f,"Login success");
                    }else{
                        JOptionPane.showMessageDialog(f,"Login Failure");
                    }
                }
            }
        );
        f.addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    f.dispose();
                }
            }
        );
        f.addKeyListener(
            new KeyAdapter() {
                public void keyTyped(KeyEvent e){
                    userLabel.setText("Clicked");
                }
            }
        );
        f.addWindowListener(
            new WindowAdapter() {
                public void windowActivated(WindowEvent e){
                    System.out.println("Closed drtdrt");
                }
            }
        );
        
    }

    public static void main(String[] args) {
        LoginValid obj=new LoginValid();    
     }
}
class Success{
    TextField statusCondition;
    Success(){
        Frame fs=new Frame("Msg Promt");
        fs.setSize(200,200);
        fs.setVisible(true);
        fs.setResizable(false);
        fs.setLayout(null);

        statusCondition=new TextField(40);
        statusCondition.setBackground(Color.gray);
        statusCondition.setBounds(20,80,170,30);

        fs.add(statusCondition);

        fs.addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    fs.dispose();
                }
            }
        );
    }

}