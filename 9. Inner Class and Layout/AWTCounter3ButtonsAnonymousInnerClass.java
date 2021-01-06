import java.awt.*;
import java.awt.event.*;
public class AWTCounter3ButtonsAnonymousInnerClass extends Frame {


    /**
     * @author A11201811347 Moh. Mustaghfirin Al Farizi
     */
    private static final long serialVersionUID = -5866803667975041548L;
    private TextField tfCount;
    private int count=0;
    AWTCounter3ButtonsAnonymousInnerClass(){
        setLayout(new FlowLayout());
        add(new Label("Counter"));
        tfCount=new TextField(count+"",10);
        tfCount.setEditable(false);
        add(tfCount);
        Button btnup =new Button("Count Up");
        add(btnup);
        btnup.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                count++;
                tfCount.setText(count+"");
            }
        });
        Button btndown =new Button("Count Down");
        add(btndown);
        btndown.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                count--;
                tfCount.setText(count+"");
            }
        });
        Button reset =new Button("Reset");
        add(reset);
        reset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){    
                count=0;
                tfCount.setText(count+"");
            }
        });
        setSize(400,100);
        setTitle("AWT Counter");
        setVisible(true);
        setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });

    }
    public static void main(String[] args) {
        new AWTCounter3ButtonsAnonymousInnerClass();
    }
}