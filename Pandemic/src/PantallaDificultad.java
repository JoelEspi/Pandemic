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
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class PantallaDificultad extends JPanel implements ActionListener{

	private Image imagenDeFondo;
    private Marco marco;
    private JButton botonAtras, Dificultad1, Dificultad2, Dificultad3;
    
    public static int Dificultad;
    
    public PantallaDificultad(String rutaImagen, Marco marco) {
        this.marco = marco;
        setLayout(new GridBagLayout());
        setBorder(new EmptyBorder(600, 0, 0, 0));
        imagenDeFondo = new ImageIcon(rutaImagen).getImage();

        botonAtras = crearBoton("src/img/Atras_Boton-1.png", 240, 64);
        Dificultad1 = crearBoton("src/img/BotonFacil.png", 240, 64);
        Dificultad2 = crearBoton("src/img/BotonNormal.png", 240, 64);
        Dificultad3 = crearBoton("src/img/BotonDificil.png", 240, 64);
        botonAtras.addActionListener(this);
        Dificultad1.addActionListener(this);
        Dificultad2.addActionListener(this);
        Dificultad3.addActionListener(this);

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 1;  
        gbc.insets = new Insets(0, 0, 0, 0);
        gbc.anchor = GridBagConstraints.CENTER;
        add(botonAtras, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;  
        gbc.insets = new Insets(-450, -900, 0, 0);
        gbc.anchor = GridBagConstraints.CENTER;
        add(Dificultad1, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;  
        gbc.insets = new Insets(-450, 0, 0, 0);
        gbc.anchor = GridBagConstraints.CENTER;
        add(Dificultad2, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;  
        gbc.insets = new Insets(-450, 900, 0, 0);
        gbc.anchor = GridBagConstraints.CENTER;
        add(Dificultad3, gbc);
        
        InputMap inputMap = getInputMap(WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke("ESCAPE"), "volverAtras");
        ActionMap actionMap = getActionMap();
        actionMap.put("volverAtras", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volverAtras();
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
        return boton;
    }
    
    private void volverAtras() {
        setVisible(false);
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.getContentPane().removeAll();
        frame.add(new PanelPrincipal("src/img/FondoPantallaCompleto-1.png", marco));
        frame.revalidate();
        frame.repaint();
    }
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botonAtras) {
            volverAtras();
        }else if (e.getSource() == Dificultad1) {
        	setVisible(false);
        	Dificultad = 1;
            marco.getContentPane().removeAll(); 
            marco.getContentPane().add(new PantallaPartida("src/img/BackGround_Marks_1.png", marco));
            marco.revalidate(); 
            marco.repaint();
        }else if (e.getSource() == Dificultad2) {
        	Dificultad = 2;
        	setVisible(false);
            marco.getContentPane().removeAll(); 
            marco.getContentPane().add(new PantallaPartida("src/img/BackGround_Marks_1.png", marco));
            marco.revalidate(); 
            marco.repaint();
        }else if (e.getSource() == Dificultad3) {
        	Dificultad = 3;
        	setVisible(false);
            marco.getContentPane().removeAll(); 
            marco.getContentPane().add(new PantallaPartida("src/img/BackGround_Marks_1.png", marco));
            marco.revalidate(); 
            marco.repaint();
        }
	}
}
