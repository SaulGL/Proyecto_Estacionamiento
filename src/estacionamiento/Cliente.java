
package estacionamiento;

// <editor-fold defaultstate="collapsed" desc="Imports"> 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// </editor-fold>

public class Cliente extends JFrame implements ActionListener{

////////////////////////////////////////////////////////////////////////////////   
    
 // <editor-fold defaultstate="collapsed" desc="Inicializacion de componentes">    
    JLabel ehora;   //e= etiqueta
    JLabel enumero;
    
    JMenuBar menu;
    JMenu pisos;
    JMenuItem piso1;
    JMenuItem piso2;
    JMenuItem piso3;
    
    JPanel norte; 
    JPanel centro; 
    
    BorderLayout borde,borde2;
    GridLayout rnorte; //r= rejilla
    GridLayout rcentro;
// </editor-fold>
    
////////////////////////////////////////////////////////////////////////////////
    
// <editor-fold defaultstate="collapsed" desc="Funcion Init"> 
    void init(){
        
        //Imágenes
        ((JPanel)getContentPane()).setOpaque(false); 
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/imagenes/portada.jpg")); 
        JLabel fondo = new JLabel(); 
        fondo.setIcon(uno); 
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER); 
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
////////////////////////////////////////////////////////////////////////////////
        //Label
        ehora = new JLabel("Hora");        
        enumero = new JLabel("Numero");
        
        //Pisos
        menu = new JMenuBar();
        pisos = new JMenu("PISO");
        piso1 = new JMenuItem("PISO 1");
        piso2 = new JMenuItem("PISO 2");
        piso3 = new JMenuItem("PISO 3");
        
        //Panel
        norte = new JPanel();
        centro = new JPanel();
        
        //BorderLayout
        borde = new BorderLayout();
        setLayout(borde);
        
        borde2 = new BorderLayout();// distribucion central
        
        
        //Rejillas
        rnorte = new GridLayout(1,2);
        norte.setLayout(rnorte);
        
        centro.setLayout(borde2);

////////////////////////////////////////////////////////////////////////////////
        
        menu.add(pisos);
        pisos.add(piso1);
        pisos.add(piso2);
        pisos.add(piso3);
        norte.add(menu);
        
        add(norte,BorderLayout.NORTH);
        //add(centro,BorderLayout.CENTER);
        
////////////////////////////////////////////////////////////////////////////////

 try {
            UIManager.setLookAndFeel(
                    //            "javax.swing.plaf.metal.MetalLookAndFeel");
                    "javax.swing.plaf.nimbus.NimbusLookAndFeel");//posibles
            //"com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            //"com.sun.java.swing.plaf.windows.WindowsLookAndFeel");//posibles
            //"com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            System.out.println("No se ha podido configura el look and feel" + e);
            e.printStackTrace();
        }
 
        setTitle("Estacionamiento");
        setSize(1200,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }
// </editor-fold>
    
////////////////////////////////////////////////////////////////////////////////
    
 // <editor-fold defaultstate="collapsed" desc="Inicializacion de componentes"> 
    @Override
    public void actionPerformed(ActionEvent ae) {
    
    }
// </editor-fold>
    
}