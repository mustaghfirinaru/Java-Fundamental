import java.awt.*; 
import java.awt.event.*; 

public class AWTAccumulatorLabel extends Frame implements ActionListener {
    /**
     * @author A11201811347
     */
    private static final long serialVersionUID = -4765808330498680062L;
    private Label lblInput;
    private Label lblOutput; 
    private TextField tfInput; 
    private Label tfOutput; 
    private int sum = 0; 
    public AWTAccumulatorLabel() {
        setLayout(new FlowLayout()); 
        setLocationRelativeTo(null);
        lblInput = new Label("Enter an integer : "); 
        add(lblInput); 
        tfInput = new TextField(10); 
        add(tfInput); 
        tfInput.addActionListener(this);
        lblOutput = new Label("The Accumulated sum is :"); 
        add(lblOutput); 
        tfOutput = new Label("         ");  
        add(tfOutput); 
        setTitle("AWT Accumulator Label"); 
        setSize(300, 120); 
        setVisible(true); 
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();
            }  
        });  
    }

    public static void main(String[] args) {
        new AWTAccumulatorLabel();
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        int numberIn = Integer.parseInt(tfInput.getText());
        sum += numberIn; 
        tfInput.setText(""); 
        tfOutput.setText("" + sum); 
    }
}