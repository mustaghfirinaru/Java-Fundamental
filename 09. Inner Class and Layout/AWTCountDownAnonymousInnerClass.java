import java.awt.*;
import java.awt.event.*;

public class AWTCountDownAnonymousInnerClass extends Frame {


    /**
     * @author A11201811347 Moh. Mustaghfirin Al Farizi
     */
    private static final long serialVersionUID = -3590483024998647016L;
    private TextField tfCount;
    private int count=88;
    AWTCountDownAnonymousInnerClass(){
        setLayout(new FlowLayout());
        add(new Label("Counter"));
        tfCount=new TextField(count +"",10);
        add(tfCount);

        Button btnCount=new Button("Count Down");
        add(btnCount);
        btnCount.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                count = Integer.parseInt(tfCount.getText());
                count--;
                tfCount.setText(count+"");
            }
        });
        setSize(250,100);
        setTitle("AWT CounterDown");
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
    }
    public static void main(String[] args) {
        new AWTCountDownAnonymousInnerClass();
    }
}