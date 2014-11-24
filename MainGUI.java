//Här importeras det som behövs tll programmet.
import se.bjorknas.graphics.EventWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 * 
 * @author Farand Al Rubaae
 */
//Här skapas komponenterna som skall användas i GUI:t,och mina 2 figurer.
public class MainGUI extends JFrame{
    private JMenuBar meny;
    private JMenu arkiv;
    private JMenu om;
    private JMenuItem avsluta;
    private JMenuItem omSkaparen;
    private JMenuItem hjalp;
    private JButton btnRect,btnCir;
    private JLabel lblCir, lblRect, lblCirA, lblCirO, lblRectA, lblRectO, 
            lblDiameter,lblBreddR, lblHöjdR;
    private JTextField txfCirAr, txfCirOm, txfRectAr, txfRectOm, txfDiaCir, 
            txfBR, txfHR, txfDontKnow;
    private Rectangle rec;
    private Circle cir;
    
    
    public MainGUI(){
        this.initGUI();
    }
    
    private void initGUI(){
        
        /*
         * Här ges GUI-fönstret ett namn och en storlek. Sista rade gör så att
         * programmet avsultas när man kryssar ner fönstret
         */
        this.setTitle("DrawingGUI");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         /*
            Här tilldelas menyer, knappar, label och textfield.
        Vissa textfield sätts som false så att det inte går att mata in något.
        */
        this.meny = new JMenuBar();
        this.arkiv = new JMenu("Arkiv");
        this.om = new JMenu("Om");
        this.avsluta = new JMenuItem("Avsluta programmet");
        this.omSkaparen = new JMenuItem("Om Skaparen");
        this.hjalp = new JMenuItem("Hjälp");
        this.btnCir = new JButton("Cirkel");
        this.btnRect = new JButton("Rektangel");
        this.lblCir = new JLabel("Cirkel:");
        this.lblRect = new JLabel("Rektangel:");
        this.lblCirA = new JLabel("Cirkelns area:");
        this.lblCirO = new JLabel("Cirkelns omkrets:");
        this.lblRectA = new JLabel("Rektangelns area:");
        this.lblRectO = new JLabel("Rektangelns omkrets:");
        this.lblDiameter = new JLabel("Cirkelns diameter:");
        this.lblBreddR = new JLabel("Rektangelns bredd:");
        this.lblHöjdR = new JLabel("Rektangelns höjd:");
        this.txfBR = new JTextField("");
        this.txfDiaCir = new JTextField("");
        this.txfHR = new JTextField("");
        this.txfCirAr = new JTextField("");
        txfCirAr.setEnabled(false);
        this.txfCirOm = new JTextField("");
        txfCirOm.setEnabled(false);
        this.txfRectAr = new JTextField("");
        txfRectAr.setEnabled(false);
        this.txfRectOm = new JTextField("");
        txfRectOm.setEnabled(false);
        this.txfDontKnow = new JTextField("");
        this.txfDontKnow.setEnabled(false);

        
        /*
         * Här lägs kompenenter till på GUI:t, med en storlek samt en position
         */
        this.setJMenuBar(meny);
        this.meny.add(arkiv);
        this.meny.add(om);
        this.arkiv.add(avsluta);
        this.om.add(omSkaparen);
        this.om.add(hjalp);
        this.add(btnCir);
        this.btnCir.setBounds(100,450,100,40);
        this.add(btnRect);
        this.btnRect.setBounds(350,450,100,40);
        this.add(lblCir);
        this.lblCir.setBounds(100,10,100,100);
        this.add(lblRect);      
        this.lblRect.setBounds(370,10,100,100);
        this.add(lblDiameter);
        this.lblDiameter.setBounds(30,160,120,20);
        this.add(lblBreddR);
        this.lblBreddR.setBounds(300,100,150,100);
        this.add(lblHöjdR);
        this.lblHöjdR.setBounds(300,180,150,100);
        this.add(lblCirA);
        this.lblCirA.setBounds(30,230,100,100);
        this.add(lblCirO);
        this.lblCirO.setBounds(30,340,150,100);
        this.add(lblRectA);
        this.lblRectA.setBounds(300,260,150,100);
        this.add(lblRectO);
        this.lblRectO.setBounds(300,340,150,100);
        this.add(txfBR);
        this.txfBR.setBounds(430,140,80,20);
        this.add(txfHR);
        this.txfHR.setBounds(430,220,80,20);
        this.add(txfDiaCir);
        this.txfDiaCir.setBounds(148,160,80,20);
        this.add(txfCirAr);
        this.txfCirAr.setBounds(148,270,80,20);
        this.add(txfCirOm);
        this.txfCirOm.setBounds(148,380,80,20);
        this.add(txfRectAr);
        this.txfRectAr.setBounds(430,300,80,20);
        this.add(txfRectOm);
        this.txfRectOm.setBounds(430,380,80,20);
        this.add(txfDontKnow);
        this.txfDontKnow.setBounds(430,400,80,20);
        
       
        /*
        Här skrivs vad som ska hända när man klickar på omSkaparen.
        Det kommer ut ett fönster med texten inom parantesen.
        */
        this.omSkaparen.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,
                        "Copyright:...");
            }
        });
        
        //Detta gör att fönstret stängs när man trycker på avsluta.
        this.avsluta.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        
        /*
         * Här skrivs vad som ska hända när man klickar knappen cirkel.
        Först tas värdet från textfeilden där man matar in cirkelns diameter
        och görs om från en sträng till en double som döps till diameter. 
        Sedan gör en ny cirkel med inparametern diameter. Efter det så sätts 
        bägge area och omkretsens textfeild till true 
        (de hade värdet fasle innan så att inget värde kunde matas in av användaren) 
        och fylls på med  respektive värde. Sist så öppnas ett eventwindow 
        fönster och i den ritas cirkeln ut.
         */
        this.btnCir.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                double diameter = Double.parseDouble(txfDiaCir.getText());
                
                cir = new Circle(diameter);
                
                txfCirAr.setEnabled(true);
                txfCirOm.setEnabled(true);
                txfCirOm.setText(Double.toString(cir.calcCirOmkrets()));
                txfCirAr.setText(Double.toString(cir.calcCirArea()));
                
                EventWindow win = new EventWindow( 600,600, "Cirkel"); 
                cir.drawShape(win);
            }
        
        });
                
        /*
         * Här skrivs koden för vad som ska hända när man klickar knappen 
        rektangel.
        Först tas värdet från textfeilden där man matar in rektangens höjd samt
        bredd och görs om från strängar till ints som döps till  hojd samt
        bredd. Sedan gör en ny reaktangel med inparameterna hojd och bredd. 
        Efter det så sätts bägge area och omkretsens textfeild till true och 
        fylls på med respektive värde. Sist så öppnas ett eventwindow fönster 
        och i den ritas rektangeln ut.
        */
        this.btnRect.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                int hojd = Integer.valueOf(txfHR.getText());
                int bredd = Integer.valueOf(txfBR.getText());
                
                rec = new Rectangle(hojd, bredd);
                txfRectAr.setEnabled(true);
                txfRectOm.setEnabled(true);
                txfRectAr.setText(Integer.toString(rec.calcRectArea()));
                txfRectOm.setText(Integer.toString(rec.calcRectOmkrets()));
                
                
                EventWindow win = new EventWindow( 600,600, "Rektangel");
                rec.drawShape(win);
            }
                
        });
                       
    };
        
    public static void main(String[] args){
        //Följande rader säkrar att GUI:et startar i EDT
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new MainGUI().setVisible(true);
            }
        });
    }
}
