/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capacitacion.views;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jose Luis Tapia
 */
public class Ventana extends JFrame{
    
     public Ventana() {
        setTitle("JFrame con Imagen de Fondo");
        setSize(600, 400); // Tamaño del JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana

        // Crear un JPanel con imagen de fondo
        JPanel panelConFondo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar y dibujar la imagen de fondo
                ImageIcon imagen = new ImageIcon("C:\\Fichas_Medicas\\img\\crear.jpeg");
                g.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };

        panelConFondo.setLayout(null); // Layout nulo para posicionar componentes libremente

        // Crear componentes (botón, caja de texto, labels)
        JLabel label = new JLabel("Nombre:");
        label.setBounds(50, 50, 100, 30); // x, y, ancho, alto

        JTextField texto = new JTextField();
        texto.setBounds(150, 50, 200, 30);

        JButton boton = new JButton("Enviar");
        boton.setBounds(150, 100, 100, 30);

        // Añadir componentes al panel
        panelConFondo.add(label);
        panelConFondo.add(texto);
        panelConFondo.add(boton);

        // Añadir el panel al JFrame
        add(panelConFondo);

        setVisible(true); // Hacer visible el JFrame
    }

    public static void main(String[] args) {
        new Ventana();
    }

    
}
