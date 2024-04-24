import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Marco extends JFrame {

    PanelPrincipal lamina1;

    Marco() {
        GraphicsDevice dispositivo = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Pandemic");
        setSize(1366, 748);

        /*if (dispositivo.isFullScreenSupported()) {
            setResizable(true);
            dispositivo.setFullScreenWindow(this);
        } else {
            System.err.println("Pantalla completa no soportada");
            setBounds(0, 0, 1024, 640);
        }
		*/
        
        setMinimumSize(new Dimension(1024, 640));

        String rutaImagenFondo = "src/img/FondoPantallaCompleto-1.png";
        lamina1 = new PanelPrincipal(rutaImagenFondo, this);

        lamina1.setOpaque(false);

        add(lamina1);
        
        ImageIcon icono = new ImageIcon("src/img/Logo.png");
        setIconImage(icono.getImage());

        setVisible(true);
    }
}