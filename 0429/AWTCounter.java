import java.awt.*;
import java.awt.event.*;
public class AWTCounter extends Frame implements ActionListener{
    /**
     * @author A11201811347
     */
    private static final long serialVersionUID = 8011450965862746413L;
    private TextField tf;
    private int count=18;
    AWTCounter() {
        super("AWTCounter");
        tf=new TextField(count+"",8);
        
        setLocationRelativeTo(null);
        Button btn=new Button("Count");
        setLayout(new FlowLayout());
        add(new Label("Counter"));
        tf.setEditable(false);
        add(tf);
        add(btn);
        btn.addActionListener(this);
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();
            }  
        });  
    }
    @Override
        public void actionPerformed(ActionEvent e) {
            count=Integer.parseInt(tf.getText());
            count++;
            tf.setText(count+"");
        }
}