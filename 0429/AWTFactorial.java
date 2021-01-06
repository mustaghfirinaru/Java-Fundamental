import java.awt.*;
import java.awt.event.*;
public class AWTFactorial extends Frame implements ActionListener {
    /**
     * @author A11201811347
     */
    private static final long serialVersionUID = 5580866321144975806L;
    private TextField tf;
    private TextField tfres;
    private int count=1;
    private int res=1;
    AWTFactorial() {
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
    public static void main(String[] args) {
        AWTFactorial a= new AWTFactorial();
        a.setSize(300, 100);
        a.setVisible(true);
    }
}