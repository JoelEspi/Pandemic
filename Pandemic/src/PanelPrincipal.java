import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PanelPrincipal extends JPanel implements ActionListener {
	
    Instrucciones lamina_Instrucciones;

    private Image imagenDeFondo;
    private Marco marco;
    private JButton botonInformacion;
    private JButton botonPuntuaciones;
    private JButton botonSalir;
    private JButton botonNuevaPartida;

    PanelPrincipal(String rutaImagen, Marco marco) {
        this.marco = marco;
        setLayout(new GridBagLayout());
        setBorder(new EmptyBorder(150, 0, 0, 0));
        imagenDeFondo = new ImageIcon(rutaImagen).getImage();

        botonNuevaPartida = crearBoton("src/img/Nueva_Partida-Boton-1.png", 512, 64);
        JButton botonCargarPartida = crearBoton("src/img/Cargar_Partida-Boton-1.png", 512, 64);
        botonInformacion = crearBoton("src/img/Instrucciones-Boton-1.png", 512, 64);
        botonPuntuaciones = crearBoton("src/img/Puntuaciones-Boton-1.png", 512, 64);
        botonSalir = crearBoton("src/img/Salir-Boton-3.png", 256, 64);
        
        botonNuevaPartida.addActionListener(this);
        botonInformacion.addActionListener(this);
        botonSalir.addActionListener(this);
        botonPuntuaciones.addActionListener(this);

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.insets = new Insets(0, 0, 20, 0);
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridy = 0;
        add(botonNuevaPartida, gbc);

        gbc.gridy++;
        add(botonCargarPartida, gbc);

        gbc.gridy++;
        add(botonInformacion, gbc);

        gbc.gridy++;
        add(botonPuntuaciones, gbc);

        gbc.gridy++;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(botonSalir, gbc);

        botonInformacion.addActionListener(this);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagenDeFondo, 0, 0, getWidth(), getHeight(), this);
    }

    private JButton crearBoton(String rutaImagen, int ancho, int alto) {
        JButton boton = new JButton();
        boton.setPreferredSize(new Dimension(ancho, alto));
        ImageIcon imagenBoton = new ImageIcon(rutaImagen);
        boton.setIcon(new ImageIcon(imagenBoton.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_SMOOTH)));
        return boton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    	if (e.getSource() == botonNuevaPartida) {
    		setVisible(false);
            marco.getContentPane().removeAll(); 
            marco.getContentPane().add(new PantallaDificultad("src/img/PantallaDificultad.png", marco));
            marco.revalidate(); 
            marco.repaint(); 
    	}
    	if (e.getSource() == botonInformacion) {
            setVisible(false);
            marco.getContentPane().removeAll(); 
            marco.getContentPane().add(new Instrucciones("src/img/FondoInstrucciones.png", marco));
            marco.revalidate(); 
            marco.repaint(); 
        }
    	if (e.getSource() == botonPuntuaciones) {
    		setVisible(false);
    		marco.getContentPane().removeAll(); 
            marco.getContentPane().add(new Instrucciones("src/img/FondoPuntuaciones.png", marco));
            marco.revalidate(); 
            marco.repaint();
    	}
        if (e.getSource() == botonSalir) {
        	System.exit(0);
        }
        
    }
}
