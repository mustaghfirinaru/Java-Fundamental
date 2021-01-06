import java.awt.*; 
import java.awt.event.*; 

public class AWTFactorialTextField extends Frame implements ActionListener {
    /**
     * @author A11201811347
     */
    private static final long serialVersionUID = -4765808330498680062L;
    private Label lblInput;
    private Label lblOutput; 
    private TextField tfInput; 
    private TextField tfOutput; 
    public AWTFactorialTextField() {
        setLayout(new FlowLayout()); 
        setLocationRelativeTo(null);
        lblInput = new Label("Enter an integer : "); 
        add(lblInput); 
        tfInput = new TextField(10); 
        add(tfInput); 
        tfInput.addActionListener(this);
        lblOutput = new Label("Factorial is : "); 
        add(lblOutput); 
        tfOutput = new TextField(10); 
        tfOutput.setEditable(false); 
        add(tfOutput); 
        setTitle("AWT Factorial"); 
        setSize(300, 120); 
        setVisible(true); 
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();
            }  
        });  
    }

    public static void main(String[] args) {
        new AWTFactorialTextField();
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        int count = Integer.parseInt(tfInput.getText());
        int fac=1;
        int i=1;
        while(i<=count){
            fac*=i;
            i++;
        }
        tfInput.setText(""); 
        tfOutput.setText("" + fac); 
    }
}