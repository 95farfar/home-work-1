
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainGUI extends JFrame{
    private JMenuBar meny;
    private JMenu arkiv;
    private JMenu om;
    private JMenuItem avsluta;
    private JMenuItem omSkaparen;
    private JMenuItem hjalp;
    private DrawPanel pdraw;
    
    private EventWindow win;
    private Turtle t;
    
    public MainGUI(){
        initGUI();
    }
    
    private void initGUI(){
        
        this.setTitle("DrawingGUI");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.meny = new JMenuBar();
        this.arkiv = new JMenu("Arkiv");
        this.om = new JMenu("Om");
        this.avsluta = new JMenuItem("Avsluta programmet");
        this.omSkaparen = new JMenuItem("Om Skaparen");
        this.hjalp = new JMenuItem("Hjälp");
        
        this.setJMenuBar(meny);
        this.meny.add(arkiv);
        this.meny.add(om);
        this.arkiv.add(avsluta);
        this.om.add(omSkaparen);
        this.om.add(hjalp);
        
        this.omSkaparen.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,
                        "Copyright:...");
            }
        });
        
        pdraw = new DrawPanel();
        this.add(pdraw);
    }
    
    private class DrawPanel extends JPanel{
        
        public DrawPanel(){
            super();
        }
        protected void paintComponent( Graphics g ){
            super.paintComponent(g);
        }
    }
    
    public static void main(String[] args){
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new MainGUI().setVisible(true);
            }
        });
    }
}