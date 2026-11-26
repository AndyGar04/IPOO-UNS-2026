import java.awt.*;
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.border.*;

class Dos_Botones_Grilla extends JFrame {
  private MiEtiqueta etiqueta;
  private MiBoton botonPerro, botonGato;
  private JPanel panelControl, panelImagen;
  
  public Dos_Botones_Grilla() {
     setLayout(new GridLayout(1,2));
     setSize(420, 300);
     setDefaultCloseOperation(EXIT_ON_CLOSE);

     armaPanelBotones();
     armaPanelImagen();
	    
     getContentPane().add(panelControl);
     getContentPane().add(panelImagen);	 
  }

  private void armaPanelBotones(){
    panelControl = new JPanel();
    panelControl.setBackground(Color.BLUE);
    botonPerro = new MiBoton("Perro");
    botonGato = new MiBoton("Gato"); 
    
    botonPerro.setPreferredSize(new Dimension(124, 50));
    botonPerro.setSize(150, 50);
    botonPerro.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.GREEN, 3, false),null));
    OyenteBotonP oyentePerro = new OyenteBotonP();
    botonPerro.addActionListener(oyentePerro);
    
    botonGato.setPreferredSize(new Dimension(124, 50));
    botonGato.setSize(150, 50);
    botonGato.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.GREEN, 3, false),null));
    OyenteBotonG oyenteGato = new OyenteBotonG();
    botonGato.addActionListener(oyenteGato); // 2): Estaba creado el oyente, pero faltaba engancharlo al botón
  
    panelControl.add(botonPerro);
    panelControl.add(botonGato);
  }
 
  private void armaPanelImagen(){
    panelImagen = new JPanel();
    etiqueta = new MiEtiqueta();
    etiqueta.setText("Jack"); // 3a): Para que arranque mostrando el nombre "Jack"
    etiqueta.setIcon(new ImageIcon("perro.gif")); // 3b): Para que arranque mostrando la foto del perro
    panelImagen.add(etiqueta);
  }
 
  private class OyenteBotonP implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      etiqueta.setIcon(new ImageIcon("perro.gif"));
      etiqueta.setText("Jack");
    }  
  }

  private class OyenteBotonG implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      etiqueta.setIcon(new ImageIcon("gato.gif"));
      etiqueta.setText("Tom");
    }  
  }
}