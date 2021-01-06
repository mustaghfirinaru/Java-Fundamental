import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingAdder extends JFrame {
    /**
     * @author Mustaghfirin Al Farizi A11201811347
     */
    private static final long serialVersionUID = -7020830205428607329L;
    private JTextField tfNumber1, tfNumber2, tfResult;
    private JButton btnAdd, btnClear;
    private int number1, number2, result;

    public SwingAdder() {
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(4,2));
        cp.add(new JLabel("First Number "));
        btnClear = new JButton("CLEAR");
        btnAdd= new JButton("ADD");
        tfNumber1=new JTextField();
        tfNumber2=new JTextField();
        tfResult=new JTextField();
        btnAdd.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    number1=Integer.parseInt(tfNumber1.getText());
                    number2=Integer.parseInt(tfNumber2.getText());
                } catch (NumberFormatException exp) {
                    number1=0;
                    number2=0;
                }
                result=number1+number2;
                tfResult.setText(result+"");
            }
        });
        btnClear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tfNumber1.setText("");
                tfNumber2.setText("");
                tfResult.setText("");
            }
        });
        cp.add(tfNumber1);
        cp.add(new JLabel("Second Number "));
        cp.add(tfNumber2);
        cp.add(new JLabel("Result "));
        cp.add(tfResult);
        cp.add(btnAdd);
        cp.add(btnClear);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Swing Adder");
        setLocationRelativeTo(null);
        setSize(300, 170);
        setVisible(true);
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingAdder();
            }
        });
    }
}