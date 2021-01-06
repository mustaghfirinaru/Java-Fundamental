import java.awt.*;
import java.awt.event.*;

class PapanSketsa extends Frame
        implements ActionListener, ItemListener, MouseListener, MouseMotionListener, WindowListener {

    /**
     *@author A11201811347
     */
    private static final long serialVersionUID = 8360770846326468832L;
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int upperLeftX,upperLeftY;
    int width,height;
    int x1, y1, x2, y2;
    boolean fill = false;
    boolean erasure = false;
    String drawColor = new String("black");
    String drawShape = new String("line");
    TextField color = new TextField();
    TextField shape = new TextField();
    TextField position = new TextField();
    CheckboxGroup fillOutline = new CheckboxGroup();
    String[] colorNames = { "black", "blue", "cyan", "yellow", "green", "magenta", "red", "white", "orange" };
    String[] shapeNames = { "line", "square", "rectangle", "circle", "ellipse" };
    String[] toolNames = { "Hapus", "Bersihkan papan" };
    String[] helpNames = { "Informasi", "About" };
    MenuBar mbar = new MenuBar();
    MenuItemListener menuItemListener = new MenuItemListener();
    public String helpText = "PapanSketsa mengijinkan anda untu kmenggambar shape yang bermacam-macam pada area yang tersedia.\n"
            + "Shape dapat berisi atau hanya outline saja, dan tersedia 8 warna yang berbeda.\n\n"
            + "Posisi mouse di layar di simpan dalam pojok kiri bawah layar \n"
            + "dari papan sketsa. Pilihan warna dan shape di tampilkan juga\n" + "di pojok kiri bawah Papan Sketsa\n\n"
            + "Ukuran shape di tentukan oleh posisi mouse saat button mouse pertama kali di tekan,  \n"
            + "diikuti posisi mouse saat di drag hingga posisi akhir dan di lepaskan\n"
            + "Penekanan button mouse pertama akan mengenerate titik acuan pada layar. \n"
            + "Titik ini akan hilang setelah button mouse di lepas/release\n\n"
            + "Baik square/kotak dan circle/lingkaran hanya memakai jarak axis horisontal untuk menentukan jarak \n"
            + "ukuran shape.\n\n"
            + "Setelah memilih menu Hapus/erase, tekan mouse button, dan gerakan mouse di atas area\n"
            + "yang akan di hapus. Melapaskan mouse button akan membuat penghapus tidak aktif\n\n"
            + "untuyk menghapus text area pilih Bersihkan papan dari menu TOOLS \n\n";

    TextArea info = new TextArea(helpText, 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);

    Frame About = new Frame("About PapanSketsa");
    Frame Informasi=new Frame("Informasi");
    public void setMenuBar(String Title,String[] mb) {
        int i=0; 
        Menu m = new Menu(Title); 
        while(i<mb.length){
            MenuItem item=new MenuItem(mb[i]);
            item.setActionCommand(mb[i]);
            item.addActionListener(menuItemListener);
            m.add(item);
            i++;
        }
        mbar.add(m);
    }
    @Override
    public void setMenuBar(MenuBar mb) {
        super.setMenuBar(mb);
    }

    public PapanSketsa(String s) {
        super(s);
        setLocationRelativeTo(null);
        setBackground(Color.gray);
        setLayout(null);
        About.setSize(400, 200);
        About.setLayout(new BorderLayout());
        Button close=new Button("Close");
        About.add(new TextField("Author : Moh Mustaghfirin Al Farizi\n"+"Created : 04/29/20"),"Center");
        About.add(close,"South");
        close.addActionListener(new ActionListener(){
            @Override
			public void actionPerformed(ActionEvent e) {
                About.dispose();
				
			}
        });
        TextArea infotext=new TextArea(helpText);
        Informasi.setSize(800, 400);
        Button close2=new Button("Close");
        Informasi.setLayout(new BorderLayout());;
        Informasi.add(infotext,"Center");
        Informasi.add(close2,"South");
        close2.addActionListener(new ActionListener(){
            @Override
			public void actionPerformed(ActionEvent e) {
                Informasi.dispose();
				
			}
        });
        initializeTextFields();
        initializeMenuComponents();
        initializeRadioButtons();
        addMouseMotionListener(this);
        addMouseListener(this);
        addWindowListener(this);
    }
    class MenuItemListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {            
            if(e.getActionCommand().equalsIgnoreCase("About")){
                About.setVisible(true);
            }            
            if(e.getActionCommand().equalsIgnoreCase("Informasi")){
                Informasi.setVisible(true);
            }
        }    
     }
    private void initializeMenuComponents() {
        setMenuBar("Colors",colorNames);
        setMenuBar("Shapes",shapeNames);
        setMenuBar("Tools",toolNames);
        setMenuBar("Help",helpNames);
        setMenuBar(mbar);
    }

    private void initializeRadioButtons() {
        // CheckboxGroup cbg = new CheckboxGroup();  
        // Checkbox checkBox1 = new Checkbox("C++", cbg, false);    
        // checkBox1.setBounds(100,100, 50,50);    
        // Checkbox checkBox2 = new Checkbox("Java", cbg, true);    
        // checkBox2.setBounds(100,150, 50,50);    
        // add(checkBox1);    
        // add(checkBox2);    
        
        CheckboxGroup garis=new CheckboxGroup();
        Checkbox g1=new Checkbox("Garis",false,garis);
        g1.setBounds(10,380, 50,20);    
        Checkbox g2=new Checkbox("Fill",false,garis);
        g2.setBounds(10,400, 50,20);    
        Panel radio=new Panel();
        add(g1);
        add(g2);
        // radio.setBackground(Color.WHITE);
        radio.setSize(100,100);
        add(radio);
    }

    private void initializeTextFields() {
        TextField text1=new TextField("Magenta",10);
        TextField text2=new TextField("elipse",10);
        TextField text3=new TextField("[0,0]",10);
        Panel panelfield=new Panel();
        panelfield.setSize(150,60);
        panelfield.setVisible(true);
        panelfield.setBounds(10,450,150,60);
        panelfield.setBackground(Color.CYAN);
        panelfield.add(text1);
        panelfield.add(text2);
        panelfield.add(text3);
        // Text1.setBounds(10,450,50,20);
        // Text2.setBounds(10,470,50,20);
        // Text3.setBounds(10,490,50,20);
    }

    @Override
    public void windowOpened(WindowEvent e) { }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) { }

    @Override
    public void windowIconified(WindowEvent e) { }

    @Override
    public void windowDeiconified(WindowEvent e) { }

    @Override
    public void windowActivated(WindowEvent e) { }

    @Override
    public void windowDeactivated(WindowEvent e) { }

    @Override
    public void mouseDragged(MouseEvent e) { }

    @Override
    public void mouseMoved(MouseEvent e) { }

    @Override
    public void mouseClicked(MouseEvent e) { }

    @Override
    public void mousePressed(MouseEvent e) { }

    @Override
    public void mouseReleased(MouseEvent e) { }

    @Override
    public void mouseEntered(MouseEvent e) { }

    @Override
    public void mouseExited(MouseEvent e) { }

    @Override
    public void itemStateChanged(ItemEvent e) { }

    @Override
    public void actionPerformed(ActionEvent e) { }
}