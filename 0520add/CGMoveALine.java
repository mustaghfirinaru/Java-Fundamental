import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CGMoveALine extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 4686539811470774590L;
    public static final int CANVAS_WIDTH = 400;
    public static final int CANVAS_HEIGHT = 140;
    public static final Color LINE_COLOR = Color.BLACK;
    public static final Color CANVAS_BACKGROUND = Color.CYAN;

    private int x1 = CANVAS_WIDTH / 2;
    private int y1 = CANVAS_HEIGHT / 2;
    private int x2 = x1;
    private int y2 = CANVAS_HEIGHT / 8 * 7;
    private DrawCanvas canvas;

    public CGMoveALine() {
        JPanel btnPanel = new JPanel();
        JButton btnLeft = new JButton("Gerak ke Kiri/<==");
        JButton btnRight = new JButton("Gerak ke Kanan/==>");
        this.setLayout(new BorderLayout());
        btnPanel.add(btnLeft);
        btnPanel.add(btnRight);
        add(btnPanel,BorderLayout.SOUTH);
        btnLeft.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                x1-=10;
                x2=x1;
                canvas.repaint();
                requestFocus();
            }
        });
        btnRight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                x1+=10;
                x2=x1;
                canvas.repaint();
                requestFocus();
            }
        });
        canvas = new DrawCanvas();
        add(canvas,BorderLayout.NORTH);
        canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        Container cp = getContentPane();

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                switch (evt.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        x1-=10;
                        x2=x1;
                        repaint();
                        break;
                    case KeyEvent.VK_RIGHT:
                        x1+=10;
                        x2=x1;
                        repaint();
                        break;
                }
            }
        });
        requestFocus();
    }
    public static void main(String[] args) {
        
        JFrame frame = new CGMoveALine();
        frame.setTitle("Gerakan");
        frame.setLocationRelativeTo(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 220);
        frame.setVisible(true);
    }
    class DrawCanvas extends JPanel {
        /**
         *
         */
        private static final long serialVersionUID = 8149188922094376224L;

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(CANVAS_BACKGROUND);
            g.setColor(LINE_COLOR);
            g.drawLine(x1, y1, x2, y2);
        }
    }
}