import java.awt.*;
import java.applet.*;
/*
<applet code="MyApplet.class" width=200 height=100>
</applet>
*/
public class MyApplet3 extends Applet {
	public void paint(Graphics g) {
		g.setFont(new Font("bold", Font.BOLD, 20));
		g.drawString("Hello Applet World!", getWidth()/2-100,getHeight()/2);
	}
}