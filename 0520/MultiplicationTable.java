import javax.swing.*;
import java.awt.*;

public class MultiplicationTable extends JFrame {

    /**
     * @author Moh Mustaghfirin Al Farizi A11201811347
     */
    private static final long serialVersionUID = -7863673100572209582L;
    private PaintPanelTable canvas = new PaintPanelTable();
    public MultiplicationTable() {
        add(canvas);
    }
    
    public static void main(String[] args) {
        JFrame frame = new MultiplicationTable();
        frame.setTitle("Multiplication Table");
        frame.setLocationRelativeTo(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setVisible(true);
    }
}
class PaintPanelTable extends JPanel {
    
    /**
     * @author Moh Mustaghfirin Al Farizi A11201811347
     */
    private static final long serialVersionUID = -3689796578838880361L;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("TimesRoman",Font.PLAIN,23));
        g.setColor(Color.RED);
        int row=50;
        String str="Multiplication Table";
        g.drawString(str, 55,row);
        g.setFont(new Font("TimesRoman",Font.PLAIN,20));
        str="";
        row+=30;
        for (int j = 1; j <= 9; j++)    str=str+"   "+j;  
        g.drawString(str, 35,row);
        str="";
        row+=30;
        for (int i = 1; i <= 9; i++) {
            str=str+" "+i+ "   ";
            for (int j = 1; j <= 9; j++) {
                if(i*j<10) str=str+"  "+i*j+ " ";
                else str=str+""+i*j+ " ";
                // System.out.printf("%4d", i * j);
            }
            g.drawString(str, 10,row);
            str="";
            row+=20;
        }
        // g.drawRect(x, y, width, height);
        g.drawRect(35, 90, 240, 190);
    }
}