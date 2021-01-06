import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingTemperatureConverter extends JFrame {
    /**
     * @author Mustaghfirin Al Farizi A11201811347
     */
    private static final long serialVersionUID = 5372197771493432156L;
    private JTextField tfnum1, tfnum2;
    private Double num1,num2;
    SwingTemperatureConverter(){
        Container cp=getContentPane();
        cp.setLayout(new GridLayout(2,2));
        tfnum1=new JTextField();
        tfnum2=new JTextField();
        tfnum1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(tfnum1.getText());
                num2=num1/5*9+32;
                tfnum2.setText(String.format("%.1f", num2)+"");
            }
        });
        tfnum2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                num2=Double.parseDouble(tfnum2.getText());
                num1=(num2-32)/9*4;
                tfnum1.setText(String.format("%.1f", num1)+"");
            }
        });
        cp.add(new JLabel("Celcius "));
        cp.add(tfnum1);
        cp.add(new JLabel("Fahrenheit "));
        cp.add(tfnum2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Temperature Converter");
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(300,90);
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
        
            @Override
            public void run() {
                new SwingTemperatureConverter();
            }
        });
    }
}