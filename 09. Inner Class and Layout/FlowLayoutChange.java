import java.awt.*;
import java.awt.event.*;
public class FlowLayoutChange extends Frame {

    /**
     * @author A11201811347 Moh. Mustaghfirin Al Farizi
     */
    private static final long serialVersionUID = 7240324334793563240L;
    Checkbox left,center,right;
    CheckboxGroup theGroup;
    FlowLayoutChange() {
        setSize(250,100);
        setTitle("Flow Layout Change");
        theGroup=new CheckboxGroup();
        left=new Checkbox("to The Left",true,theGroup);
        center=new Checkbox("to The Center",false,theGroup);
        right=new Checkbox("to The Right",false,theGroup);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        left.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange()==ItemEvent.SELECTED){
                    setLayout(new FlowLayout(FlowLayout.LEFT));
                    validate();
                }
            }
        });
        center.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange()==ItemEvent.SELECTED){
                    setLayout(new FlowLayout(FlowLayout.CENTER));
                    validate();
                }
            }
        });
        right.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange()==ItemEvent.SELECTED){
                    setLayout(new FlowLayout(FlowLayout.RIGHT));
                    validate();
                }
            }
        });
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
        new FlowLayoutChange();
    }
}