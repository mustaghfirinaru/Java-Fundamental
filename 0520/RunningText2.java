import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RunningText2 extends JFrame {
    /**
     * @author Moh Mustaghfirin Al Farizi A11201811347
     */
    
    private static final long serialVersionUID = 7757570561516075854L;
    private JButton btnStartStop;
    RunningText2Panel runtext;
    public RunningText2() {
        this.setLayout(new GridLayout(2, 1));
        btnStartStop=new JButton("Stop");
        add(btnStartStop);
        btnStartStop.addActionListener(new Listener());
        runtext=new RunningText2Panel("message in the bottle?", 200);
        add(runtext);
    }

    public static void main(String[] args) {
        RunningText2 frame = new RunningText2();
        frame.setTitle("Running Text");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(280, 100);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals("Stop")){
                runtext.stop();
                btnStartStop.setText("Start");
            }
            else{
                btnStartStop.setText("Stop");
                runtext.start();
            }
        }
    }
    // Inner class: Menampilkan runnig teks
    static class RunningText2Panel extends JPanel {
        /**
         *
         */
        private static final long serialVersionUID = 8051110060026162377L;
        private String message;
        private int xCoordinate = 0;
        private int yCoordinate = 20;
        private Timer timer;

        public RunningText2Panel(String message, int delay) {
            this.message = message;
            timer=new Timer(delay, new TimerListener());
            timer.start();
        }
        public void stop(){
            timer.stop();
        }
        public void start(){
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