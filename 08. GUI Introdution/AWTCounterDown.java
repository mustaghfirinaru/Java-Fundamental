import java.awt.*;
import java.awt.event.*;
public class AWTCounterDown extends Frame {
    /**
     * @author A11201811347
     */
    private static final long serialVersionUID = 8011450965862746413L;
    private TextField tf;
    private int count=88;
    AWTCounterDown() {
        super("AWTCounterDown");
        setLocationRelativeTo(null);
        tf=new TextField(count+"",8);
        Button btn=new Button("Count");
        setLayout(new FlowLayout());
        add(new Label("Counter"));
        add(tf);
        add(btn);
        btn.addActionListener(new btn());
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();
            }  
        });  
    }
    public static void main(String[] args) {
        AWTCounterDown a= new AWTCounterDown();
        a.setSize(250, 100);
        a.setVisible(true);
    }
    public class btn implements ActionListener{
        btn(){}
        @Override
        public void actionPerformed(ActionEvent e) {
            count=Integer.parseInt(tf.getText());
            count--;
            tf.setText(count+"");
        }
    }
}