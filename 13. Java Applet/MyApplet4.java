import java.awt.*;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;

import java.applet.*;
/*
<applet code="MyApplet.class" width=200 height=100>
</applet>
*/
public class MyApplet4 extends Applet {
	JTextArea tacoor;
	JPanel panelcoor,panelout;
	JScrollPane scroll;
	JLabel labelcoor;
	public void init() {
		tacoor=new JTextArea();
		panelcoor=new JPanel();
		panelout=new JPanel();
		scroll = new JScrollPane(tacoor, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		labelcoor= new JLabel();  
		setLayout(new GridLayout(2,1));
		panelcoor.add(labelcoor);
		panelout.setLayout(new BorderLayout());
		panelout.add(scroll,BorderLayout.CENTER);
		add(panelcoor);
		add(panelout);
		panelcoor.addMouseMotionListener(new MouseInputAdapter() {
			public void mouseMoved(MouseEvent e) {
				labelcoor.setText("X:"+e.getX()+" Y:"+e.getY());
				tacoor.append("nMouse Moved ["+e.getX()+","+e.getY()+"]\n");
			 }
		});
	 }
}