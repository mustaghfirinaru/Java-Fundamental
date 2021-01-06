import java.awt.*;
import java.awt.event.*;

public class AWTFactorialAnonymousInnerClass extends Frame{


    /**
     * @author A11201811347 Moh. Mustaghfirin Al Farizi
     */
    private static final long serialVersionUID = 8017317052058637438L;
    private TextField tf;
    private TextField tfres;
    private int count=1;
    private int res=1;
    AWTFactorialAnonymousInnerClass() {
        super("AWT Factorial");
        setLocationRelativeTo(null);
        tf=new TextField(count+"");
        tfres=new TextField(res+"",9);
        Button btn=new Button("Next");
        setLayout(new FlowLayout());
        add(new Label("n"));
        add(tf);
        add(new Label("factorial(n)"));
        add(tfres);
        add(btn);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                count=Integer.parseInt(tf.getText());
                int fac=1;
                int i=1;
                while(i<=count+1){
                    fac*=i;
                    i++;
                }
                count++;
                tf.setText(count+"");
                tfres.setText(fac+"");
            }
        });
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();
            }  
        });  
        setSize(300, 100);
        setVisible(true);
    }
    public static void main(String[] args) {
        new AWTFactorialAnonymousInnerClass();
    }
}