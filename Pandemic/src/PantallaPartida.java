import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Random;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

public class PantallaPartida extends JPanel implements ActionListener {

    private static int VirusSanFrancisco;
	private static int VirusChicago;
	private static int VirusAtlanta;
	private static int VirusMontreal;
	private static int VirusNuevaYork;
	private static int VirusWashington;
	private static int VirusLondres;
	private static int VirusMadrid;
	private static int VirusParis;
	private static int VirusEssen;
	private static int VirusMilan;
	private static int VirusSanPetersburgo;
	private static int VirusLosAngeles;
	private static int VirusMiami;
	private static int VirusMexico;
	private static int VirusBogota;
	private static int VirusLima;
	private static int VirusSantiago;
	private static int VirusBuenosAires;
	private static int VirusSaoPaulo;
	private static int VirusLagos;
	private static int VirusKinsasa;
	private static int VirusJartum;
	private static int VirusJohannesburgo;
	private static int VirusArgel;
	private static int VirusCairo;
	private static int VirusRiad;
	private static int VirusEstambul;
	private static int VirusBagdad;
	private static int VirusMoscu;
	private static int VirusTeheran;
	private static int VirusKarachi;
	private static int VirusBombay;
	private static int VirusNuevaDelhi;
	private static int VirusCalcuta;
	private static int VirusMadras;
	private static int VirusYakarta;
	private static int VirusBangkok;
	private static int VirusHongKong;
	private static int VirusShanghai;
	private static int VirusPekin;
	private static int VirusSeul;
	private static int VirusTokio;
	private static int VirusOsaka;
	private static int VirusTaipei;
	private static int VirusHoChiMinh;
	private static int VirusManila;
	private static int VirusSidney;
	private Image imagenDeFondo;
    private ImageIcon carta;
    private Marco marco;
    private JButton SanFrancisco, Chicago, Atlanta, Montreal, NuevaYork, Washington, Londres, Madrid, Paris, Essen, Milan, SanPetersburgo,
    LosAngeles, Miami, Mexico, Bogota, Lima, Santiago, BuenosAires, SaoPaulo, Lagos, Kinsasa, Jartum, Johannesburgo, Argel, Cairo, Riad, Estambul,
    Bagdad, Moscu, Teheran, Karachi, Bombay, NuevaDelhi, Calcuta, Madras, Yakarta, Bangkok, HongKong, Shanghai, Pekin, Seul, Tokio, Osaka, Taipei,
    HoChiMinh, Manila, Sidney, DesarrollarCura, CurarCiudad, CuraAzul, CuraNegro, CuraAmarillo, CuraRojo;
    private JLabel SanFranciscoLabel, ChicagoLabel, AtlantaLabel, MontrealLabel, NuevaYorkLabel, WashingtonLabel, LondresLabel, MadridLabel, ParisLabel, EssenLabel, MilanLabel, SanPetersburgoLabel,
    LosAngelesLabel, MiamiLabel, MexicoLabel, BogotaLabel, LimaLabel, SantiagoLabel, BuenosAiresLabel, SaoPauloLabel, LagosLabel, KinsasaLabel, JartumLabel, JohannesburgoLabel, ArgelLabel, CairoLabel, RiadLabel, EstambulLabel,
    BagdadLabel, MoscuLabel, TeheranLabel, KarachiLabel, BombayLabel, NuevaDelhiLabel, CalcutaLabel, MadrasLabel, YakartaLabel, BangkokLabel, HongKongLabel, ShanghaiLabel, PekinLabel, SeulLabel, TokioLabel, OsakaLabel, TaipeiLabel,
    HoChiMinhLabel, ManilaLabel, SidneyLabel, LabelIntentos, AzulLabel, NegroLabel, AmarilloLabel, RojoLabel;

    int[] arrayRandom1 = new int[6];
    int[] arrayRandom2 = new int[12];
    int[] arrayRandom3 = new int[20];
    
    	private int Intentos = 4;
    	private static int PorcentajeDesarrolloAzul = 0;
    	private static int PorcentajeDesarrolloNegro = 0;
    	private static int PorcentajeDesarrolloAmarillo = 0;
    	private static int PorcentajeDesarrolloRojo = 0;
    
    public PantallaPartida(String rutaImagen, Marco marco) {
    	
    	if(PantallaDificultad.Dificultad == 1) {
    		Random rand = new Random();
    	HashSet<Integer> numerosGenerados = new HashSet<>();
    	for (int i = 0; i < arrayRandom1.length; i++) {
    		int numeroAleatorio;
        do {
            numeroAleatorio = rand.nextInt(48);
        } while (numerosGenerados.contains(numeroAleatorio));
        numerosGenerados.add(numeroAleatorio);
        arrayRandom1[i] = numeroAleatorio;
    	}
    	}else if (PantallaDificultad.Dificultad == 2) {
    		Random rand = new Random();
    	HashSet<Integer> numerosGenerados = new HashSet<>();
    	for (int i = 0; i < arrayRandom2.length; i++) {
    		int numeroAleatorio;
        do {
            numeroAleatorio = rand.nextInt(48);
        } while (numerosGenerados.contains(numeroAleatorio));
        numerosGenerados.add(numeroAleatorio);
        arrayRandom2[i] = numeroAleatorio;
    	} 
    	}else if (PantallaDificultad.Dificultad == 3) {
    		Random rand = new Random();
    	HashSet<Integer> numerosGenerados = new HashSet<>();
    	for (int i = 0; i < arrayRandom3.length; i++) {
    		int numeroAleatorio;
        do {
            numeroAleatorio = rand.nextInt(48);
        } while (numerosGenerados.contains(numeroAleatorio));
        numerosGenerados.add(numeroAleatorio);
        arrayRandom3[i] = numeroAleatorio;
    	}
    	}
    	
        this.marco = marco;
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        imagenDeFondo = new ImageIcon(rutaImagen).getImage();
        
        SanFrancisco = crearBoton("src/img/CiudadAzul.png", 32, 32);
        Chicago = crearBoton("src/img/CiudadAzul.png", 32, 32);
        Atlanta = crearBoton("src/img/CiudadAzul.png", 32, 32);
        Montreal = crearBoton("src/img/CiudadAzul.png", 32, 32);
        NuevaYork = crearBoton("src/img/CiudadAzul.png", 32, 32);
        Washington = crearBoton("src/img/CiudadAzul.png", 32, 32);
        Londres = crearBoton("src/img/CiudadAzul.png", 32, 32);
        Madrid = crearBoton("src/img/CiudadAzul.png", 32, 32);
        Paris = crearBoton("src/img/CiudadAzul.png", 32, 32);
        Essen = crearBoton("src/img/CiudadAzul.png", 32, 32);
        Milan = crearBoton("src/img/CiudadAzul.png", 32, 32);
        SanPetersburgo = crearBoton("src/img/CiudadAzul.png", 32, 32);
        LosAngeles = crearBoton("src/img/CiudadAmarillo.png", 32, 32);
        Miami = crearBoton("src/img/CiudadAmarillo.png", 32, 32);
        Mexico = crearBoton("src/img/CiudadAmarillo.png", 32, 32);
        Bogota = crearBoton("src/img/CiudadAmarillo.png", 32, 32);
        Lima = crearBoton("src/img/CiudadAmarillo.png", 32, 32);
        Santiago = crearBoton("src/img/CiudadAmarillo.png", 32, 32);
        BuenosAires = crearBoton("src/img/CiudadAmarillo.png", 32, 32);
        SaoPaulo = crearBoton("src/img/CiudadAmarillo.png", 32, 32);
        Lagos = crearBoton("src/img/CiudadAmarillo.png", 32, 32);
        Kinsasa = crearBoton("src/img/CiudadAmarillo.png", 32, 32);
        Jartum = crearBoton("src/img/CiudadAmarillo.png", 32, 32);
        Johannesburgo = crearBoton("src/img/CiudadAmarillo.png", 32, 32);
        Argel = crearBoton("src/img/CiudadNegro.png", 32, 32);
        Cairo = crearBoton("src/img/CiudadNegro.png", 32, 32);
        Riad = crearBoton("src/img/CiudadNegro.png", 32, 32);
        Estambul = crearBoton("src/img/CiudadNegro.png", 32, 32);
        Bagdad = crearBoton("src/img/CiudadNegro.png", 32, 32);
        Moscu = crearBoton("src/img/CiudadNegro.png", 32, 32);
        Teheran = crearBoton("src/img/CiudadNegro.png", 32, 32);
        Karachi = crearBoton("src/img/CiudadNegro.png", 32, 32);
        Bombay = crearBoton("src/img/CiudadNegro.png", 32, 32);
        NuevaDelhi = crearBoton("src/img/CiudadNegro.png", 32, 32);
        Calcuta = crearBoton("src/img/CiudadNegro.png", 32, 32);
        Madras = crearBoton("src/img/CiudadNegro.png", 32, 32);
        Yakarta = crearBoton("src/img/CiudadRojo.png", 32, 32);
        Bangkok = crearBoton("src/img/CiudadRojo.png", 32, 32);
        HongKong = crearBoton("src/img/CiudadRojo.png", 32, 32);
        Shanghai = crearBoton("src/img/CiudadRojo.png", 32, 32);
        Pekin = crearBoton("src/img/CiudadRojo.png", 32, 32);
        Seul = crearBoton("src/img/CiudadRojo.png", 32, 32);
        Tokio = crearBoton("src/img/CiudadRojo.png", 32, 32);
        Osaka = crearBoton("src/img/CiudadRojo.png", 32, 32);
        Taipei = crearBoton("src/img/CiudadRojo.png", 32, 32);
        HoChiMinh = crearBoton("src/img/CiudadRojo.png", 32, 32);
        Manila = crearBoton("src/img/CiudadRojo.png", 32, 32);
        Sidney = crearBoton("src/img/CiudadRojo.png", 32, 32);
        
        DesarrollarCura = crearBoton("src/img/DesarrollarCura_Boton.png", 192, 48);
        CurarCiudad = crearBoton("src/img/CurarCiudad_Boton.png", 192, 48);
        
        CuraAzul = crearBoton("src/img/CuraAzul_Boton.png", 64, 64);
        CuraAmarillo = crearBoton("src/img/CuraAmarillo_Boton.png", 64, 64);
        CuraNegro = crearBoton("src/img/CuraNegro_Boton.png", 64, 64);
        CuraRojo = crearBoton("src/img/CuraRojo_Boton.png", 64, 64);
        
        VirusSanFrancisco = CantidadVirus("SanFrancisco");
        VirusChicago = CantidadVirus("Chicago");
        VirusAtlanta = CantidadVirus("Atlanta");
        VirusMontreal = CantidadVirus("Montreal");
        VirusNuevaYork = CantidadVirus("NuevaYork");
        VirusWashington = CantidadVirus("Washington");
        VirusLondres = CantidadVirus("Londres");
        VirusMadrid = CantidadVirus("Madrid");
        VirusParis = CantidadVirus("Paris");
        VirusEssen = CantidadVirus("Essen");
        VirusMilan = CantidadVirus("Milan");
        VirusSanPetersburgo = CantidadVirus("SanPetersburgo");
        VirusLosAngeles = CantidadVirus("LosAngeles");
        VirusMiami = CantidadVirus("Miami");
        VirusMexico = CantidadVirus("Mexico");
        VirusBogota = CantidadVirus("Bogota");
        VirusLima = CantidadVirus("Lima");
        VirusSantiago = CantidadVirus("Santiago");
        VirusBuenosAires = CantidadVirus("BuenosAires");
        VirusSaoPaulo = CantidadVirus("SaoPaulo");
        VirusLagos = CantidadVirus("Lagos");
        VirusKinsasa = CantidadVirus("Kinsasa");
        VirusJartum = CantidadVirus("Jartum");
        VirusJohannesburgo = CantidadVirus("Johannesburgo");
        VirusArgel = CantidadVirus("Argel");
        VirusCairo = CantidadVirus("Cairo");
        VirusRiad = CantidadVirus("Riad");
        VirusEstambul = CantidadVirus("Estambul");
        VirusBagdad = CantidadVirus("Bagdad");
        VirusMoscu = CantidadVirus("Moscu");
        VirusTeheran = CantidadVirus("Teheran");
        VirusKarachi = CantidadVirus("Karachi");
        VirusBombay = CantidadVirus("Bombay");
        VirusNuevaDelhi = CantidadVirus("NuevaDelhi");
        VirusCalcuta = CantidadVirus("Calcuta");
        VirusMadras = CantidadVirus("Madras");
        VirusYakarta = CantidadVirus("Yakarta");
        VirusBangkok = CantidadVirus("Bangkok");
        VirusHongKong = CantidadVirus("HongKong");
        VirusShanghai = CantidadVirus("Shanghai");
        VirusPekin = CantidadVirus("Pekin");
        VirusSeul = CantidadVirus("Seul");
        VirusTokio = CantidadVirus("Tokio");
        VirusOsaka = CantidadVirus("Osaka");
        VirusTaipei = CantidadVirus("Taipei");
        VirusHoChiMinh = CantidadVirus("HoChiMinh");
        VirusManila = CantidadVirus("Manila");
        VirusSidney = CantidadVirus("Sidney");
        
        SanFranciscoLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusSanFrancisco+"</div></html>");
        gbc.gridx = 0; // Columna
        gbc.gridy = 0; // Fila
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        SanFranciscoLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_SanFrancisco.png");
        SanFranciscoLabel.setIcon(carta);
        SanFranciscoLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        SanFranciscoLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        SanFranciscoLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        SanFranciscoLabel.setPreferredSize(new Dimension(200, 300));
        add(SanFranciscoLabel, gbc);
        
        ChicagoLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusChicago+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        ChicagoLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Chicago.png");
        ChicagoLabel.setIcon(carta);
        ChicagoLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        ChicagoLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        ChicagoLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        ChicagoLabel.setPreferredSize(new Dimension(200, 300));
        add(ChicagoLabel, gbc);
        
        AtlantaLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusAtlanta+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        AtlantaLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Atlanta.png");
        AtlantaLabel.setIcon(carta);
        AtlantaLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        AtlantaLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        AtlantaLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        AtlantaLabel.setPreferredSize(new Dimension(200, 300));
        add(AtlantaLabel, gbc);
        
        MontrealLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusMontreal+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        MontrealLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Montreal.png");
        MontrealLabel.setIcon(carta);
        MontrealLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        MontrealLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        MontrealLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        MontrealLabel.setPreferredSize(new Dimension(200, 300));
        add(MontrealLabel, gbc);
        
        NuevaYorkLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusNuevaYork+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        NuevaYorkLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_NuevaYork.png");
        NuevaYorkLabel.setIcon(carta);
        NuevaYorkLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        NuevaYorkLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        NuevaYorkLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        NuevaYorkLabel.setPreferredSize(new Dimension(200, 300));
        add(NuevaYorkLabel, gbc);
        
        WashingtonLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusWashington+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        WashingtonLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Washington.png");
        WashingtonLabel.setIcon(carta);
        WashingtonLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        WashingtonLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        WashingtonLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        WashingtonLabel.setPreferredSize(new Dimension(200, 300));
        add(WashingtonLabel, gbc);
        
        LondresLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusLondres+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        LondresLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Londres.png");
        LondresLabel.setIcon(carta);
        LondresLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        LondresLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        LondresLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        LondresLabel.setPreferredSize(new Dimension(200, 300));
        add(LondresLabel, gbc);
        
        MadridLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusMadrid+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        MadridLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Madrid.png");
        MadridLabel.setIcon(carta);
        MadridLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        MadridLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        MadridLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        MadridLabel.setPreferredSize(new Dimension(200, 300));
        add(MadridLabel, gbc);
        
        ParisLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusParis+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        ParisLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Paris.png");
        ParisLabel.setIcon(carta);
        ParisLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        ParisLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        ParisLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        ParisLabel.setPreferredSize(new Dimension(200, 300));
        add(ParisLabel, gbc);
        
        EssenLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusEssen+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        EssenLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Essen.png");
        EssenLabel.setIcon(carta);
        EssenLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        EssenLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        EssenLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        EssenLabel.setPreferredSize(new Dimension(200, 300));
        add(EssenLabel, gbc);
        
        MilanLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusMilan+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        MilanLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Milan.png");
        MilanLabel.setIcon(carta);
        MilanLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        MilanLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        MilanLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        MilanLabel.setPreferredSize(new Dimension(200, 300));
        add(MilanLabel, gbc);
        
        SanPetersburgoLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusSanPetersburgo+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        SanPetersburgoLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_SanPetersburgo.png");
        SanPetersburgoLabel.setIcon(carta);
        SanPetersburgoLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        SanPetersburgoLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        SanPetersburgoLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        SanPetersburgoLabel.setPreferredSize(new Dimension(200, 300));
        add(SanPetersburgoLabel, gbc);
        
        LosAngelesLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusLosAngeles+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        LosAngelesLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_LosAngeles.png");
        LosAngelesLabel.setIcon(carta);
        LosAngelesLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        LosAngelesLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        LosAngelesLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        LosAngelesLabel.setPreferredSize(new Dimension(200, 300));
        add(LosAngelesLabel, gbc);
        
        MiamiLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusMiami+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        MiamiLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Miami.png");
        MiamiLabel.setIcon(carta);
        MiamiLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        MiamiLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        MiamiLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        MiamiLabel.setPreferredSize(new Dimension(200, 300));
        add(MiamiLabel, gbc);
        
        MexicoLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusMexico+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        MexicoLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Mexico.png");
        MexicoLabel.setIcon(carta);
        MexicoLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        MexicoLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        MexicoLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        MexicoLabel.setPreferredSize(new Dimension(200, 300));
        add(MexicoLabel, gbc);
        
        BogotaLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusBogota+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        BogotaLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Bogota.png");
        BogotaLabel.setIcon(carta);
        BogotaLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        BogotaLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        BogotaLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        BogotaLabel.setPreferredSize(new Dimension(200, 300));
        add(BogotaLabel, gbc);
        
        LimaLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusLima+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        LimaLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Lima.png");
        LimaLabel.setIcon(carta);
        LimaLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        LimaLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        LimaLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        LimaLabel.setPreferredSize(new Dimension(200, 300));
        add(LimaLabel, gbc);
        
        SantiagoLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusSantiago+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        SantiagoLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Santiago.png");
        SantiagoLabel.setIcon(carta);
        SantiagoLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        SantiagoLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        SantiagoLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        SantiagoLabel.setPreferredSize(new Dimension(200, 300));
        add(SantiagoLabel, gbc);
        
        BuenosAiresLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusBuenosAires+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        BuenosAiresLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_BuenosAires.png");
        BuenosAiresLabel.setIcon(carta);
        BuenosAiresLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        BuenosAiresLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        BuenosAiresLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        BuenosAiresLabel.setPreferredSize(new Dimension(200, 300));
        add(BuenosAiresLabel, gbc);
        
        SaoPauloLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusSaoPaulo+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        SaoPauloLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_SaoPaulo.png");
        SaoPauloLabel.setIcon(carta);
        SaoPauloLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        SaoPauloLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        SaoPauloLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        SaoPauloLabel.setPreferredSize(new Dimension(200, 300));
        add(SaoPauloLabel, gbc);
        
        LagosLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusLagos+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        LagosLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Lagos.png");
        LagosLabel.setIcon(carta);
        LagosLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        LagosLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        LagosLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        LagosLabel.setPreferredSize(new Dimension(200, 300));
        add(LagosLabel, gbc);
        
        KinsasaLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusKinsasa+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        KinsasaLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Kinsasa.png");
        KinsasaLabel.setIcon(carta);
        KinsasaLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        KinsasaLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        KinsasaLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        KinsasaLabel.setPreferredSize(new Dimension(200, 300));
        add(KinsasaLabel, gbc);
        
        JartumLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusJartum+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        JartumLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Jartum.png");
        JartumLabel.setIcon(carta);
        JartumLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        JartumLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        JartumLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        JartumLabel.setPreferredSize(new Dimension(200, 300));
        add(JartumLabel, gbc);
        
        JohannesburgoLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusJohannesburgo+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        JohannesburgoLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Johannesburgo.png");
        JohannesburgoLabel.setIcon(carta);
        JohannesburgoLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        JohannesburgoLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        JohannesburgoLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        JohannesburgoLabel.setPreferredSize(new Dimension(200, 300));
        add(JohannesburgoLabel, gbc);
        
        ArgelLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusArgel+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        ArgelLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Argel.png");
        ArgelLabel.setIcon(carta);
        ArgelLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        ArgelLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        ArgelLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        ArgelLabel.setPreferredSize(new Dimension(200, 300));
        add(ArgelLabel, gbc);
        
        CairoLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusCairo+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        CairoLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Cairo.png");
        CairoLabel.setIcon(carta);
        CairoLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        CairoLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        CairoLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        CairoLabel.setPreferredSize(new Dimension(200, 300));
        add(CairoLabel, gbc);
        
        RiadLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusRiad+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        RiadLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Riad.png");
        RiadLabel.setIcon(carta);
        RiadLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        RiadLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        RiadLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        RiadLabel.setPreferredSize(new Dimension(200, 300));
        add(RiadLabel, gbc);
        
        EstambulLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusEstambul+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        EstambulLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Estambul.png");
        EstambulLabel.setIcon(carta);
        EstambulLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        EstambulLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        EstambulLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        EstambulLabel.setPreferredSize(new Dimension(200, 300));
        add(EstambulLabel, gbc);
        
        BagdadLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusBagdad+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        BagdadLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Bagdad.png");
        BagdadLabel.setIcon(carta);
        BagdadLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        BagdadLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        BagdadLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        BagdadLabel.setPreferredSize(new Dimension(200, 300));
        add(BagdadLabel, gbc);
        
        MoscuLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusMoscu+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        MoscuLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Moscu.png");
        MoscuLabel.setIcon(carta);
        MoscuLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        MoscuLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        MoscuLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        MoscuLabel.setPreferredSize(new Dimension(200, 300));
        add(MoscuLabel, gbc);
        
        TeheranLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusTeheran+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        TeheranLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Teheran.png");
        TeheranLabel.setIcon(carta);
        TeheranLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        TeheranLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        TeheranLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        TeheranLabel.setPreferredSize(new Dimension(200, 300));
        add(TeheranLabel, gbc);
        
        KarachiLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusKarachi+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        KarachiLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Karachi.png");
        KarachiLabel.setIcon(carta);
        KarachiLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        KarachiLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        KarachiLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        KarachiLabel.setPreferredSize(new Dimension(200, 300));
        add(KarachiLabel, gbc);
        
        BombayLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusBombay+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        BombayLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Bombay.png");
        BombayLabel.setIcon(carta);
        BombayLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        BombayLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        BombayLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        BombayLabel.setPreferredSize(new Dimension(200, 300));
        add(BombayLabel, gbc);
        
        NuevaDelhiLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusNuevaDelhi+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        NuevaDelhiLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_NuevaDelhi.png");
        NuevaDelhiLabel.setIcon(carta);
        NuevaDelhiLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        NuevaDelhiLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        NuevaDelhiLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        NuevaDelhiLabel.setPreferredSize(new Dimension(200, 300));
        add(NuevaDelhiLabel, gbc);
        
        CalcutaLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusCalcuta+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        CalcutaLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Calcuta.png");
        CalcutaLabel.setIcon(carta);
        CalcutaLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        CalcutaLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        CalcutaLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        CalcutaLabel.setPreferredSize(new Dimension(200, 300));
        add(CalcutaLabel, gbc);
        
        MadrasLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusMadras+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        MadrasLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Madras.png");
        MadrasLabel.setIcon(carta);
        MadrasLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        MadrasLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        MadrasLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        MadrasLabel.setPreferredSize(new Dimension(200, 300));
        add(MadrasLabel, gbc);
        
        YakartaLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusYakarta+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        YakartaLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Yakarta.png");
        YakartaLabel.setIcon(carta);
        YakartaLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        YakartaLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        YakartaLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        YakartaLabel.setPreferredSize(new Dimension(200, 300));
        add(YakartaLabel, gbc);
        
        BangkokLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusBangkok+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        BangkokLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Bangkok.png");
        BangkokLabel.setIcon(carta);
        BangkokLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        BangkokLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        BangkokLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        BangkokLabel.setPreferredSize(new Dimension(200, 300));
        add(BangkokLabel, gbc);
        
        HongKongLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusHongKong+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        HongKongLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_HongKong.png");
        HongKongLabel.setIcon(carta);
        HongKongLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        HongKongLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        HongKongLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        HongKongLabel.setPreferredSize(new Dimension(200, 300));
        add(HongKongLabel, gbc);
        
        ShanghaiLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusShanghai+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        ShanghaiLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Shanghai.png");
        ShanghaiLabel.setIcon(carta);
        ShanghaiLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        ShanghaiLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        ShanghaiLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        ShanghaiLabel.setPreferredSize(new Dimension(200, 300));
        add(ShanghaiLabel, gbc);
        
        PekinLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusPekin+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        PekinLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Pekin.png");
        PekinLabel.setIcon(carta);
        PekinLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        PekinLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        PekinLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        PekinLabel.setPreferredSize(new Dimension(200, 300));
        add(PekinLabel, gbc);
        
        SeulLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusSeul+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        SeulLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Seul.png");
        SeulLabel.setIcon(carta);
        SeulLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        SeulLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        SeulLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        SeulLabel.setPreferredSize(new Dimension(200, 300));
        add(SeulLabel, gbc);
        
        TokioLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusTokio+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        TokioLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Tokio.png");
        TokioLabel.setIcon(carta);
        TokioLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        TokioLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        TokioLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        TokioLabel.setPreferredSize(new Dimension(200, 300));
        add(TokioLabel, gbc);
        
        OsakaLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusOsaka+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        OsakaLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Osaka.png");
        OsakaLabel.setIcon(carta);
        OsakaLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        OsakaLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        OsakaLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        OsakaLabel.setPreferredSize(new Dimension(200, 300));
        add(OsakaLabel, gbc);
        
        TaipeiLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusTaipei+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        TaipeiLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Taipei.png");
        TaipeiLabel.setIcon(carta);
        TaipeiLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        TaipeiLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        TaipeiLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        TaipeiLabel.setPreferredSize(new Dimension(200, 300));
        add(TaipeiLabel, gbc);
        
        HoChiMinhLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusHoChiMinh+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        HoChiMinhLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_HoChiMinh.png");
        HoChiMinhLabel.setIcon(carta);
        HoChiMinhLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        HoChiMinhLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        HoChiMinhLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        HoChiMinhLabel.setPreferredSize(new Dimension(200, 300));
        add(HoChiMinhLabel, gbc);
        
        ManilaLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusManila+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        ManilaLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Manila.png");
        ManilaLabel.setIcon(carta);
        ManilaLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        ManilaLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        ManilaLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        ManilaLabel.setPreferredSize(new Dimension(200, 300));
        add(ManilaLabel, gbc);
        
        SidneyLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusSidney+"</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        SidneyLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/Carta_Sidney.png");
        SidneyLabel.setIcon(carta);
        SidneyLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        SidneyLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        SidneyLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        SidneyLabel.setPreferredSize(new Dimension(200, 300));
        add(SidneyLabel, gbc);
        
        AzulLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Desarrollo Vacuna = "+PorcentajeDesarrolloAzul+" %</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        AzulLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/CartaAzul.png");
        AzulLabel.setIcon(carta);
        AzulLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        AzulLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        AzulLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        AzulLabel.setPreferredSize(new Dimension(200, 300));
        add(AzulLabel, gbc);
        
        NegroLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Desarrollo Vacuna = "+PorcentajeDesarrolloNegro+" %</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        NegroLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/CartaNegro.png");
        NegroLabel.setIcon(carta);
        NegroLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        NegroLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        NegroLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        NegroLabel.setPreferredSize(new Dimension(200, 300));
        add(NegroLabel, gbc);
        
        AmarilloLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Desarrollo Vacuna = "+PorcentajeDesarrolloAmarillo+" %</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        AmarilloLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/CartaAmarillo.png");
        AmarilloLabel.setIcon(carta);
        AmarilloLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        AmarilloLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        AmarilloLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        AmarilloLabel.setPreferredSize(new Dimension(200, 300));
        add(AmarilloLabel, gbc);
        
        RojoLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><div>Desarrollo Vacuna = "+PorcentajeDesarrolloRojo+" %</div></html>");
        gbc.insets = new Insets(380, -1105, 10, 10); // Margen exterior
        RojoLabel.setOpaque(true);
        carta = new ImageIcon("src/img/Cartas/CartaRojo.png");
        RojoLabel.setIcon(carta);
        RojoLabel.setVerticalTextPosition(SwingConstants.CENTER); // Centrar el texto verticalmente
        RojoLabel.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar el texto horizontalmente
        RojoLabel.setVisible(false); // Ocultar la etiqueta inicialmente
        RojoLabel.setPreferredSize(new Dimension(200, 300));
        add(RojoLabel, gbc);
        
        LabelIntentos = new JLabel("Intentos = "+Intentos+"");
        LabelIntentos.setFont(new Font("Arial", Font.BOLD, 32));
        gbc.insets = new Insets(-600, -1090, 10, 10); // Margen exterior
        LabelIntentos.setOpaque(false);
        LabelIntentos.setBorder(BorderFactory.createEmptyBorder());
        LabelIntentos.setPreferredSize(new Dimension(200, 50));
        add(LabelIntentos, gbc);

        gbc.insets = new Insets(-280, -710, 10, 10); // Margen exterior
        add(SanFrancisco, gbc);
        SanFrancisco.addActionListener(this);

        gbc.insets = new Insets(-300, -580, 10, 10); // Margen exterior
        add(Chicago, gbc);
        Chicago.addActionListener(this);

        gbc.insets = new Insets(-210, -515, 10, 10); // Margen exterior
        add(Atlanta, gbc);
        Atlanta.addActionListener(this);

        gbc.insets = new Insets(-330, -455, 10, 10); // Margen exterior
        add(Montreal, gbc);
        Montreal.addActionListener(this);

        gbc.insets = new Insets(-300, -340, 10, 10); // Margen exterior
        add(NuevaYork, gbc);
        NuevaYork.addActionListener(this);

        gbc.insets = new Insets(-210, -400, 10, 10); // Margen exterior
        add(Washington, gbc);
        Washington.addActionListener(this);

        gbc.insets = new Insets(-400, 70, 10, 10); // Margen exterior
        add(Londres, gbc);
        Londres.addActionListener(this);

        gbc.insets = new Insets(-250, 90, 10, 10); // Margen exterior
        add(Madrid, gbc);
        Madrid.addActionListener(this);

        gbc.insets = new Insets(-330, 140, 10, 10); // Margen exterior
        add(Paris, gbc);
        Paris.addActionListener(this);

        gbc.insets = new Insets(-450, 200, 10, 10); // Margen exterior
        add(Essen, gbc);
        Essen.addActionListener(this);

        gbc.insets = new Insets(-330, 240, 10, 10); // Margen exterior
        add(Milan, gbc);
        Milan.addActionListener(this);

        gbc.insets = new Insets(-400, 330, 10, 10); // Margen exterior
        add(SanPetersburgo, gbc);
        SanPetersburgo.addActionListener(this);

        gbc.insets = new Insets(-180, -730, 10, 10); // Margen exterior
        add(LosAngeles, gbc);
        LosAngeles.addActionListener(this);

        gbc.insets = new Insets(-70, -450, 10, 10); // Margen exterior
        add(Miami, gbc);
        Miami.addActionListener(this);

        gbc.insets = new Insets(-90, -650, 10, 10); // Margen exterior
        add(Mexico, gbc);
        Mexico.addActionListener(this);

        gbc.insets = new Insets(80, -440, 10, 10); // Margen exterior
        add(Bogota, gbc);
        Bogota.addActionListener(this);

        gbc.insets = new Insets(260, -465, 10, 10); // Margen exterior
        add(Lima, gbc);
        Lima.addActionListener(this);

        gbc.insets = new Insets(420, -410, 10, 10); // Margen exterior
        add(Santiago, gbc);
        Santiago.addActionListener(this);

        gbc.insets = new Insets(310, -240, 10, 10); // Margen exterior
        add(BuenosAires, gbc);
        BuenosAires.addActionListener(this);

        gbc.insets = new Insets(455, -325, 10, 10); // Margen exterior
        add(SaoPaulo, gbc);
        SaoPaulo.addActionListener(this);

        gbc.insets = new Insets(45, 100, 10, 10); // Margen exterior
        add(Lagos, gbc);
        Lagos.addActionListener(this);

        gbc.insets = new Insets(220, 235, 10, 10); // Margen exterior
        add(Kinsasa, gbc);
        Kinsasa.addActionListener(this);

        gbc.insets = new Insets(70, 330, 10, 10); // Margen exterior
        add(Jartum, gbc);
        Jartum.addActionListener(this);

        gbc.insets = new Insets(435, 305, 10, 10); // Margen exterior
        add(Johannesburgo, gbc);
        Johannesburgo.addActionListener(this);

        gbc.insets = new Insets(-135, 150, 10, 10); // Margen exterior
        add(Argel, gbc);
        Argel.addActionListener(this);

        gbc.insets = new Insets(-115, 315, 10, 10); // Margen exterior
        add(Cairo, gbc);
        Cairo.addActionListener(this);

        gbc.insets = new Insets(-30, 460, 10, 10); // Margen exterior
        add(Riad, gbc);
        Riad.addActionListener(this);

        gbc.insets = new Insets(-250, 290, 10, 10); // Margen exterior
        add(Estambul, gbc);
        Estambul.addActionListener(this);

        gbc.insets = new Insets(-210, 430, 10, 10); // Margen exterior
        add(Bagdad, gbc);
        Bagdad.addActionListener(this);

        gbc.insets = new Insets(-320, 410, 10, 10); // Margen exterior
        add(Moscu, gbc);
        Moscu.addActionListener(this);

        gbc.insets = new Insets(-260, 550, 10, 10); // Margen exterior
        add(Teheran, gbc);
        Teheran.addActionListener(this);

        gbc.insets = new Insets(-120, 570, 10, 10); // Margen exterior
        add(Karachi, gbc);
        Karachi.addActionListener(this);

        gbc.insets = new Insets(40, 595, 10, 10); // Margen exterior
        add(Bombay, gbc);
        Bombay.addActionListener(this);

        gbc.insets = new Insets(-190, 655, 10, 10); // Margen exterior
        add(NuevaDelhi, gbc);
        NuevaDelhi.addActionListener(this);

        gbc.insets = new Insets(-150, 735, 10, 10); // Margen exterior
        add(Calcuta, gbc);
        Calcuta.addActionListener(this);

        gbc.insets = new Insets(100, 710, 10, 10); // Margen exterior
        add(Madras, gbc);
        Madras.addActionListener(this);

        gbc.insets = new Insets(200, 820, 10, 10); // Margen exterior
        add(Yakarta, gbc);
        Yakarta.addActionListener(this);

        gbc.insets = new Insets(-40, 790, 10, 10); // Margen exterior
        add(Bangkok, gbc);
        Bangkok.addActionListener(this);

        gbc.insets = new Insets(-85, 880, 10, 10); // Margen exterior
        add(HongKong, gbc);
        HongKong.addActionListener(this);

        gbc.insets = new Insets(-200, 900, 10, 10); // Margen exterior
        add(Shanghai, gbc);
        Shanghai.addActionListener(this);

        gbc.insets = new Insets(-320, 880, 10, 10); // Margen exterior
        add(Pekin, gbc);
        Pekin.addActionListener(this);

        gbc.insets = new Insets(-290, 970, 10, 10); // Margen exterior
        add(Seul, gbc);
        Seul.addActionListener(this);

        gbc.insets = new Insets(-230, 1080, 10, 10); // Margen exterior
        add(Tokio, gbc);
        Tokio.addActionListener(this);

        gbc.insets = new Insets(-130, 1075, 10, 10); // Margen exterior
        add(Osaka, gbc);
        Osaka.addActionListener(this);

        gbc.insets = new Insets(-105, 995, 10, 10); // Margen exterior
        add(Taipei, gbc);
        Taipei.addActionListener(this);

        gbc.insets = new Insets(115, 905, 10, 10); // Margen exterior
        add(HoChiMinh, gbc);
        HoChiMinh.addActionListener(this);

        gbc.insets = new Insets(140, 1040, 10, 10); // Margen exterior
        add(Manila, gbc);
        Manila.addActionListener(this);

        gbc.insets = new Insets(440, 1125, 10, 10); // Margen exterior
        add(Sidney, gbc);
        Sidney.addActionListener(this);
        
        gbc.insets = new Insets(-440, -1105, 10, 10); // Margen exterior
        add(DesarrollarCura, gbc);
        DesarrollarCura.addActionListener(this);
        
        gbc.insets = new Insets(-300, -1105, 10, 10); // Margen exterior
        add(CurarCiudad, gbc);
        CurarCiudad.addActionListener(this);
        
        gbc.insets = new Insets(0, -1255, 10, 10); // Margen exterior
        add(CuraAzul, gbc);
        CuraAzul.addActionListener(this);
        
        gbc.insets = new Insets(0, -1155, 10, 10); // Margen exterior
        add(CuraAmarillo, gbc);
        CuraAmarillo.addActionListener(this);
        
        gbc.insets = new Insets(0, -1055, 10, 10); // Margen exterior
        add(CuraNegro, gbc);
        CuraNegro.addActionListener(this);
        
        gbc.insets = new Insets(0, -955, 10, 10); // Margen exterior
        add(CuraRojo, gbc);
        CuraRojo.addActionListener(this);
        
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
    

    private int CantidadVirus(String nombreciudad) {
		
    	String[] Ciudades = {"SanFrancisco", "Chicago", "Atlanta", "Montreal", "NuevaYork", "Washington", "Londres", "Madrid", "Paris", "Essen", "Milan", "SanPetersburgo",
    			"LosAngeles", "Miami", "Mexico", "Bogota", "Lima", "Santiago", "BuenosAires", "SaoPaulo", "Lagos", "Kinsasa", "Jartum", "Johannesburgo", "Argel", "Cairo", "Riad", "Estambul",
    			"Bagdad", "Moscu", "Teheran", "Karachi", "Bombay", "NuevaDelhi", "Calcuta", "Madras", "Yakarta", "Bangkok", "HongKong", "Shanghai", "Pekin", "Seul", "Tokio", "Osaka", "Taipei",
    			"HoChiMinh", "Manila", "Sidney"};
    	
		 //Facil: 1 de 3, 2 de 2, 3 de 1
		 //Normal 2 de 3, 4 de 2, 6 de 1
		 //Dificil 4 de 4, 6 de 2, 10 de 1
		 
		 if(PantallaDificultad.Dificultad == 1) {
			 
			 if(nombreciudad == Ciudades[arrayRandom1[0]]) {
				 return 3;
			 }
			 if(nombreciudad == Ciudades[arrayRandom1[1]] || nombreciudad == Ciudades[arrayRandom1[2]]) {
				 return 2;
			 }
			 if(nombreciudad == Ciudades[arrayRandom1[3]] || nombreciudad == Ciudades[arrayRandom1[4]] || nombreciudad == Ciudades[arrayRandom1[5]]) {
				 return 1;
			 }else {
				 return 0;
			 }
		    
		 	}else if (PantallaDificultad.Dificultad == 2) {
		 		
		 		if(nombreciudad == Ciudades[arrayRandom2[0]] || nombreciudad == Ciudades[arrayRandom2[1]]) {
					 return 3;
				 }
				 if(nombreciudad == Ciudades[arrayRandom2[2]] || nombreciudad == Ciudades[arrayRandom2[3]] || nombreciudad == Ciudades[arrayRandom2[4]] || nombreciudad == Ciudades[arrayRandom2[5]]) {
					 return 2;
				 }
				 if(nombreciudad == Ciudades[arrayRandom2[6]] || nombreciudad == Ciudades[arrayRandom2[7]] || nombreciudad == Ciudades[arrayRandom2[8]] || nombreciudad == Ciudades[arrayRandom2[9]] || nombreciudad == Ciudades[arrayRandom2[10]] || nombreciudad == Ciudades[arrayRandom2[11]]) {
					 return 1;
				 }else {
					 return 0;
				 }
		    	
		    }else if (PantallaDificultad.Dificultad == 3) {
		    	if(nombreciudad == Ciudades[arrayRandom3[0]] || nombreciudad == Ciudades[arrayRandom3[1]] || nombreciudad == Ciudades[arrayRandom3[2]] || nombreciudad == Ciudades[arrayRandom3[3]]) {
					 return 3;
				 }
				 if(nombreciudad == Ciudades[arrayRandom3[4]] || nombreciudad == Ciudades[arrayRandom3[5]] || nombreciudad == Ciudades[arrayRandom3[6]] || nombreciudad == Ciudades[arrayRandom3[7]] || nombreciudad == Ciudades[arrayRandom3[8]] || nombreciudad == Ciudades[arrayRandom3[9]]) {
					 return 2;
				 }
				 if(nombreciudad == Ciudades[arrayRandom3[10]] || nombreciudad == Ciudades[arrayRandom3[11]] || nombreciudad == Ciudades[arrayRandom3[12]] || nombreciudad == Ciudades[arrayRandom3[13]] || nombreciudad == Ciudades[arrayRandom3[14]] || nombreciudad == Ciudades[arrayRandom3[15]] || nombreciudad == Ciudades[arrayRandom3[16]] || nombreciudad == Ciudades[arrayRandom3[17]] || nombreciudad == Ciudades[arrayRandom3[18]] || nombreciudad == Ciudades[arrayRandom3[19]]) {
					 return 1;
				 }else {
					 return 0;
				 }
		    }
		return 0;
	}

	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagenDeFondo, 0, 0, getWidth(), getHeight(), this);
    }

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

    public void obtenerVirusActivo(String virusActivo) {
    	
    	if(PantallaDificultad.Dificultad == 1) {
    		if (AzulLabel.isVisible() && virusActivo.equals("Azul") && PantallaPartida.PorcentajeDesarrolloAzul <100) {
    		PantallaPartida.PorcentajeDesarrolloAzul = PantallaPartida.PorcentajeDesarrolloAzul + 25;
    		AzulLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Desarrollo Vacuna = "+PorcentajeDesarrolloAzul+" %</div></html>");
    	} else if (NegroLabel.isVisible() && virusActivo.equals("Negro") && PantallaPartida.PorcentajeDesarrolloNegro <100) {
    		PantallaPartida.PorcentajeDesarrolloNegro = PantallaPartida.PorcentajeDesarrolloNegro + 25;
    		NegroLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Desarrollo Vacuna = "+PorcentajeDesarrolloNegro+" %</div></html>");
    	} else if (AmarilloLabel.isVisible() && virusActivo.equals("Amarillo") && PantallaPartida.PorcentajeDesarrolloAmarillo < 100) {
    	    PantallaPartida.PorcentajeDesarrolloAmarillo = PantallaPartida.PorcentajeDesarrolloAmarillo + 25;
    	    AmarilloLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Desarrollo Vacuna = "+PantallaPartida.PorcentajeDesarrolloAmarillo+" %</div></html>");
    	} else if (RojoLabel.isVisible() && virusActivo.equals("Rojo") && PantallaPartida.PorcentajeDesarrolloRojo < 100) {
    	    PantallaPartida.PorcentajeDesarrolloRojo = PantallaPartida.PorcentajeDesarrolloRojo + 25;
    	    RojoLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Desarrollo Vacuna = "+PantallaPartida.PorcentajeDesarrolloRojo+" %</div></html>");
    	}
    	}else if(PantallaDificultad.Dificultad == 2) {
    		if (AzulLabel.isVisible() && virusActivo.equals("Azul") && PantallaPartida.PorcentajeDesarrolloAzul <100) {
    		PantallaPartida.PorcentajeDesarrolloAzul = PantallaPartida.PorcentajeDesarrolloAzul + 20;
    		AzulLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Desarrollo Vacuna = "+PorcentajeDesarrolloAzul+" %</div></html>");
    	} else if (NegroLabel.isVisible() && virusActivo.equals("Negro") && PantallaPartida.PorcentajeDesarrolloNegro <100) {
    		PantallaPartida.PorcentajeDesarrolloNegro = PantallaPartida.PorcentajeDesarrolloNegro + 20;
    		NegroLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Desarrollo Vacuna = "+PorcentajeDesarrolloNegro+" %</div></html>");
    	} else if (AmarilloLabel.isVisible() && virusActivo.equals("Amarillo") && PantallaPartida.PorcentajeDesarrolloAmarillo < 100) {
    	    PantallaPartida.PorcentajeDesarrolloAmarillo = PantallaPartida.PorcentajeDesarrolloAmarillo + 20;
    	    AmarilloLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Desarrollo Vacuna = "+PantallaPartida.PorcentajeDesarrolloAmarillo+" %</div></html>");
    	} else if (RojoLabel.isVisible() && virusActivo.equals("Rojo") && PantallaPartida.PorcentajeDesarrolloRojo < 100) {
    	    PantallaPartida.PorcentajeDesarrolloRojo = PantallaPartida.PorcentajeDesarrolloRojo + 20;
    	    RojoLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Desarrollo Vacuna = "+PantallaPartida.PorcentajeDesarrolloRojo+" %</div></html>");
    	} 
    	}else if(PantallaDificultad.Dificultad == 3) {
    		if (AzulLabel.isVisible() && virusActivo.equals("Azul") && PantallaPartida.PorcentajeDesarrolloAzul <100) {
    		PantallaPartida.PorcentajeDesarrolloAzul = PantallaPartida.PorcentajeDesarrolloAzul + 10;
    		AzulLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Desarrollo Vacuna = "+PorcentajeDesarrolloAzul+" %</div></html>");
    	} else if (NegroLabel.isVisible() && virusActivo.equals("Negro") && PantallaPartida.PorcentajeDesarrolloNegro <100) {
    		PantallaPartida.PorcentajeDesarrolloNegro = PantallaPartida.PorcentajeDesarrolloNegro + 10;
    		NegroLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Desarrollo Vacuna = "+PorcentajeDesarrolloNegro+" %</div></html>");
    	} else if (AmarilloLabel.isVisible() && virusActivo.equals("Amarillo") && PantallaPartida.PorcentajeDesarrolloAmarillo < 100) {
    	    PantallaPartida.PorcentajeDesarrolloAmarillo = PantallaPartida.PorcentajeDesarrolloAmarillo + 10;
    	    AmarilloLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Desarrollo Vacuna = "+PantallaPartida.PorcentajeDesarrolloAmarillo+" %</div></html>");
    	} else if (RojoLabel.isVisible() && virusActivo.equals("Rojo") && PantallaPartida.PorcentajeDesarrolloRojo < 100) {
    	    PantallaPartida.PorcentajeDesarrolloRojo = PantallaPartida.PorcentajeDesarrolloRojo + 10;
    	    RojoLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Desarrollo Vacuna = "+PantallaPartida.PorcentajeDesarrolloRojo+" %</div></html>");
    	}
    	}
    	
    	
    }
    
    public void obtenerCiudadActiva(String ciudadActiva) {
    	
        if (SanFranciscoLabel.isVisible() && ciudadActiva.equals("SanFrancisco") && PantallaPartida.VirusSanFrancisco >= 1) {
            PantallaPartida.VirusSanFrancisco--;
            SanFranciscoLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusSanFrancisco+"</div></html>");
        } else if (ChicagoLabel.isVisible() && ciudadActiva.equals("Chicago") && PantallaPartida.VirusChicago >= 1) {
        	PantallaPartida.VirusChicago--;
        	ChicagoLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+VirusChicago+"</div></html>");
        } else if (AtlantaLabel.isVisible() && ciudadActiva.equals("Atlanta") && PantallaPartida.VirusAtlanta >= 1) {
            PantallaPartida.VirusAtlanta--;
            AtlantaLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusAtlanta+"</div></html>");
        } else if (MontrealLabel.isVisible() && ciudadActiva.equals("Montreal") && PantallaPartida.VirusMontreal >= 1) {
            PantallaPartida.VirusMontreal--;
            MontrealLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusMontreal+"</div></html>");
        } else if (NuevaYorkLabel.isVisible() && ciudadActiva.equals("NuevaYork") && PantallaPartida.VirusNuevaYork >= 1) {
            PantallaPartida.VirusNuevaYork--;
            NuevaYorkLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusNuevaYork+"</div></html>");
        } else if (WashingtonLabel.isVisible() && ciudadActiva.equals("Washington") && PantallaPartida.VirusWashington >= 1) {
            PantallaPartida.VirusWashington--;
            WashingtonLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusWashington+"</div></html>");
        } else if (LondresLabel.isVisible() && ciudadActiva.equals("Londres") && PantallaPartida.VirusLondres >= 1) {
            PantallaPartida.VirusLondres--;
            LondresLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusLondres+"</div></html>");
        } else if (MadridLabel.isVisible() && ciudadActiva.equals("Madrid") && PantallaPartida.VirusMadrid >= 1) {
            PantallaPartida.VirusMadrid--;
            MadridLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusMadrid+"</div></html>");
        } else if (ParisLabel.isVisible() && ciudadActiva.equals("Paris") && PantallaPartida.VirusParis >= 1) {
            PantallaPartida.VirusParis--;
            ParisLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusParis+"</div></html>");
        } else if (EssenLabel.isVisible() && ciudadActiva.equals("Essen") && PantallaPartida.VirusEssen >= 1) {
            PantallaPartida.VirusEssen--;
            EssenLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusEssen+"</div></html>");
        } else if (MilanLabel.isVisible() && ciudadActiva.equals("Milan") && PantallaPartida.VirusMilan >= 1) {
            PantallaPartida.VirusMilan--;
            MilanLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusMilan+"</div></html>");
        } else if (SanPetersburgoLabel.isVisible() && ciudadActiva.equals("SanPetersburgo") && PantallaPartida.VirusSanPetersburgo >= 1) {
            PantallaPartida.VirusSanPetersburgo--;
            SanPetersburgoLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusSanPetersburgo+"</div></html>");
        } else if (LosAngelesLabel.isVisible() && ciudadActiva.equals("LosAngeles") && PantallaPartida.VirusLosAngeles >= 1) {
            PantallaPartida.VirusLosAngeles--;
            LosAngelesLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusLosAngeles+"</div></html>");
        } else if (MiamiLabel.isVisible() && ciudadActiva.equals("Miami") && PantallaPartida.VirusMiami >= 1) {
            PantallaPartida.VirusMiami--;
            MiamiLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusMiami+"</div></html>");
        } else if (MexicoLabel.isVisible() && ciudadActiva.equals("Mexico") && PantallaPartida.VirusMexico >= 1) {
            PantallaPartida.VirusMexico--;
            MexicoLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusMexico+"</div></html>");
        } else if (BogotaLabel.isVisible() && ciudadActiva.equals("Bogota") && PantallaPartida.VirusBogota >= 1) {
            PantallaPartida.VirusBogota--;
            BogotaLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusBogota+"</div></html>");
        } else if (LimaLabel.isVisible() && ciudadActiva.equals("Lima") && PantallaPartida.VirusLima >= 1) {
            PantallaPartida.VirusLima--;
            LimaLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusLima+"</div></html>");
        } else if (SantiagoLabel.isVisible() && ciudadActiva.equals("Santiago") && PantallaPartida.VirusSantiago >= 1) {
            PantallaPartida.VirusSantiago--;
            SantiagoLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusSantiago+"</div></html>");
        } else if (BuenosAiresLabel.isVisible() && ciudadActiva.equals("BuenosAires") && PantallaPartida.VirusBuenosAires >= 1) {
            PantallaPartida.VirusBuenosAires--;
            BuenosAiresLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusBuenosAires+"</div></html>");
        } else if (SaoPauloLabel.isVisible() && ciudadActiva.equals("SaoPaulo") && PantallaPartida.VirusSaoPaulo >= 1) {
            PantallaPartida.VirusSaoPaulo--;
            SaoPauloLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusSaoPaulo+"</div></html>");
        } else if (LagosLabel.isVisible() && ciudadActiva.equals("Lagos") && PantallaPartida.VirusLagos >= 1) {
            PantallaPartida.VirusLagos--;
            LagosLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusLagos+"</div></html>");
        } else if (KinsasaLabel.isVisible() && ciudadActiva.equals("Kinsasa") && PantallaPartida.VirusKinsasa >= 1) {
            PantallaPartida.VirusKinsasa--;
            KinsasaLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusKinsasa+"</div></html>");
        } else if (JartumLabel.isVisible() && ciudadActiva.equals("Jartum") && PantallaPartida.VirusJartum >= 1) {
            PantallaPartida.VirusJartum--;
            JartumLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusJartum+"</div></html>");
        } else if (JohannesburgoLabel.isVisible() && ciudadActiva.equals("Johannesburgo") && PantallaPartida.VirusJohannesburgo >= 1) {
            PantallaPartida.VirusJohannesburgo--;
            JohannesburgoLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusJohannesburgo+"</div></html>");
        } else if (ArgelLabel.isVisible() && ciudadActiva.equals("Argel") && PantallaPartida.VirusArgel >= 1) {
            PantallaPartida.VirusArgel--;
            ArgelLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusArgel+"</div></html>");
        } else if (CairoLabel.isVisible() && ciudadActiva.equals("Cairo") && PantallaPartida.VirusCairo >= 1) {
            PantallaPartida.VirusCairo--;
            CairoLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusCairo+"</div></html>");
        } else if (RiadLabel.isVisible() && ciudadActiva.equals("Riad") && PantallaPartida.VirusRiad >= 1) {
            PantallaPartida.VirusRiad--;
            RiadLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusRiad+"</div></html>");
        } else if (EstambulLabel.isVisible() && ciudadActiva.equals("Estambul") && PantallaPartida.VirusEstambul >= 1) {
            PantallaPartida.VirusEstambul--;
            EstambulLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusEstambul+"</div></html>");
        } else if (BagdadLabel.isVisible() && ciudadActiva.equals("Bagdad") && PantallaPartida.VirusBagdad >= 1) {
            PantallaPartida.VirusBagdad--;
            BagdadLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusBagdad+"</div></html>");
        } else if (MoscuLabel.isVisible() && ciudadActiva.equals("Moscu") && PantallaPartida.VirusMoscu >= 1) {
            PantallaPartida.VirusMoscu--;
            MoscuLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusMoscu+"</div></html>");
        } else if (TeheranLabel.isVisible() && ciudadActiva.equals("Teheran") && PantallaPartida.VirusTeheran >= 1) {
            PantallaPartida.VirusTeheran--;
            TeheranLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusTeheran+"</div></html>");
        } else if (KarachiLabel.isVisible() && ciudadActiva.equals("Karachi") && PantallaPartida.VirusKarachi >= 1) {
            PantallaPartida.VirusKarachi--;
            KarachiLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusKarachi+"</div></html>");
        } else if (BombayLabel.isVisible() && ciudadActiva.equals("Bombay") && PantallaPartida.VirusBombay >= 1) {
            PantallaPartida.VirusBombay--;
            BombayLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusBombay+"</div></html>");
        } else if (NuevaDelhiLabel.isVisible() && ciudadActiva.equals("NuevaDelhi") && PantallaPartida.VirusNuevaDelhi >= 1) {
            PantallaPartida.VirusNuevaDelhi--;
            NuevaDelhiLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusNuevaDelhi+"</div></html>");
        } else if (CalcutaLabel.isVisible() && ciudadActiva.equals("Calcuta") && PantallaPartida.VirusCalcuta >= 1) {
            PantallaPartida.VirusCalcuta--;
            CalcutaLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusCalcuta+"</div></html>");
        } else if (MadrasLabel.isVisible() && ciudadActiva.equals("Madras") && PantallaPartida.VirusMadras >= 1) {
            PantallaPartida.VirusMadras--;
            MadrasLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusMadras+"</div></html>");
        } else if (YakartaLabel.isVisible() && ciudadActiva.equals("Yakarta") && PantallaPartida.VirusYakarta >= 1) {
            PantallaPartida.VirusYakarta--;
            YakartaLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusYakarta+"</div></html>");
        } else if (BangkokLabel.isVisible() && ciudadActiva.equals("Bangkok") && PantallaPartida.VirusBangkok >= 1) {
            PantallaPartida.VirusBangkok--;
            BangkokLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusBangkok+"</div></html>");
        } else if (HongKongLabel.isVisible() && ciudadActiva.equals("HongKong") && PantallaPartida.VirusHongKong >= 1) {
            PantallaPartida.VirusHongKong--;
            HongKongLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusHongKong+"</div></html>");
        } else if (ShanghaiLabel.isVisible() && ciudadActiva.equals("Shanghai") && PantallaPartida.VirusShanghai >= 1) {
            PantallaPartida.VirusShanghai--;
            ShanghaiLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusShanghai+"</div></html>");
        } else if (PekinLabel.isVisible() && ciudadActiva.equals("Pekin") && PantallaPartida.VirusPekin >= 1) {
            PantallaPartida.VirusPekin--;
            PekinLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusPekin+"</div></html>");
        } else if (SeulLabel.isVisible() && ciudadActiva.equals("Seul") && PantallaPartida.VirusSeul >= 1) {
            PantallaPartida.VirusSeul--;
            SeulLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusSeul+"</div></html>");
        } else if (TokioLabel.isVisible() && ciudadActiva.equals("Tokio") && PantallaPartida.VirusTokio >= 1) {
            PantallaPartida.VirusTokio--;
            TokioLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusTokio+"</div></html>");
        } else if (OsakaLabel.isVisible() && ciudadActiva.equals("Osaka") && PantallaPartida.VirusOsaka >= 1) {
            PantallaPartida.VirusOsaka--;
            OsakaLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusOsaka+"</div></html>");
        } else if (TaipeiLabel.isVisible() && ciudadActiva.equals("Taipei") && PantallaPartida.VirusTaipei >= 1) {
            PantallaPartida.VirusTaipei--;
            TaipeiLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusTaipei+"</div></html>");
        } else if (HoChiMinhLabel.isVisible() && ciudadActiva.equals("HoChiMinh") && PantallaPartida.VirusHoChiMinh >= 1) {
            PantallaPartida.VirusHoChiMinh--;
            HoChiMinhLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusHoChiMinh+"</div></html>");
        } else if (ManilaLabel.isVisible() && ciudadActiva.equals("Manila") && PantallaPartida.VirusManila >= 1) {
            PantallaPartida.VirusManila--;
            ManilaLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusManila+"</div></html>");
        } else if (SidneyLabel.isVisible() && ciudadActiva.equals("Sidney") && PantallaPartida.VirusSidney >= 1) {
            PantallaPartida.VirusSidney--;
            SidneyLabel.setText("<html><br><br><br><br><br><br><br><br><br><div>Cantidad Virus = "+PantallaPartida.VirusSidney+"</div></html>");
        }
    }
    
    public void mostrarEtiqueta(JLabel etiqueta) {
    	String rutaImagenBoton;
        rutaImagenBoton = "src/img/CiudadAzul.png";
        SanFranciscoLabel.setVisible(false);
        SanFrancisco.setIcon(new ImageIcon(rutaImagenBoton));
        ChicagoLabel.setVisible(false);
        Chicago.setIcon(new ImageIcon(rutaImagenBoton));
        AtlantaLabel.setVisible(false);
        Atlanta.setIcon(new ImageIcon(rutaImagenBoton));
        MontrealLabel.setVisible(false);
        Montreal.setIcon(new ImageIcon(rutaImagenBoton));
        NuevaYorkLabel.setVisible(false);
        NuevaYork.setIcon(new ImageIcon(rutaImagenBoton));
        WashingtonLabel.setVisible(false);
        Washington.setIcon(new ImageIcon(rutaImagenBoton));
        LondresLabel.setVisible(false);
        Londres.setIcon(new ImageIcon(rutaImagenBoton));
        MadridLabel.setVisible(false);
        Madrid.setIcon(new ImageIcon(rutaImagenBoton));
        ParisLabel.setVisible(false);
        Paris.setIcon(new ImageIcon(rutaImagenBoton));
        EssenLabel.setVisible(false);
        Essen.setIcon(new ImageIcon(rutaImagenBoton));
        MilanLabel.setVisible(false);
        Milan.setIcon(new ImageIcon(rutaImagenBoton));
        SanPetersburgoLabel.setVisible(false);
        SanPetersburgo.setIcon(new ImageIcon(rutaImagenBoton));
        rutaImagenBoton = "src/img/CiudadAmarillo.png";
        LosAngelesLabel.setVisible(false);
        LosAngeles.setIcon(new ImageIcon(rutaImagenBoton));
        MiamiLabel.setVisible(false);
        Miami.setIcon(new ImageIcon(rutaImagenBoton));
        MexicoLabel.setVisible(false);
        Mexico.setIcon(new ImageIcon(rutaImagenBoton));
        BogotaLabel.setVisible(false);
        Bogota.setIcon(new ImageIcon(rutaImagenBoton));
        LimaLabel.setVisible(false);
        Lima.setIcon(new ImageIcon(rutaImagenBoton));
        SantiagoLabel.setVisible(false);
        Santiago.setIcon(new ImageIcon(rutaImagenBoton));
        BuenosAiresLabel.setVisible(false);
        BuenosAires.setIcon(new ImageIcon(rutaImagenBoton));
        SaoPauloLabel.setVisible(false);
        SaoPaulo.setIcon(new ImageIcon(rutaImagenBoton));
        LagosLabel.setVisible(false);
        Lagos.setIcon(new ImageIcon(rutaImagenBoton));
        KinsasaLabel.setVisible(false);
        Kinsasa.setIcon(new ImageIcon(rutaImagenBoton));
        JartumLabel.setVisible(false);
        Jartum.setIcon(new ImageIcon(rutaImagenBoton));
        JohannesburgoLabel.setVisible(false);
        Johannesburgo.setIcon(new ImageIcon(rutaImagenBoton));
        rutaImagenBoton = "src/img/CiudadNegro.png";
        ArgelLabel.setVisible(false);
        Argel.setIcon(new ImageIcon(rutaImagenBoton));
        CairoLabel.setVisible(false);
        Cairo.setIcon(new ImageIcon(rutaImagenBoton));
        RiadLabel.setVisible(false);
        Riad.setIcon(new ImageIcon(rutaImagenBoton));
        EstambulLabel.setVisible(false);
        Estambul.setIcon(new ImageIcon(rutaImagenBoton));
        BagdadLabel.setVisible(false);
        Bagdad.setIcon(new ImageIcon(rutaImagenBoton));
        MoscuLabel.setVisible(false);
        Moscu.setIcon(new ImageIcon(rutaImagenBoton));
        TeheranLabel.setVisible(false);
        Teheran.setIcon(new ImageIcon(rutaImagenBoton));
        KarachiLabel.setVisible(false);
        Karachi.setIcon(new ImageIcon(rutaImagenBoton));
        BombayLabel.setVisible(false);
        Bombay.setIcon(new ImageIcon(rutaImagenBoton));
        NuevaDelhiLabel.setVisible(false);
        NuevaDelhi.setIcon(new ImageIcon(rutaImagenBoton));
        CalcutaLabel.setVisible(false);
        Calcuta.setIcon(new ImageIcon(rutaImagenBoton));
        MadrasLabel.setVisible(false);
        Madras.setIcon(new ImageIcon(rutaImagenBoton));
        rutaImagenBoton = "src/img/CiudadRojo.png";
        YakartaLabel.setVisible(false);
        Yakarta.setIcon(new ImageIcon(rutaImagenBoton));
        BangkokLabel.setVisible(false);
        Bangkok.setIcon(new ImageIcon(rutaImagenBoton));
        HongKongLabel.setVisible(false);
        HongKong.setIcon(new ImageIcon(rutaImagenBoton));
        ShanghaiLabel.setVisible(false);
        Shanghai.setIcon(new ImageIcon(rutaImagenBoton));
        PekinLabel.setVisible(false);
        Pekin.setIcon(new ImageIcon(rutaImagenBoton));
        SeulLabel.setVisible(false);
        Seul.setIcon(new ImageIcon(rutaImagenBoton));
        TokioLabel.setVisible(false);
        Tokio.setIcon(new ImageIcon(rutaImagenBoton));
        OsakaLabel.setVisible(false);
        Osaka.setIcon(new ImageIcon(rutaImagenBoton));
        TaipeiLabel.setVisible(false);
        Taipei.setIcon(new ImageIcon(rutaImagenBoton));
        HoChiMinhLabel.setVisible(false);
        HoChiMinh.setIcon(new ImageIcon(rutaImagenBoton));
        ManilaLabel.setVisible(false);
        Manila.setIcon(new ImageIcon(rutaImagenBoton));
        SidneyLabel.setVisible(false);
        Sidney.setIcon(new ImageIcon(rutaImagenBoton));

        AzulLabel.setVisible(false);
        NegroLabel.setVisible(false);
        AmarilloLabel.setVisible(false);
        RojoLabel.setVisible(false);
        
        etiqueta.setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
    	String rutaImagenBoton;
        rutaImagenBoton = "src/img/CiudadBlanco.png";
        if (e.getSource() == SanFrancisco) {
            mostrarEtiqueta(SanFranciscoLabel);
            SanFrancisco.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Chicago) {
            mostrarEtiqueta(ChicagoLabel);
            Chicago.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Atlanta) {
            mostrarEtiqueta(AtlantaLabel);
            Atlanta.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Montreal) {
            mostrarEtiqueta(MontrealLabel);
            Montreal.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == NuevaYork) {
            mostrarEtiqueta(NuevaYorkLabel);
            NuevaYork.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Washington) {
            mostrarEtiqueta(WashingtonLabel);
            Washington.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Londres) {
            mostrarEtiqueta(LondresLabel);
            Londres.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Madrid) {
            mostrarEtiqueta(MadridLabel);
            Madrid.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Paris) {
            mostrarEtiqueta(ParisLabel);
            Paris.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Essen) {
            mostrarEtiqueta(EssenLabel);
            Essen.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Milan) {
            mostrarEtiqueta(MilanLabel);
            Milan.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == SanPetersburgo) {
            mostrarEtiqueta(SanPetersburgoLabel);
            SanPetersburgo.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == LosAngeles) {
            mostrarEtiqueta(LosAngelesLabel);
            LosAngeles.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Miami) {
            mostrarEtiqueta(MiamiLabel);
            Miami.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Mexico) {
            mostrarEtiqueta(MexicoLabel);
            Mexico.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Bogota) {
            mostrarEtiqueta(BogotaLabel);
            Bogota.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Lima) {
            mostrarEtiqueta(LimaLabel);
            Lima.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Santiago) {
            mostrarEtiqueta(SantiagoLabel);
            Santiago.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == BuenosAires) {
            mostrarEtiqueta(BuenosAiresLabel);
            BuenosAires.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == SaoPaulo) {
            mostrarEtiqueta(SaoPauloLabel);
            SaoPaulo.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Lagos) {
            mostrarEtiqueta(LagosLabel);
            Lagos.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Kinsasa) {
            mostrarEtiqueta(KinsasaLabel);
            Kinsasa.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Jartum) {
            mostrarEtiqueta(JartumLabel);
            Jartum.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Johannesburgo) {
            mostrarEtiqueta(JohannesburgoLabel);
            Johannesburgo.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Argel) {
            mostrarEtiqueta(ArgelLabel);
            Argel.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Cairo) {
            mostrarEtiqueta(CairoLabel);
            Cairo.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Riad) {
            mostrarEtiqueta(RiadLabel);
            Riad.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Estambul) {
            mostrarEtiqueta(EstambulLabel);
            Estambul.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Bagdad) {
            mostrarEtiqueta(BagdadLabel);
            Bagdad.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Moscu) {
            mostrarEtiqueta(MoscuLabel);
            Moscu.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Teheran) {
            mostrarEtiqueta(TeheranLabel);
            Teheran.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Karachi) {
            mostrarEtiqueta(KarachiLabel);
            Karachi.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Bombay) {
            mostrarEtiqueta(BombayLabel);
            Bombay.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == NuevaDelhi) {
            mostrarEtiqueta(NuevaDelhiLabel);
            NuevaDelhi.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Calcuta) {
            mostrarEtiqueta(CalcutaLabel);
            Calcuta.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Madras) {
            mostrarEtiqueta(MadrasLabel);
            Madras.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Yakarta) {
            mostrarEtiqueta(YakartaLabel);
            Yakarta.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Bangkok) {
            mostrarEtiqueta(BangkokLabel);
            Bangkok.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == HongKong) {
            mostrarEtiqueta(HongKongLabel);
            HongKong.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Shanghai) {
            mostrarEtiqueta(ShanghaiLabel);
            Shanghai.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Pekin) {
            mostrarEtiqueta(PekinLabel);
            Pekin.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Seul) {
            mostrarEtiqueta(SeulLabel);
            Seul.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Tokio) {
            mostrarEtiqueta(TokioLabel);
            Tokio.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Osaka) {
            mostrarEtiqueta(OsakaLabel);
            Osaka.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Taipei) {
            mostrarEtiqueta(TaipeiLabel);
            Taipei.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == HoChiMinh) {
            mostrarEtiqueta(HoChiMinhLabel);
            HoChiMinh.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Manila) {
            mostrarEtiqueta(ManilaLabel);
            Manila.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == Sidney) {
            mostrarEtiqueta(SidneyLabel);
            Sidney.setIcon(new ImageIcon(rutaImagenBoton));
        } else if (e.getSource() == CuraAzul) {
            mostrarEtiqueta(AzulLabel);
        } else if (e.getSource() == CuraNegro) {
            mostrarEtiqueta(NegroLabel);
        } else if (e.getSource() == CuraAmarillo) {
            mostrarEtiqueta(AmarilloLabel);
        } else if (e.getSource() == CuraRojo) {
            mostrarEtiqueta(RojoLabel);
        }
        if(e.getSource() == CurarCiudad) {
        	 if (Intentos >= 1) {
                         String[] ciudades = {"SanFrancisco", "Chicago", "Atlanta", "Montreal", "NuevaYork", "Washington", "Londres", "Madrid", "Paris", "Essen", "Milan", "SanPetersburgo",
                                 "LosAngeles", "Miami", "Mexico", "Bogota", "Lima", "Santiago", "BuenosAires", "SaoPaulo", "Lagos", "Kinsasa", "Jartum", "Johannesburgo", "Argel", "Cairo", "Riad", "Estambul",
                                 "Bagdad", "Moscu", "Teheran", "Karachi", "Bombay", "NuevaDelhi", "Calcuta", "Madras", "Yakarta", "Bangkok", "HongKong", "Shanghai", "Pekin", "Seul", "Tokio", "Osaka", "Taipei",
                                 "HoChiMinh", "Manila", "Sidney"};

                         for (String ciudad : ciudades) {
                             obtenerCiudadActiva(ciudad);
                                 
                                 }
                             }
         }
        if(e.getSource() == DesarrollarCura) {
        	if(Intentos >= 1) {
        		String[] virus = {"Negro", "Amarillo", "Rojo", "Azul"};
        		
        		for(String cura : virus) {
        			obtenerVirusActivo(cura);
        		}
        	}
        }
    }
}