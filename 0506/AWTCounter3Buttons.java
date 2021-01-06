import java.awt.*;
import java.awt.event.*;
public class AWTCounter3Buttons extends Frame implements ActionListener {

    /**
     * @author A11201811347 Moh. Mustaghfirin Al Farizi
     */
    private static final long serialVersionUID = -3630817428305824471L;
    private TextField tfCount;
    private int count=0;
    AWTCounter3Buttons(){
        setLayout(new FlowLayout());
        add(new Label("Counter"));
        tfCount=new TextField(count+"",10);
        tfCount.setEditable(false);
        add(tfCount);
        Button btnup =new Button("Count Up");
        add(btnup);
        btnup.addActionListener(this);
        Button btndown =new Button("Count Down");
        add(btndown);
        btndown.addActionListener(this);
        Button reset =new Button("Reset");
        add(reset);
        reset.addActionListener(this);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        String btnLabel=e.getActionCommand();
        if(btnLabel.equals("Count Up")){
            count++;
            tfCount.setText(count+"");
        }
        else if(btnLabel.equals("Count Down")){
            count--;
            tfCount.setText(count+"");
        }
        else{
            count=0;
            tfCount.setText(count+"");
        }

    }
    public static void main(String[] args) {
        new AWTCounter3Buttons();
    }
}