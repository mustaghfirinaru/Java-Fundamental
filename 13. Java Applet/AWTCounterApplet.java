import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
 
/** AWT counter applet */

public class AWTCounterApplet extends Applet {
   private TextField tfCount;  
   private int count = 0;      
 
   @Override
   public void init() {
      setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
      setBackground(new Color(204, 238, 241));   
      add(new Label("Counter: "));       
      tfCount = new TextField("0", 10);  
      tfCount.setEditable(false);
      add(tfCount);
      Button btnCount = new Button("Count");   
      add(btnCount);
 
      // Handling  button-click
      btnCount.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            ++count;
            tfCount.setText(count + "");
         }
      });
   }
}