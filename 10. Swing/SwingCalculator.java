import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingCalculator extends JFrame {
    /**
     * @author Mustaghfirin Al Farizi A11201811347
     */
    private static final long serialVersionUID = -4539508680279965910L;
    private JTextField tfDisplay;
    private int result = 0;
    private String numberInStr = "";
    private char previousOpr = ' ';
    private char currentOpr = ' ';

    SwingCalculator() {
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        tfDisplay = new JTextField();
        tfDisplay.setAlignmentX(RIGHT_ALIGNMENT);;
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        JButton num7=new JButton("7");
        JButton num8=new JButton("8");
        JButton num9=new JButton("9");
        JButton opadd=new JButton("+");
        JButton num4=new JButton("4");
        JButton num5=new JButton("5");
        JButton num6=new JButton("6");
        JButton opsub=new JButton("-");
        JButton num1=new JButton("1");
        JButton num2=new JButton("2");
        JButton num3=new JButton("3");
        JButton opmul=new JButton("*");
        JButton clear=new JButton("C");
        JButton num0=new JButton("0");
        JButton opeq=new JButton("=");
        JButton opdiv=new JButton("/");
        num9.addActionListener(new NumberBtnListener());
        num8.addActionListener(new NumberBtnListener());
        num7.addActionListener(new NumberBtnListener());
        num6.addActionListener(new NumberBtnListener());
        num5.addActionListener(new NumberBtnListener());
        num4.addActionListener(new NumberBtnListener());
        num3.addActionListener(new NumberBtnListener());
        num2.addActionListener(new NumberBtnListener());
        num1.addActionListener(new NumberBtnListener());
        num0.addActionListener(new NumberBtnListener());
        opadd.addActionListener(new OprBtnListener());
        opsub.addActionListener(new OprBtnListener());
        opmul.addActionListener(new OprBtnListener());
        opdiv.addActionListener(new OprBtnListener());
        opeq.addActionListener(new OprBtnListener());
        panel.add(num7);
        panel.add(num8);
        panel.add(num9);
        panel.add(opadd);
        panel.add(num4);
        panel.add(num5);   
        panel.add(num6);
        panel.add(opsub);
        panel.add(num1);
        panel.add(num2);
        panel.add(num3);
        panel.add(opmul);
        panel.add(clear);
        panel.add(num0);
        panel.add(opeq);
        panel.add(opdiv);
        clear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                numberInStr="";
                tfDisplay.setText(numberInStr);
            }
        });
        cp.add(tfDisplay, BorderLayout.NORTH);
        cp.add(panel, BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Swing Calculator");
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(300, 200);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new SwingCalculator();
            }
        });
    }

    class NumberBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            numberInStr += evt.getActionCommand();
            tfDisplay.setText(numberInStr);
        }
    }
    
    class OprBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            previousOpr = currentOpr;
            currentOpr = evt.getActionCommand().charAt(0);
            if(currentOpr=='='){
                if(previousOpr=='+'){
                    result=result+Integer.parseInt(numberInStr);
                    tfDisplay.setText(result+"");
                }
                else if(previousOpr=='-'){
                    result=result-Integer.parseInt(numberInStr);
                    tfDisplay.setText(result+"");
                }
                else if(previousOpr=='/'){
                    try {
                        result=result/Integer.parseInt(numberInStr);
                        tfDisplay.setText(result+"");
                    } catch (ArithmeticException e) {
                        tfDisplay.setText("Cannot divided by 0");
                    }
                }
                else{
                    result=result*Integer.parseInt(numberInStr);
                    tfDisplay.setText(result+"");
                }
                numberInStr="";
            }
            else{
                result=Integer.parseInt(tfDisplay.getText());
                numberInStr="";
                tfDisplay.setText(result+""+currentOpr);
            }
        }
    }
}