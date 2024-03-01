import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JOptionPane;
class LoginPage{
    Label FirstNameLabel,LastNameLabel,EmailLabel,RegisterNoLabel,welcome;
    TextField StatusLabel;
    TextField FirstNameTxt,LastNameTxt,EmailTxt,RegisterNoTxt;
    Button SignUp;
    String dept[]={"CSE","MEC","ECE","IT","CIVIL","EEE","CHEM"};
    LoginPage(){
        Frame f=new Frame("Event registration Form");
        welcome=new Label("WELCOME TO TECH CRECITA");
        welcome.setBounds(100,50,200,30);
        welcome.setBackground(Color.pink);

        f.setSize(400,400);
        f.setVisible(true);
        f.setResizable(false);
        f.setLayout(null);

        FirstNameLabel=new Label(" NAME:");
        FirstNameLabel.setBackground(Color.gray);
        FirstNameLabel.setBounds(50,100,80,20);

        FirstNameTxt=new TextField();
        //FirstNameTxt.setBackground(Color.gray);
        FirstNameTxt.setBounds(140,100,100,20);

        LastNameTxt=new TextField();
        //LastNameTxt.setBackground(Color.gray);
        LastNameTxt.setBounds(250,100,100,20);

        Choice ch=new Choice();
        ch.setBounds(100,150,100,20);
        ch.add("CSE");
        ch.add("ECE");
        ch.add("MEC");
        f.add(ch);

       Label FirstNameTxtLabel=new Label("first name");
        //FirstNameTxt.setBackground(Color.gray);
        FirstNameTxtLabel.setBounds(140,130,100,20);
        f.add(FirstNameTxtLabel);

        LastNameLabel=new Label("last name");
        //LastNameLabel.setBackground(Color.gray);
        LastNameLabel.setBounds(250,130,100,20);

        

        EmailLabel=new Label("EMAIL:");
        EmailLabel.setBackground(Color.gray);
        EmailLabel.setBounds(100,180,80,20);

        EmailTxt=new TextField();
        //EmailTxt.setBackground(Color.gray);
        EmailTxt.setBounds(200,180,100,20);

        RegisterNoLabel=new Label("REGISTER NO:");
        RegisterNoLabel.setBackground(Color.gray);
        RegisterNoLabel.setBounds(100,220,80,20);

        RegisterNoTxt=new TextField();
        //RegisterNoTxt.setBackground(Color.gray);
        RegisterNoTxt.setBounds(200,220,100,20);

        SignUp=new Button("SIGN UP");
        SignUp.setBackground(Color.gray);
        SignUp.setBounds(150,270,100,30);

        CheckboxGroup cb=new CheckboxGroup();

        Checkbox r=new Checkbox("HEllo",true,cb);
        r.setBounds(150,300,100,20);
        f.add(r);

        Checkbox r1=new Checkbox("HEllo",false,cb);
        r1.setBounds(250,300,100,20);
        f.add(r1);

        

        // StatusLabel=new TextField("");
        // //StatusLabel.setBackground(Color.green);
        // StatusLabel.setBounds(150,320,100,30);

        f.add(welcome);
        f.add(FirstNameLabel);
        f.add(FirstNameTxt);
        f.add(LastNameLabel);
        f.add(LastNameTxt);
        f.add(EmailLabel);
        f.add(EmailTxt);
        f.add(RegisterNoLabel);
        f.add(RegisterNoTxt);
        f.add(SignUp);
        //f.add(StatusLabel);

        SignUp.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    // StatusLabel.setText("Sign up success");
                    // StatusLabel.setBackground(Color.green);
                    JOptionPane.showMessageDialog(f,"Login Success");
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

        // f.addMouseListener(
        //     new MouseAdapter(){
        //         public void mouseEntered(MouseEvent e){
        //             StatusLabel.setText("mouse entered");
        //         }
        //     }
        // );
        // f.addMouseListener(
        //     new MouseAdapter(){
        //         public void mouseClicked(MouseEvent e){
        //             StatusLabel.setText("mouse clicked");
        //         }
        //     }
        // );
        // f.addMouseListener(
        //     new MouseAdapter(){
        //         public void mouseMoved(MouseEvent e){
        //             StatusLabel.setText("mouse moved");
        //         }
        //     }
        // );
        // EmailTxt. addKeyListener(
        //     new KeyAdapter(){
        //         public void keyTyped(KeyEvent e){
        //             StatusLabel.setText("key pressed");
        //         }
        //     }
        // );
    }
    public static void main(String[] args) {
        new LoginPage();
    }
}