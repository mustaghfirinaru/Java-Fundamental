import java.awt.*;
import java.awt.event.*;
public class AWTCounter3ButtonsNamedInnerClass extends Frame {

    /**
     * @author A11201811347 Moh. Mustaghfirin Al Farizi
     */
    private static final long serialVersionUID = -5847057352408837696L;
    private TextField tfCount;
    private int count=0;
    AWTCounter3ButtonsNamedInnerClass(){
        setLayout(new FlowLayout());
        add(new Label("Counter"));
        tfCount=new TextField(count+"",10);
        tfCount.setEditable(false);
        add(tfCount);
        Button btnup =new Button("Count Up");
        add(btnup);
        btnup.addActionListener(new btnListner());
        Button btndown =new Button("Count Down");
        add(btndown);
        btndown.addActionListener(new btnListner());
        Button reset =new Button("Reset");
        add(reset);
        reset.addActionListener(new btnListner());
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
        new AWTCounter3ButtonsNamedInnerClass();
    }
    class btnListner implements ActionListener{
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
    } 
}