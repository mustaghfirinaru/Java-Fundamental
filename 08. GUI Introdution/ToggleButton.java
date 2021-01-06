import java.awt.*; 
import java.awt.event.*; 

public class ToggleButton extends Frame{

    /**
     * @author A11201811347
     */
    private Button top;
    private Button bot;
    private static final long serialVersionUID = 1453487572909341859L;
    ToggleButton(){
        super("ToggleButton dengna Anonymous Class");
        setLocationRelativeTo(null);
        top=new Button("Toggle bottom button");
        bot=new Button("Toggle top button");
        setLayout(new BorderLayout());
        add(top,BorderLayout.NORTH);
        add(bot,BorderLayout.CENTER);
        setSize(410,100);
        setVisible(true);
        top.setEnabled(false);
        bot.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
                bottomButtonAction(e);
			}
        });
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                System.exit(0);
            }  
        });
        top.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
                topButtonAction(e);
			}
        });
    }
    public void bottomButtonAction(ActionEvent event){
        bot.setEnabled(false);
        top.setEnabled(true);
    }
    public void topButtonAction(ActionEvent event){
        bot.setEnabled(true);
        top.setEnabled(false);
    }
    public static void main(String[] args) {
        new ToggleButton();
    }
}