import java.applet.Applet;  
import java.awt.Graphics;

public class AppletDemo extends Applet{  
    public void paint(Graphics g){  
        g.drawString("welcome",100,100);
    }
}
/*<html>
    <applet code="AppletDemo",width=400,height=100>
    </applet>
</html> */