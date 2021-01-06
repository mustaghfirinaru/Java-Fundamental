import java.awt.*;
// import java.awt.event.*;
import javax.swing.*;

public class Play extends JFrame {
    /**
     * @author Moh Mustaghfirin Al Farizi A11201811347
     */
    private static final long serialVersionUID = 4686539811470774590L;

    JButton up,down,left,right,pause;

    JPanel panelplay=new JPanel();
    public Play() {
        panelplay.setLayout(new BorderLayout());
        JPanel statusPanel = new JPanel();
        JPanel snakesPanel = new JPanel();
        JPanel btnPanelplay = new JPanel();
        JLabel score = new JLabel("Score = 00000000");
        JLabel time = new JLabel ("Time  = 00000000");
        time.setHorizontalAlignment(SwingConstants.RIGHT);
        pause=new JButton("PAUSE");
        statusPanel.setLayout(new GridLayout(1,3));
        statusPanel.add(score);
        statusPanel.add(pause);
        statusPanel.add(time);

        up=new JButton("UP");
        down=new JButton("DOWN");
        left=new JButton("LEFT");
        right=new JButton("RIGHT");
        btnPanelplay.setLayout(new BorderLayout());
        btnPanelplay.add(up,BorderLayout.NORTH);
        btnPanelplay.add(down,BorderLayout.SOUTH);
        btnPanelplay.add(left,BorderLayout.WEST);
        btnPanelplay.add(right,BorderLayout.EAST);

        panelplay.add(statusPanel,BorderLayout.NORTH);
        panelplay.add(snakesPanel,BorderLayout.CENTER);
        panelplay.add(btnPanelplay,BorderLayout.SOUTH);

    }

    public static void main(String[] args) {

        JFrame frame = new Play();
        frame.setTitle("Uler");
        frame.setLocationRelativeTo(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 500);
        frame.setVisible(true);
    }
}