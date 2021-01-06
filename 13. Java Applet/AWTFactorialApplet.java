import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
 
/** AWT counter applet */

public class AWTFactorialApplet extends Applet {
    private TextField tf;
    private TextField tfres;
    private int count=1;
    private int res=1;

 
   @Override
   public void init() {
      
      tf=new TextField(count+"");
      tfres=new TextField(res+"",9);
      Button btn=new Button("Next");
      setLayout(new FlowLayout());
      add(new Label("n"));
      add(tf);
      add(new Label("factorial(n)"));
      add(tfres);
      add(btn);
      btn.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
              count=Integer.parseInt(tf.getText());
              int fac=1;
              int i=1;
              while(i<=count+1){
                  fac*=i;
                  i++;
              }
              count++;
              tf.setText(count+"");
              tfres.setText(fac+"");
          }
      });
   }
}