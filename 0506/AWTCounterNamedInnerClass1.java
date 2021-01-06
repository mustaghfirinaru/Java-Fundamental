import java.awt.*;
import java.awt.event.*;

public class AWTCounterNamedInnerClass1 extends Frame{

    /**
     * @author A11201811347 Moh. Mustaghfirin Al Farizi
     */
    private static final long serialVersionUID = 419861319889906401L;
    private TextField tfCount;
    private int count=0;
    AWTCounterNamedInnerClass1(){
        setLayout(new FlowLayout());
        add(new Label("Counter"));
        tfCount=new TextField(count +"",10);
        tfCount.setEditable(false);
        add(tfCount);

        Button btnCount=new Button("Count");
        add(btnCount);
        btnCount.addActionListener(new BtnListener());
        setSize(250,100);
        setTitle("AWT Counter");
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
    }
    public static void main(String[] args) {
        new AWTCounterNamedInnerClass1();
    }
    private class BtnListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            tfCount.setText(count+"");

        }

    }
}