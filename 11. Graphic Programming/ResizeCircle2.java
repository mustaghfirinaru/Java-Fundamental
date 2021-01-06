import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ResizeCircle2 extends JFrame {
    /**
     * @author Moh Mustaghfirin Al Farizi A11201811347
     */
    private static final long serialVersionUID = -7434298413315228311L;
    private JButton btnBesar = new JButton("Besarkan");
    private JButton btnKecil = new JButton("Kecilkan");
    private PaintPanel canvas = new PaintPanel();
    private JTextField tf = new JTextField("5",10);
    

    public ResizeCircle2() {
        JPanel panel = new JPanel(); 
        panel.add(btnBesar);
        panel.add(tf);
        panel.add(btnKecil);
        btnBesar.addActionListener(new Listeners());
        btnKecil.addActionListener(new Listeners());
        tf.addActionListener(new Listeners());
        this.add(canvas, BorderLayout.CENTER); 
        this.add(panel, BorderLayout.SOUTH); 
    }

    public static void main(String[] args) {
        JFrame frame = new ResizeCircle2();
        frame.setTitle("Resize Circle");
        frame.setLocationRelativeTo(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setVisible(true);
    }
    
    
    class Listeners implements ActionListener {
    
        @Override
        public void actionPerformed(ActionEvent e) {
            
            int numberIn = Integer.parseInt(tf.getText());
            if(e.getActionCommand().equals("Besarkan")){
                numberIn++;
                tf.setText(numberIn+"");
                canvas.perbesar();         
            }
            if(e.getActionCommand().equals("Kecilkan")){
                numberIn--;
                tf.setText(numberIn+"");
                canvas.perbesar();         
            }
            canvas.setRadius(numberIn);
    
        }
        
    }
}
class PaintPanel extends JPanel {
    /**
     * @author Moh Mustaghfirin Al Farizi A11201811347
     */
    private static final long serialVersionUID = -247017349744332884L;
    private int radius = 5; 
    

    /** Perbesar circle */
    public void perbesar() { 
        radius++;
        repaint();
    }
    
    /** Perkecil circle */
    public void perkecil() {
        
        radius--;
        repaint();
    }
    
    public void setRadius(int r) {
        radius=r;
        repaint();
    }

    /** Repaint circle */
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius, 2 * radius, 2 * radius);
    }
}