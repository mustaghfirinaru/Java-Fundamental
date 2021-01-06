import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingArithmetics extends JFrame {
    /**
     * @author Mustaghfirin Al Farizi A11201811347
     */
    private static final long serialVersionUID = -1632925993654074425L;
    private JTextField tfNumber1, tfNumber2, tfResult;
    private JButton btnAdd, btnSub, btnMul, btnDiv, btnMod, btnClear;
    private int number1, number2, result;

    public SwingArithmetics() {
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(6,2));
        cp.add(new JLabel("First Number "));
        btnClear = new JButton("CLEAR");
        btnAdd= new JButton("+");
        btnSub= new JButton("-");
        btnMul= new JButton("*");
        btnDiv= new JButton("/");
        btnMod= new JButton("%");
        tfNumber1=new JTextField();
        tfNumber2=new JTextField();
        tfResult=new JTextField();
        btnAdd.addActionListener(new ButtonListener());
        btnSub.addActionListener(new ButtonListener());
        btnMod.addActionListener(new ButtonListener());
        btnMul.addActionListener(new ButtonListener());
        btnDiv.addActionListener(new ButtonListener());
        btnClear.addActionListener(new ButtonListener());
        cp.add(tfNumber1);
        cp.add(new JLabel("Second Number "));
        cp.add(tfNumber2);
        cp.add(new JLabel("Result "));
        cp.add(tfResult);
        cp.add(btnAdd);
        cp.add(btnSub);
        cp.add(btnMul);
        cp.add(btnDiv);
        cp.add(btnMod);
        cp.add(btnClear);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Swing Arithmetics");
        setLocationRelativeTo(null);
        setSize(300, 245);
        setVisible(true);
    }
    class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                number1=Integer.parseInt(tfNumber1.getText());
                number2=Integer.parseInt(tfNumber2.getText());
            } catch (Exception ex) {
                number1=0;
                number2=0;
            }
            if(e.getActionCommand().equals("+")){
                result=number1+number2;
                tfResult.setText(result+"");
            }
            else if(e.getActionCommand().equals("-")){
                result=number1-number2;
                tfResult.setText(result+"");
            }
            else if(e.getActionCommand().equals("*")){
                result=number1*number2;
                tfResult.setText(result+"");
            }
            else if(e.getActionCommand().equals("/")){
                try {
                    result=number1/number2;
                    tfResult.setText(result+"");
                } catch (ArithmeticException ex) {
                    tfResult.setText("Error divided by Zero");
                }
            }
            else if(e.getActionCommand().equals("%")){try {
                result=number1%number2;
                tfResult.setText(result+"");
            } catch (ArithmeticException ex) {
                tfResult.setText("Error divided by Zero");
            }
            }
            else{
                tfNumber1.setText("");
                tfNumber2.setText("");
                tfResult.setText("");
            }

        }
        
    } 
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingArithmetics();
            }
        });
    }
}