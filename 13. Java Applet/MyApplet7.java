import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.applet.*;

import java.util.ArrayList;
import java.util.List;
public class MyApplet7 extends Applet {

	private int currentX, currentY, oldX, oldY;
	private PaintPanel canvas = new PaintPanel();
	private JPanel panelleft;
	private JPanel paneltop;
	private JComboBox c1;
	private Color color = Color.BLACK;
	private String shape="Rect";
	private Graphics g;
	public void init() {
		setLayout(new BorderLayout());
		canvas = new PaintPanel();
		panelleft = new JPanel();
		paneltop = new JPanel();
		panelleft.setLayout(new FlowLayout());
		panelleft.setPreferredSize(new Dimension(100, 100));
		JRadioButton r1 = new JRadioButton("Line");
		JRadioButton r2 = new JRadioButton("Oval");
		JRadioButton r3 = new JRadioButton("Rectangle");
		JRadioButton r4 = new JRadioButton("RoundRect");
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		r1.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent e) {shape="Line";}});
		r2.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent e) {shape="Oval";}});
		r3.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent e) {shape="Rect";}});
		r4.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent e) {shape="RRect";}});
		panelleft.add(r1);
		panelleft.add(r2);
		panelleft.add(r3);
		panelleft.add(r4);
		canvas.setBackground(Color.WHITE);
		canvas.addMouseListener(new MouseInputListener() {
			public void mousePressed(MouseEvent evt) {
				oldX = evt.getX();
				oldY = evt.getY();
			}

			public void mouseReleased(MouseEvent evt) {
				currentX = evt.getX();
				currentY = evt.getY();
				if(shape.equals("Rect")) canvas.paintrec(g);
				else if(shape.equals("Line")) canvas.paintlin(g);
				else if(shape.equals("Oval")) canvas.paintova(g);
				else  canvas.paintrrec(g);
			}

			public void mouseDragged(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseMoved(MouseEvent e) {
			}

		});
		paneltop.add(new JLabel("Color : "));

		String s1[] = { "Black", "Red", "Blue", "Cyan", "Green" };
		c1 = new JComboBox(s1);
		paneltop.add(c1);
		add(canvas, BorderLayout.CENTER);
		add(panelleft, BorderLayout.WEST);
		add(paneltop, BorderLayout.NORTH);
		c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
				if(c1.getSelectedItem().equals("Black")){
					color=Color.BLACK;
				}
				if(c1.getSelectedItem().equals("Blue")){
					color=Color.BLUE;
				}
				if(c1.getSelectedItem().equals("Red")){
					color=Color.RED;
				}
				if(c1.getSelectedItem().equals("Cyan")){
					color=Color.CYAN;
				}
				if(c1.getSelectedItem().equals("Green")){
					color=Color.GREEN;
				}
            }
		});
		
		g=getGraphics();
	}

	class PaintPanel extends JPanel {
		public void paintrec (Graphics g) {
			g.drawRect (oldX, oldY, currentX - oldX, currentY - oldY);
			repaint();
		  }public void paintlin (Graphics g) {
			g.drawLine(oldX, oldY, currentX, currentY);
			repaint();
		  }
		  public void paintova (Graphics g) {
			g.drawOval(oldX, oldY, currentX - oldX, currentY - oldY);
			repaint();
		  }public void paintrrec (Graphics g) {
			g.drawRoundRect (oldX, oldY, currentX - oldX, currentY - oldY,20,20);
			repaint();
		  }
		@Override
		public void paintComponent(Graphics g) {
			// super.paintComponent(g);
			// g.setColor(color);
			// paintova (g);
			// Graphics2D g2d = (Graphics2D) g.create();
			// g2d.drawRect(oldX, oldY, currentX - oldX, currentY - oldY);
			// g2d.dispose();

		}
	}
}