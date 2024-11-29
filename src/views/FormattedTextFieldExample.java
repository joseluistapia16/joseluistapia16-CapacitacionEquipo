/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

/**
 *
 * @author Usuario
 */
import javax.swing.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;

public class FormattedTextFieldExample extends JFrame {

    private JTextField valor;

    public FormattedTextFieldExample() {
        // Configurar ventana
        setTitle("Formatted JTextField");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Crear JTextField
        valor = new JTextField();
        valor.setBounds(50, 20, 200, 30);
        add(valor);

        // Agregar eventos
        valor.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                char car = evt.getKeyChar();
                // Permitir solo números y un punto para decimales
                if (!Character.isDigit(car) && car != '.') {
                    evt.consume();
                }

                // Solo permitir un punto decimal
                if (car == '.' && valor.getText().contains(".")) {
                    evt.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent evt) {
                SwingUtilities.invokeLater(() -> {
                    String text = valor.getText();
                    if (!text.isEmpty()) {
                        try {
                            // Eliminar comas para parsear correctamente
                            text = text.replace(",", "");
                            double number = Double.parseDouble(text);
                            // Formatear número con comas y decimales
                            NumberFormat format = NumberFormat.getNumberInstance(Locale.US);
                            format.setGroupingUsed(true);
                            format.setMaximumFractionDigits(2);
                            valor.setText(format.format(number));
                        } catch (NumberFormatException e) {
                            valor.setText("");
                        }
                    }
                });
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FormattedTextFieldExample frame = new FormattedTextFieldExample();
            frame.setVisible(true);
        });
    }
}
