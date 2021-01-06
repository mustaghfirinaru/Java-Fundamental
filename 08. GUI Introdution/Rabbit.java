import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Rabbit extends Frame implements MouseListener {

    /**
     * @author A11201811347
     */
    private static final long serialVersionUID = -3056458530038166714L;
    private ArrayList<Button> btn = new ArrayList<Button>();
    private int btnCount = 0;
    private Button first;
    Rabbit() {
        super("My First Application");
        setLocationRelativeTo(null);
        first = new Button("do  rabbit");
        first.addMouseListener(this);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(250, 300);
        add(first);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new Rabbit();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            
            Button button = new Button("new rabbit " + btnCount);
            btn.add(button);
            button.setVisible(true);
            add(button);
            revalidate();
            repaint();
            this.setSize(300, 300+(btn.get(btnCount).getHeight()));
            if(getHeight()<btn.get(btnCount).getLocation().y+100){
                this.setSize(getWidth(),btn.get(btnCount).getLocation().y+100);
            }
            btnCount++;
        }
        if (e.getButton() == MouseEvent.BUTTON3) {
            if(btnCount>0){
                if(getHeight()>btn.get(btnCount-1).getLocation().y+100){
                    this.setSize(getWidth(),btn.get(btnCount-1).getLocation().y+100);
                }
                btnCount--;
                remove(btn.get(btn.size()-1));
                btn.remove(btn.size()-1);
                revalidate();
                repaint();
            }
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}