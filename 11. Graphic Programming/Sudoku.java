import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Sudoku extends JFrame {
    /**
     * @author Moh Mustaghfirin Al Farizi A11201811347
     */
    private static final long serialVersionUID = 6754267572946933149L;
    private JLabel timer;
    private Count mundur;
    private String text;
    public static final int GRID_SIZE = 9;
    public static final int SUBGRID_SIZE = 3;
    public static final int CELL_SIZE = 60;
    public static final int CANVAS_WIDTH = CELL_SIZE * GRID_SIZE;
    public static final int CANVAS_HEIGHT = CELL_SIZE * GRID_SIZE;
    public static final Color OPEN_CELL_BGCOLOR = Color.YELLOW;
    public static final Color OPEN_CELL_TEXT_YES = new Color(0, 255, 0);
    public static final Color OPEN_CELL_TEXT_NO = Color.RED;
    public static final Color CLOSED_CELL_BGCOLOR = new Color(240, 240, 240);
    public static final Color OPEN_CELL_BGCOLOR_WRONG = Color.RED;
    public static final Color CLOSED_CELL_BGCOLOR_RIGHT = Color.GREEN;
    public static final Color CLOSED_CELL_TEXT = Color.BLACK;
    public static final Font FONT_NUMBERS = new Font("Monospaced", Font.BOLD, 20);
    private JTextField[][] tfCells = new JTextField[GRID_SIZE][GRID_SIZE];
    private int[][] puzzle = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
            { 1, 9, 8, 3, 4, 2, 5, 6, 7 }, { 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
            { 7, 1, 3, 9, 2, 4, 8, 5, 6 }, { 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
            { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
    private boolean[][] masks = { { false, false, false, false, false, true, false, false, false },
            { false, false, false, false, false, false, false, false, true },
            { false, false, false, false, false, false, false, false, false },
            { false, false, false, false, false, false, false, false, false },
            { false, false, false, false, false, false, false, false, false },
            { false, false, false, false, false, false, false, false, false },
            { false, false, false, false, false, false, false, false, false },
            { false, false, false, false, false, false, false, false, false },
            { false, false, false, false, false, false, false, false, false } };
    public Sudoku() {
        Container cp = getContentPane();
        JPanel inner=new JPanel();
        JPanel btns=new JPanel();
        btns.setLayout(new BorderLayout());
        mundur=new Count();
        mundur.start();
        JButton reset=new JButton("Reset");
        reset.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                mundur.set();
            }
        });
        JButton suren=new JButton("Surrender");
        suren.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int result = JOptionPane.showConfirmDialog(cp,"Anda Menyerah?", "Menyerah",
                  JOptionPane.YES_NO_OPTION,
                  JOptionPane.QUESTION_MESSAGE);
               if(result == JOptionPane.YES_OPTION){
                   System.exit(0);
               }else if (result == JOptionPane.NO_OPTION){
                //   setVisible(false);
               }else {
               }
            }
         });
        JButton close=new JButton("Close");
        close.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btns.add(reset,BorderLayout.WEST);
        btns.add(suren,BorderLayout.CENTER);
        btns.add(close,BorderLayout.EAST);
         timer=new JLabel("Waktu");
         
        inner.setLayout(new GridLayout(GRID_SIZE, GRID_SIZE));
        cp.setLayout(new BorderLayout());
        cp.add(btns, BorderLayout.NORTH);
        cp.add(inner, BorderLayout.CENTER);
        cp.add(timer, BorderLayout.SOUTH);
        for (int row = 0; row < GRID_SIZE; ++row) {
            for (int col = 0; col < GRID_SIZE; ++col) {
                tfCells[row][col] = new JTextField();
                inner.add(tfCells[row][col]);
                if (masks[row][col]) {
                    tfCells[row][col].setText("");
                    tfCells[row][col].setEditable(true);
                    tfCells[row][col].setBackground(OPEN_CELL_BGCOLOR);
                    tfCells[row][col].addActionListener(new InputListener());
                    tfCells[row][col].addFocusListener(new focusListener());
                } else {
                    tfCells[row][col].setText(puzzle[row][col] + "");
                    tfCells[row][col].setEditable(false);
                    tfCells[row][col].setBackground(CLOSED_CELL_BGCOLOR);
                    tfCells[row][col].setForeground(CLOSED_CELL_TEXT);
                }
                tfCells[row][col].setHorizontalAlignment(JTextField.CENTER);
                tfCells[row][col].setFont(FONT_NUMBERS);
            }
        }
        cp.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Sudoku");
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private class InputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int rowSelected = -1;
            int colSelected = -1;
            JTextField source = (JTextField) e.getSource();
            boolean found = false;
            for (int row = 0; row < GRID_SIZE && !found; ++row) {
                for (int col = 0; col < GRID_SIZE && !found; ++col) {
                    if (tfCells[row][col] == source) {
                        rowSelected = row;
                        colSelected = col;
                        found = true;
                    }
                }
            }
            if(Integer.parseInt(
                tfCells[rowSelected][colSelected].getText())==puzzle[rowSelected][colSelected]){
                    tfCells[rowSelected][colSelected].setBackground(CLOSED_CELL_BGCOLOR_RIGHT);
                    masks[rowSelected][colSelected]=false;
                    tfCells[rowSelected][colSelected].setEditable(false);
                    // tfCells[rowSelected][colSelected].removeFocusListener();
                }
            else{
               tfCells[rowSelected][colSelected].setBackground(OPEN_CELL_BGCOLOR_WRONG);
            }
            if (AllDone(masks) == true) {
                JOptionPane.showMessageDialog(null, "Bingo you won !, game is over\nwaktu tempuh anda <"+text+">");
                System.exit(0);
            }
        }
    }
    private class focusListener implements FocusListener{

            @Override
            public void focusGained(FocusEvent e) {
                
            }

            @Override
            public void focusLost(FocusEvent e) {

            }

        }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Sudoku();
            }
        });
    }
    private boolean AllDone(boolean[][] m) {
        boolean ret = true;
        for (int row = 0; row < GRID_SIZE ; ++row) {
            for (int col = 0; col < GRID_SIZE ; ++col) {
                if (masks[row][col] == true) {
                    return false;
                }
            }
        }
        return ret;
    }
    class Count {
        private static final int TIMER_PERIOD = 1000;
        private int hh,mm,ss;
     
        public Count() {
            hh=0;
            mm=0;
            ss=0;
        }
        public void set() {
            hh=0;
            mm=0;
            ss=0;
        }
     
        public void start() {
           new Timer(TIMER_PERIOD, new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                    if(ss==60){
                        mm=mm+1;
                        ss=00;
                    }
                    
                    if(mm==60){
                        hh=hh+1;
                        mm=00;
                    }
                    ss=ss+1;
                    text = "";
                    if(hh<10) text=text+"0"+hh;
                    else text=text+""+hh;
                    if(mm<10) text=text+":0"+mm;
                    else text=text+":"+mm;
                    if(ss<10) text=text+":0"+ss;
                    else text=text+":"+ss;
                    // text=text+">";
                    timer.setText("Waktu :  "+text);
              }
           }).start();
        }
     
     }
}