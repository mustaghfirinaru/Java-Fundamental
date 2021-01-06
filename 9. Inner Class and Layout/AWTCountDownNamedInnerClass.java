import java.awt.*;
import java.awt.event.*;

public class AWTCountDownNamedInnerClass extends Frame {
    

    /**
     * @author A11201811347 Moh. Mustaghfirin Al Farizi
     */
    private static final long serialVersionUID = 5817192226834964815L;
    private TextField tfCount;
    private int count=88;
    AWTCountDownNamedInnerClass(){
        setLayout(new FlowLayout());
        add(new Label("Counter"));
        tfCount=new TextField(count +"",10);
        add(tfCount);

        Button btnCount=new Button("Count Down");
        add(btnCount);
        btnCount.addActionListener(new BtnListener());
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
        new AWTCountDownNamedInnerClass();
    }
    private class BtnListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            count=Integer.parseInt(tfCount.getText());
            count--;
            tfCount.setText(count+"");

        }

    }
}