import java.awt.*;
import java.awt.event.*;

public class AWTCounterAnonymousInnerClass1 extends Frame {

    /**
     * @author A11201811347 Moh. Mustaghfirin Al Farizi
     */
    private static final long serialVersionUID = -8423318688618882746L;
    private TextField tfCount;
    private int count=0;
    AWTCounterAnonymousInnerClass1(){
        setLayout(new FlowLayout());
        add(new Label("Counter"));
        tfCount=new TextField(count+"",10);
        tfCount.setEditable(false);
        add(tfCount);
        Button btnCount=new Button("Count");
        add(btnCount);
        btnCount.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                tfCount.setText(count+"");
            }

        });
        setSize(250,100);
        setTitle("AWT Counter");
        setVisible(true);

    }
}