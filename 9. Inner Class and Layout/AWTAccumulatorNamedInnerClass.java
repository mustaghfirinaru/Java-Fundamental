import java.awt.*;
import java.awt.event.*;
class AWTAccumulatorNamedInnerClass extends Frame {

    /**
     * @author A11201811347 Moh. Mustaghfirin Al Farizi
     */
    private static final long serialVersionUID = 1L;
    private Label lblInput;
    private Label lblOutput; 
    private TextField tfInput; 
    private int sum = 0; 
    public AWTAccumulatorNamedInnerClass() {
        setLayout(new FlowLayout()); 
        setLocationRelativeTo(null);
        lblInput = new Label("Enter an integer : "); 
        add(lblInput); 
        tfInput = new TextField(10); 
        add(tfInput); 
        lblOutput = new Label("Accumulated sum is :        ",sum); 
        tfInput.addActionListener(new btnListener());
        add(lblOutput); 
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
        new AWTAccumulatorNamedInnerClass();
    }
    class btnListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int numberIn = Integer.parseInt(tfInput.getText());
            sum+=numberIn;
            tfInput.setText("");
            lblOutput.setText("Accumulated sum is : "+sum);
        }
    }
}