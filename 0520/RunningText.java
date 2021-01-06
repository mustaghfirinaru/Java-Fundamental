import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RunningText extends JFrame {
    /**
     * @author Moh Mustaghfirin Al Farizi A11201811347
     */
    private static final long serialVersionUID = 7757570561516075854L;

    public RunningText() {
        this.setLayout(new GridLayout(1, 1));
        add(new RunningTextPanel("message in the bottle?", 200));
    }

    public static void main(String[] args) {
        RunningText frame = new RunningText();
        frame.setTitle("Running Text");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(280, 100);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    // Inner class: Menampilkan runnig teks
    static class RunningTextPanel extends JPanel {
        /**
         *
         */
        private static final long serialVersionUID = 8051110060026162377L;
        private String message;
        private int xCoordinate = 0;
        private int yCoordinate = 50;

        public RunningTextPanel(String message, int delay) {
            this.message = message;
            Timer timer=new Timer(delay, new TimerListener());
            timer.start();
        }

        /** Paint message */
        public void paintComponent(Graphics g) {
            super.paintComponent(g); 
            if(xCoordinate>this.getWidth()) xCoordinate=0;
            else xCoordinate=xCoordinate+5;
            g.drawString(message, xCoordinate, yCoordinate);
        }

        class TimerListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        }
    }
}