package Lanzadera;

import Controlador.CControlador;
import Vista.VApplet;
import javax.swing.JFrame;

/**
 *
 * @author marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//      En teoría MVC hace que la lanzadera llame al controlador para que éste
//      se encargue de iniciar la vista, pero como estamos trabajando con Applets y además,
//      queremos la app de escritorio, el frame se creará en el main y añadiremos
//      el panel del applet en el mismo. 

        JFrame frame = new JFrame("Aplicación Tarjetero");
        VApplet vApplet = new VApplet();
        
        //Inicializamos todos los componentes de la vista (Applet).
        vApplet.init();
        //Inicializamos el controlador.
        vApplet.start();
        
        //Le asignamos tamaño, posición, etc. al frame principal y le añadimos el panel principal del applet.
        frame.setSize(950, 650);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.add(vApplet.getvApplet());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
