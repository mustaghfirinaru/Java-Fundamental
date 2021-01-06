import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Steall extends Frame {
    /**
     *
     */
    private static final long serialVersionUID = 3336883214615714918L;
    private TextField tfCount;
    private Button btnCount;
    private int count = 88;
    public Steall(){
        setLayout(new FlowLayout());
        add(new Label("Counter"));
        tfCount = new TextField(count+"", 10);
        add(tfCount);
        tfCount.setEditable(false);
        btnCount = new Button("Count Down");
        add(btnCount);
        btnCount.addActionListener(new BtnListener());   
        setTitle("AWT Counter Down");
        setSize(275, 88);
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Steall();
    }
    private class BtnListener implements ActionListener {
        public BtnListener() {
        }
        @Override
        public void actionPerformed(ActionEvent ae) {
            --count;
            tfCount.setText(count+" ");
        }
    }
    
}