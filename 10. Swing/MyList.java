import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyList extends JFrame {
    /**
     * @author Mustaghfirin Al Farizi A11201811347
     */
    private static final long serialVersionUID = 2027683133246784770L;
    private JTextField left, right;
    private JButton movetol,movetor,movealltor,movealltol,addr,remr,addl,reml;
    private List listl,listr;
    private JPanel panel,panelbot;
    public MyList() {
        
        GridBagLayout grid=new GridBagLayout();
        GridBagConstraints gbc=new GridBagConstraints();
        setLayout(grid);
        left=new JTextField(11);
        right=new JTextField(11);
        listl=new List(7);
        listr=new List(7);
        movetol=new JButton("<");
        movealltol=new JButton("<<");
        movetor=new JButton(">");
        movealltor=new JButton(">>");
        addl=new JButton("Add");
        addl.setActionCommand("addl");
        reml=new JButton("Remove");
        reml.setActionCommand("reml");
        addr=new JButton("Add");
        addr.setActionCommand("addr");
        remr=new JButton("Remove");
        remr.setActionCommand("remr");
        panel=new JPanel();
        panel.setLayout(new GridLayout(4,1));
        
        panel.add(movetol);
        panel.add(movealltol);
        panel.add(movetor);
        panel.add(movealltor);
        
        panelbot=new JPanel();
        panelbot.setLayout(new FlowLayout());
        panelbot.add(addl);
        panelbot.add(reml);
        panelbot.add(addr);
        panelbot.add(remr);

        gbc.gridx=0;gbc.gridy=0;
        add(left,gbc);
        gbc.gridx=1;gbc.gridy=1;
        add(panel,gbc);
        gbc.gridx=2;gbc.gridy=0;
        add(right,gbc);
        gbc.gridx=0;gbc.gridy=1;
        add(listl,gbc);
        gbc.gridx=2;gbc.gridy=1;
        add(listr,gbc);
        gbc.gridx=0;gbc.gridy=3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth=3;
        add(panelbot,gbc);
        //Listeners
        addl.addActionListener(new btnListener());
        reml.addActionListener(new btnListener());
        addr.addActionListener(new btnListener());
        remr.addActionListener(new btnListener());
        movetol.addActionListener(new btnListener());
        movetor.addActionListener(new btnListener());
        movealltol.addActionListener(new btnListener());
        movealltor.addActionListener(new btnListener());

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
                new MyList();
            }
        });
    }
    class btnListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals("addl")){
                listl.add(left.getText()+"");
                // left.setText("");
            }
            else if(e.getActionCommand().equals("addr")){
                listr.add(right.getText()+"");
                // left.setText("");
            }
            else if(e.getActionCommand().equals("reml")){
                try {
                    listl.remove(listl.getSelectedItem());
                } catch (IllegalArgumentException ex) {}
            }
            else if(e.getActionCommand().equals("remr")){
                try {
                    listr.remove(listr.getSelectedItem());
                } catch (IllegalArgumentException ex) {}
            }
            else if(e.getActionCommand().equals("<")){
                try {
                    listl.add(listr.getSelectedItem());
                    listr.remove(listr.getSelectedItem());

                } catch (IllegalArgumentException ex) {}
            }
            else if(e.getActionCommand().equals(">")){
                try {
                    listr.add(listl.getSelectedItem());
                    listl.remove(listl.getSelectedItem());

                } catch (IllegalArgumentException ex) {}
            }
            else if(e.getActionCommand().equals("<<")){
                try {
                    int i=0;
                    while(i<listr.getItemCount()){
                        listl.add(listr.getItem(i));;
                        i++;
                    }
                    listr.removeAll();

                } catch (IllegalArgumentException ex) {}
            }
            else if(e.getActionCommand().equals(">>")){
                try {
                    int i=0;
                    while(i<listl.getItemCount()){
                        listr.add(listl.getItem(i));;
                        i++;
                    }
                    listl.removeAll();

                } catch (IllegalArgumentException ex) {}
            }
            

        }

    }
}