
import java.awt.*;
import java.awt.event.*;
public class  AWTCounterAnonymousInnerClass extends Frame {
    /**
     * @author A11201811347
     */
    private static final long serialVersionUID = 8011450965862746413L;
    private TextField tf;
    private int count=18;
      AWTCounterAnonymousInnerClass() {
        super("AWTCounterAnonymousInnerClass");
        tf=new TextField(count+"",8);
        setLocationRelativeTo(null);
        Button btn=new Button("Count");
        setLayout(new FlowLayout());
        add(new Label("Counter"));
        add(tf);
        add(btn);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                count=Integer.parseInt(tf.getText());
                count++;
                tf.setText(count+"");
        }
        });
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();
            }  
        });  
    }
    public static void main(String[] args) {
          AWTCounterAnonymousInnerClass a= new   AWTCounterAnonymousInnerClass();
        a.setSize(250, 100);
        a.setVisible(true);
    }
}