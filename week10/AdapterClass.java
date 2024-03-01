import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.*;
class AdapterClass{
    AdapterClass(){
        Frame f=new Frame("Adapter classes");
        f.setSize(250,250);
        f.setVisible(true);
        f.setResizable(false);
        f.setLayout(null);

        Label status=new Label("");
        status.setBounds(50,50,100,20);
        status.setBackground(Color.gray);
        f.add(status);

        // Button b=new Button("Click");
        // b.setBounds(50,100,50,20);
        // b.setBackground(Color.gray);
        // f.add(b);

        f.addMouseListener(
            new MouseAdapter(){
                public void mouseEntered(MouseEvent e){
                    status.setText("Mouse Enterd");
                }
            }
        );

        f.addMouseListener(
            new MouseAdapter(){
                public void mouseExited(MouseEvent e){
                    status.setText("Mouse Exited");
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
    }
    public static void main(String[] args) {
        AdapterClass obj=new AdapterClass();
    }
}