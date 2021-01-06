import java.awt.*;
import java.awt.event.*;

public class ChangeFont extends Frame{

    /**
     * @author A11201811347 Moh. Mustaghfirin Al Farizi
     */
    private static final long serialVersionUID = 2424276820470361202L;
    private Font plainFont,boldFont,italicFont,boldItalicFont;
    private Label msgLabel;
    private List fontList;
    private Button exit,reset;
    ChangeFont(){
        setLayout(new BorderLayout());
        msgLabel= new Label("String Text ini akan berubah font-nya",Label.CENTER);
        add(msgLabel,BorderLayout.NORTH);
        Panel buttonPanel=new Panel();
        buttonPanel.setLayout(new GridLayout(1,2));
        reset=new Button("Reset font");
        exit=new Button("Exit");
        buttonPanel.add(reset);
        buttonPanel.add(exit);
        add(buttonPanel,BorderLayout.SOUTH);
        fontList=new List(3);
        fontList.add("Bold");
        fontList.add("Italic");
        fontList.add("Bold italic");
        add(fontList,BorderLayout.CENTER);
        ResetButtonListener resetListener=new ResetButtonListener();
        ExitButtonListener exitListener=new ExitButtonListener();
        ListItemListener listListener=new ListItemListener();
        exit.addActionListener(exitListener);
        reset.addActionListener(resetListener);
        fontList.addItemListener(listListener);
        plainFont = new Font("plain", Font.PLAIN, 10);
        boldFont = new Font("bold", Font.BOLD, 10);
        italicFont = new Font("italic", Font.ITALIC, 10);
        boldItalicFont = new Font("bolditalic", Font.BOLD+Font.ITALIC, 10);
        setSize(250,150);
        setVisible(true);
        setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
        
    }
    public static void main(String[] args) {
        new ChangeFont();
    }
    class ResetButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            msgLabel.setFont(plainFont);
        }
    }
    class ExitButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    
    class ListItemListener implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent e) {
            String S= fontList.getSelectedItem();
            if(S.equals("Bold")){
                msgLabel.setFont(boldFont);
                validate();
            }
            else if(S.equals("Italic")){
                msgLabel.setFont(italicFont);
                validate();
            }
            else{
                msgLabel.setFont(boldItalicFont);
                validate();
            }
        }
    }
}