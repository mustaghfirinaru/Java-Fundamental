import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame {
    /**
     * @author Mustaghfirin Al Farizi A11201811347
     */
    private static final long serialVersionUID = -458790400932438532L;
    private JTextField id, pass;
    private JButton btnOK, btnCancel;

    public login() {
        String username = "mazwied";
        String password = "mazwiedpolke";
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(4, 2));
        cp.add(new JLabel("Login "));
        btnCancel = new JButton("Cancel");
        btnOK = new JButton("OK");
        id = new JTextField();
        pass = new JTextField();
        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (id.getText().equals(username) && pass.getText().equals(password)) {
                    JOptionPane optionPane = new JOptionPane("Login Success, Exit anyway", JOptionPane.QUESTION_MESSAGE,
                            JOptionPane.YES_NO_OPTION);
                    JDialog dialog = optionPane.createDialog(null, "Information");
                    dialog.setVisible(true);
                }
                else{
                    JOptionPane optionPane = new JOptionPane("Login Failed"); JDialog dialog = optionPane.createDialog(null, "Information"); dialog.setVisible(true); 
                }
            }
        });
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                id.setText("");
                pass.setText("");
            }
        });
        cp.add(id);
        cp.add(new JLabel("Password "));
        cp.add(pass);
        cp.add(btnOK);
        cp.add(btnCancel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Login Screen");
        setLocationRelativeTo(null);
        setSize(300, 170);
        setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new login();
            }
        });
    }
}