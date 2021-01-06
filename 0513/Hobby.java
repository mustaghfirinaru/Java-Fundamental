import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Hobby extends JFrame {
    /**
     * @author Mustaghfirin Al Farizi A11201811347
     */
    private static final long serialVersionUID = 728163423954533900L;
    private JTextField tfout;
    public Hobby() {
        
        GridBagLayout grid=new GridBagLayout();
        GridBagConstraints gbc=new GridBagConstraints();
        setLayout(grid);

        gbc.gridx=0;
        gbc.gridy=0;
        add(new JLabel("Your Name "),gbc);
        gbc.weightx=0.8;
        gbc.gridx=1;
        JTextField nama=new JTextField(15);
        add(nama,gbc);
        JRadioButton fy,sy,ty;
        ButtonGroup bg=new ButtonGroup();
        fy=new JRadioButton("FY");
        sy=new JRadioButton("SY");
        ty=new JRadioButton("TY");
        JCheckBox cb1 = new JCheckBox("Music");
        JCheckBox cb2 = new JCheckBox("Dance");
        JCheckBox cb3 = new JCheckBox("Sports");
        bg.add(fy);
        bg.add(sy);
        bg.add(ty);
        gbc.gridx=0;
        gbc.gridy=1;
        add(new JLabel("Your Class"),gbc);
        gbc.gridx=1;
        add(new JLabel("Your Hobbies"),gbc);
        gbc.gridx=0;
        gbc.gridy=2;
        add(fy,gbc);
        gbc.gridx=1;
        add(cb1,gbc);
        gbc.gridx=0;
        gbc.gridy=3;
        add(sy,gbc);
        gbc.gridx=1;
        add(cb2,gbc);
        gbc.gridx=0;
        gbc.gridy=4;
        add(ty,gbc);
        gbc.gridx=1;
        add(cb3,gbc);
        gbc.gridx=0;
        gbc.gridy=5;
        gbc.gridwidth=2;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        tfout=new JTextField();
        tfout.setEditable(false);
        add(tfout,gbc);
        nama.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(fy.isSelected()) tfout.setText("Name : "+nama.getText()+" Class : FY ");
                if(sy.isSelected()) tfout.setText("Name : "+nama.getText()+" Class : SY ");
                if(ty.isSelected()) tfout.setText("Name : "+nama.getText()+" Class : TY ");
                if(cb1.isSelected()&&cb2.isSelected()&&cb3.isSelected()) tfout.setText(tfout.getText()+" "+cb1.getText()+" "+cb2.getText()+" "+cb3.getText());
                else if(cb1.isSelected()&&cb2.isSelected()) tfout.setText(tfout.getText()+" "+cb1.getText()+" "+cb2.getText());
                else if(cb2.isSelected()&&cb3.isSelected()) tfout.setText(tfout.getText()+" "+cb2.getText()+" "+cb3.getText());
                else if(cb1.isSelected()&&cb3.isSelected()) tfout.setText(tfout.getText()+" "+cb1.getText()+" "+cb3.getText());
                else if(cb2.isSelected()) tfout.setText(tfout.getText()+" "+cb2.getText());
                else if(cb3.isSelected()) tfout.setText(tfout.getText()+" "+cb3.getText());
                else if(cb1.isSelected()) tfout.setText(tfout.getText()+" "+cb1.getText());
                else tfout.setText("Name : "+nama.getText()+" Class : FY Hobby : ");
            };
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Club Member");
        setLocationRelativeTo(null);
        setSize(400, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Hobby();
            }
        });
    }
}