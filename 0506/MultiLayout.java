import java.awt.*;
import java.awt.event.*;

public class MultiLayout extends Frame{

    /**
     * @author A11201811347 Moh. Mustaghfirin Al Farizi
     */
    private static final long serialVersionUID = -2360830768701749743L;
    Panel s,e;
    MultiLayout() {
        setLayout(new BorderLayout());
        add(new Label("Masukkan String Text",Label.CENTER),BorderLayout.NORTH);
        e = new Panel();
        e.setLayout(new GridLayout(0,1));
        e.add(new Button("Reformat"));
        e.add(new Button("Periksa Ejaan"));
        e.add(new Button("Options"));
        add(e,BorderLayout.EAST);
        add(new TextArea(),BorderLayout.CENTER);
        s=new Panel();
        s.setLayout(new FlowLayout());
        s.add(new Button("Save"));
        s.add(new Button("Center"));
        s.add(new Button("Help"));
        add(s,BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
        setSize(350,200);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MultiLayout();
    }
}