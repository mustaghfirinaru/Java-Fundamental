import java.awt.*;
import java.awt.event.*;

public class FlowLayoutChangeThis extends Frame implements ItemListener{
    

    /**
     * @author A11201811347 Moh. Mustaghfirin Al Farizi
     */
    private static final long serialVersionUID = 4544294902166257857L;
    Checkbox left, center, right;
    CheckboxGroup theGroup;
    FlowLayoutChangeThis() {
        setSize(250,100);
        setTitle("Flow Layout Change");
        theGroup=new CheckboxGroup();
        left=new Checkbox("to The Left",true,theGroup);
        center=new Checkbox("to The Center",false,theGroup);
        right=new Checkbox("to The Right",false,theGroup);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        left.addItemListener(this);
        center.addItemListener(this);
        right.addItemListener(this);
        add(left);
        add(center);
        add(right);
        setVisible(true);
        setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
    }
    public static void main(String[] args) {
        new FlowLayoutChangeThis();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==left){
            setLayout(new FlowLayout(FlowLayout.LEFT));
            validate();
        }
        else if(e.getSource()==center){
            setLayout(new FlowLayout(FlowLayout.CENTER));
            validate();
        }
        else{
            setLayout(new FlowLayout(FlowLayout.RIGHT));
            validate();
        }	
    }
}