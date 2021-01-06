import java.awt.*;
import java.awt.event.*;

public class Steall1 extends Frame {
    /**
     *
     */
    private static final long serialVersionUID = 5939922652740110239L;
    Label l;

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setSize(500, 500);
        Panel panel = new Panel();
        panel.setSize(500, 500);
        frame.add(panel);
        frame.setVisible(true);
        run(panel);
    }

    public static void run(Panel panel) {
        panel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                Button button = new Button();
                button.setVisible(true);
                panel.add(button);
                panel.revalidate();
            }
        });
    }
}