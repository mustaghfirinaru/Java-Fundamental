import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

import java.applet.*;
/*
<applet code="MyApplet.class" width=200 height=100>
</applet>
*/
public class MyApplet6 extends Applet  {
	JPanel panellayout;
	JComboBox c1,c2; 
	JTextField tfin,tfout;
	JLabel lbinput,lboutput;
	public void init() {
		panellayout=new JPanel();  
		// setLayout(new FlowLayout());
		panellayout.setLayout(new GridLayout(2,4));
		tfin=new JTextField();
		tfout=new JTextField();
		lbinput=new JLabel("Input");
		lboutput=new JLabel("Output");
		String s1[] = { "Feet", "Inches", "Centimeters", "Meters", "Kilometers" }; 
        c1 = new JComboBox(s1); 
        c2 = new JComboBox(s1); 
		panellayout.add(lbinput);
		panellayout.add(tfin);
		panellayout.add(lboutput);
		panellayout.add(tfout);
		panellayout.add(new JLabel("Unit:"));
		panellayout.add(c1);
		panellayout.add(new JLabel("Unit:"));
		panellayout.add(c2);
		add(panellayout);
		c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
				double calc=0;
				try {
					
					String in = (String) c1.getSelectedItem();
					String out = (String) c2.getSelectedItem();
					if(in.equals("Feet")){
						calc=Float.parseFloat(tfin.getText())/1;
					}
					if(in.equals("Inches")){
						calc=Float.parseFloat(tfin.getText())/12;
					}
					if(in.equals("Centimeters")){
						calc=Float.parseFloat(tfin.getText())/30;
					}
					if(in.equals("Meters")){
						calc=Float.parseFloat(tfin.getText())/0.3048;
					}
					if(in.equals("Kilometers")){
						calc=Float.parseFloat(tfin.getText())/0.0003048;
					}
					if(out.equals("Feet")){
						calc=calc*1;
						tfout.setText(String.format("%.6f", calc)+"");
					}
					if(out.equals("Inches")){
						calc=calc*12;
						tfout.setText(String.format("%.6f", calc)+"");
					}
					if(out.equals("Centimeters")){
						calc=calc*30;
						tfout.setText(String.format("%.6f", calc)+"");
					}
					if(out.equals("Meters")){
						calc=calc*0.3048;
						tfout.setText(String.format("%.6f", calc)+"");
					}
					if(out.equals("Kilometers")){
						calc=calc*0.0003048;
						tfout.setText(String.format("%.6f", calc)+"");
					}
					repaint();
				} catch (NumberFormatException ez) {
					
				}
            }
		});
		c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
				double calc=0;
				try {
					
					String in = (String) c1.getSelectedItem();
					String out = (String) c2.getSelectedItem();
					if(in.equals("Feet")){
						calc=Float.parseFloat(tfin.getText())/1;
					}
					if(in.equals("Inches")){
						calc=Float.parseFloat(tfin.getText())/12;
					}
					if(in.equals("Centimeters")){
						calc=Float.parseFloat(tfin.getText())/30;
					}
					if(in.equals("Meters")){
						calc=Float.parseFloat(tfin.getText())/0.3048;
					}
					if(in.equals("Kilometers")){
						calc=Float.parseFloat(tfin.getText())/0.0003048;
					}
					if(out.equals("Feet")){
						calc=calc*1;
						tfout.setText(String.format("%.6f", calc)+"");
					}
					if(out.equals("Inches")){
						calc=calc*12;
						tfout.setText(String.format("%.6f", calc)+"");
					}
					if(out.equals("Centimeters")){
						calc=calc*30;
						tfout.setText(String.format("%.6f", calc)+"");
					}
					if(out.equals("Meters")){
						calc=calc*0.3048;
						tfout.setText(String.format("%.6f", calc)+"");
					}
					if(out.equals("Kilometers")){
						calc=calc*0.0003048;
						tfout.setText(String.format("%.6f", calc)+"");
					}
					repaint();
				} catch (NumberFormatException ez) {
					
				}
            }
		});
	}
}