import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

import java.applet.*;
/*
<applet code="MyApplet.class" width=200 height=100>
</applet>
*/
public class MyApplet5 extends Applet {
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
			 }
		});
		panelcoor.addMouseListener(new MouseInputListener(){
			@Override
			public void mouseMoved(MouseEvent e) {	
			}
			@Override
			public void mouseDragged(MouseEvent e) {
			}
		
			@Override
			public void mouseReleased(MouseEvent e) {
				tacoor.append("Mouse released detected on MyApplet5$BlankArea\n");
			}
		
			@Override
			public void mousePressed(MouseEvent e) {
				tacoor.append("Mouse pressed detected on MyApplet5$BlankArea\n");
			}
		
			@Override
			public void mouseExited(MouseEvent e) {
				tacoor.append("Mouse exited detected on MyApplet5$BlankArea\n");
			}
		
			@Override
			public void mouseEntered(MouseEvent e) {
				tacoor.append("Mouse entered detected on MyApplet5$BlankArea\n");
			}
		
			@Override
			public void mouseClicked(MouseEvent e) {
				tacoor.append("Mouse (# of clicks :"+e.getButton()+") detected on MyApplet5$BlankArea\n");
				
			}
		});
		panelcoor.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {}

			@Override
			public void keyPressed(KeyEvent e) {
				tacoor.append("Key "+e.getKeyChar()+" pressed detected on MyApplet5$BlankArea\n");
			}
		});
		
		panelcoor.setFocusable(true);
		panelcoor.requestFocusInWindow();
	 }
}