import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class PantallaPartida extends JPanel implements ActionListener {

    private Image imagenDeFondo;
    private Marco marco;
    private JButton SanFrancisco, Chicago, Atlanta, Montreal, NuevaYork, Washington, Londres, Madrid, Paris, Essen, Milan, SanPetersburgo,
    LosAngeles, Miami, Mexico, Bogota, Lima, Santiago, BuenosAires, SaoPaulo, Lagos, Kinsasa, Jartum, Johannesburgo, Argel, Cairo, Riad, Estambul,
    Bagdad, Moscu, Teheran, Karachi, Bombay, NuevaDelhi, Calcuta, Madras, Yakarta, Bangkok, HongKong, Shanghai, Pekin, Seul, Tokio, Osaka, Taipei,
    HoChiMinh, Manila, Sidney;
    

    public PantallaPartida(String rutaImagen, Marco marco) {
        this.marco = marco;
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        imagenDeFondo = new ImageIcon(rutaImagen).getImage();
        
        SanFrancisco = crearBoton("src/img/CiudadAzul.png", 32, 32);
        
        gbc.gridx = 0; // Columna
        gbc.gridy = 0; // Fila
        gbc.insets = new Insets(10, 10, 10, 10); // Margen exterior
        add(SanFrancisco, gbc);
        
        setVisible(true);
        
        InputMap inputMap = getInputMap(WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke("ESCAPE"), "volverAtras");
        ActionMap actionMap = getActionMap();
        actionMap.put("volverAtras", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Abrir Menu Opciones
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagenDeFondo, 0, 0, getWidth(), getHeight(), this);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 600);
    }

    private JButton crearBoton(String rutaImagen, int ancho, int alto) {
        JButton boton = new JButton();
        boton.setPreferredSize(new Dimension(ancho, alto));
        ImageIcon imagenBoton = new ImageIcon(rutaImagen);
        boton.setIcon(new ImageIcon(imagenBoton.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_SMOOTH)));
        boton.setBorderPainted(false); 
        boton.setContentAreaFilled(false); 
        return boton;
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
    
}