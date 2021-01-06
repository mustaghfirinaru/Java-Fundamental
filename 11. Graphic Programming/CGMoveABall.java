import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CGMoveABall extends JFrame {
    /**
     * @author Moh Mustaghfirin Al Farizi A11201811347
     */
    private static final long serialVersionUID = 4686539811470774590L;
    public static final int CANVAS_WIDTH = 400;
    public static final int CANVAS_HEIGHT = 140;
    public static final Color LINE_COLOR = Color.BLACK;
    public static final Color CANVAS_BACKGROUND = Color.GREEN;

    private int x1 = CANVAS_WIDTH / 2;
    private int y1 = CANVAS_HEIGHT / 2;
    private DrawCanvas canvas;

    public CGMoveABall() {
        JPanel btnPanel = new JPanel();
        JButton btnLeft = new JButton("Gerak ke Kiri/<==");
        JButton btnRight = new JButton("Gerak ke Kanan/==>");
        JButton btnUp = new JButton("Gerak ke Atas/^");
        JButton btnDown = new JButton("Gerak ke Bawah/v");
        this.setLayout(new BorderLayout());
        btnPanel.setLayout(new BorderLayout());
        btnPanel.add(btnUp,BorderLayout.NORTH);
        btnPanel.add(btnDown,BorderLayout.SOUTH);
        btnPanel.add(btnLeft,BorderLayout.WEST);
        btnPanel.add(btnRight,BorderLayout.EAST);
        add(btnPanel, BorderLayout.SOUTH);
        btnLeft.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                x1 -= 10;
                canvas.repaint();
                requestFocus();
            }
        });
        btnRight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                x1 += 10;
                canvas.repaint();
                requestFocus();
            }
        });
        btnUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                y1 -= 10;
                canvas.repaint();
                requestFocus();
            }
        });
        btnDown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                y1 += 10;
                canvas.repaint();
                requestFocus();
            }
        });
        canvas = new DrawCanvas();
        add(canvas, BorderLayout.NORTH);
        canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        Container cp = getContentPane();

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                switch (evt.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        x1 -= 10;
                        repaint();
                        break;
                    case KeyEvent.VK_RIGHT:
                        x1 += 10;
                        repaint();
                        break;
                    case KeyEvent.VK_DOWN:
                        y1 += 10;
                        repaint();
                    break;
                    case KeyEvent.VK_UP:
                        y1 -= 10;
                        repaint();
                    break;
                }
            }
        });
        requestFocus();
    }

    public static void main(String[] args) {

        JFrame frame = new CGMoveABall();
        frame.setTitle("Gerakan sebuah Bola");
        frame.setLocationRelativeTo(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 260);
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
            g.drawOval(x1-20,y1-20,20,20);
            g.setColor(Color.RED);
            g.fillOval(x1-21,y1-21,22,22);
        }
    }
}