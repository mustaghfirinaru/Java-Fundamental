import java.awt.*;
import java.awt.event.*;

public class PhonePad extends Frame {
    /**
     * @author A11201811347
     */
    private static final long serialVersionUID = 442328587882074257L;

    private Panel p1;
    private Panel p2;
    private Button tb;
    private TextField tf;
    private boolean pressed=false;

    PhonePad() {
        setLayout(new BorderLayout());
        setSize(400, 400);
        setLocationRelativeTo(null);
        p1 = new Panel();
        p1.setLayout(new BorderLayout());
        makeDisplay(p1);
        add(p1, "North");
        p2 = new Panel();
        p2.setLayout(new GridLayout(4, 3));
        makeButton(p2, "1", "1");
        makeButton(p2, "2 - abc", "2abc");
        makeButton(p2, "3 - def", "3def");
        makeButton(p2, "4 - ghi", "4ghi");
        makeButton(p2, "5 - jkl", "5jkl");
        makeButton(p2, "6 - mno", "6mno");
        makeButton(p2, "7 - pqrs", "7pqrs");
        makeButton(p2, "8 - tuv", "8tuv");
        makeButton(p2, "9 - wxyz", "9wxyz");
        makeButton(p2, "*", "*");
        makeButton(p2, "O - oper", "0oper");
        makeButton(p2, "#", "#");
        tb = new Button("Shift");
        tb.addActionListener(new ShiftListener("Shift Pressed"));
        p2.add(tb);
        add(p2, "Center");
        setVisible(true);
        
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                System.exit(0);
            }  
        });
    }

    public void makeDisplay(Panel p) {
        tf = new TextField(20);
        tf.setEnabled(false);
        p.add(tf, "Center");
    }

    public void makeButton(Panel p, String label, String val) {
        Button button = new Button(label);
        button.addActionListener(new TelephoneButtonListener(val));
        p.add(button);
    }

    private class TelephoneButtonListener implements ActionListener {
        private String value;

        public TelephoneButtonListener(String val) {
            value = val;
        }

        public void actionPerformed(ActionEvent event) {
            if(pressed==false) tf.setText(tf.getText()+" "+String.valueOf(value.charAt(0)));
            else tf.setText(tf.getText()+"   "+value.substring(1));
        }
    }
    private class ShiftListener implements ActionListener {
        public ShiftListener(String val) {
        }

        public void actionPerformed(ActionEvent event) {
            if(pressed==false){
                tb.setLabel("Shift Pressed");
                pressed=true;
            }
            else{
                tb.setLabel("Shift");
                pressed=false;

            }
        }
    }
    public static void main(String[] args) {
        new PhonePad();
    }

}