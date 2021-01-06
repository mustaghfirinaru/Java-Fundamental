import java.awt.*;
import java.awt.event.*;

class GridBagLayoutDemo extends Frame implements ActionListener{


    /**
     * @author A11201811347 Moh. Mustaghfirin Al Farizi
     */
    private static final long serialVersionUID = 1304800917498206526L;
    private GridBagLayout gb1;
    private Color[] colors={Color.yellow,Color.pink,Color.green,Color.red,Color.magenta};
    GridBagLayoutDemo(){
        setup_layout();
        this.setSize(250,100);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
    }
    public void setup_layout(){
        gb1=new GridBagLayout();
        setLayout(gb1);
        int i=0;
        while(i<5){
            makeButton(i, colors[i]);
            i++;
        }
    }
    public void makeButton(int w,Color C){
        Button btn=new Button(""+w);
        GridBagConstraints c=new GridBagConstraints();
        btn.setBackground(C);
        c.weightx=w;
        c.weighty=1;
        c.fill=GridBagConstraints.BOTH;
        gb1.setConstraints(btn, c);
        btn.addActionListener(this);
        add(btn);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Button b=(Button)e.getSource();
        GridBagConstraints gbc=gb1.getConstraints(b);
        if(++gbc.weightx>4){
            gbc.weightx=0;
        }
        gb1.setConstraints(b, gbc);
        b.setLabel(""+gbc.weightx);
        invalidate();
        validate();
    }
    public static void main(String[] args) {
        new GridBagLayoutDemo();
    }
}