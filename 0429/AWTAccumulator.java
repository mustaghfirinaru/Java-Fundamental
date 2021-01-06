import java.awt.*; 
import java.awt.event.*; 

public class AWTAccumulator extends Frame implements ActionListener {
    /**
     * @author A11201811347
     */
    private static final long serialVersionUID = 4849801418623904203L;
    private Label lblInput; 
    private Label lblOutput; 
    private TextField tfInput; 
    private TextField tfOutput; 
    private int sum = 0; 
    public AWTAccumulator() {
        setLayout(new FlowLayout()); 
        setLocationRelativeTo(null);
        lblInput = new Label("Enter an integer : "); 
        add(lblInput); 
        tfInput = new TextField(10); 
        add(tfInput); 
        tfInput.addActionListener(this);
        lblOutput = new Label("Accumulated sum is : "); 
        add(lblOutput); 
        tfOutput = new TextField(10); 
        tfOutput.setEditable(false); 
        add(tfOutput); 
        setTitle("AWT Accumulator"); 
        setSize(350, 120); 
        setVisible(true); 
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();
            }  
        });  
    }

    public static void main(String[] args) {
        new AWTAccumulator();
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        int numberIn = Integer.parseInt(tfInput.getText());
        sum += numberIn; 
        tfInput.setText(""); 
        tfOutput.setText("" + sum); 
    }
}