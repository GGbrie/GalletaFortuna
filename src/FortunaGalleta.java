import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FortunaGalleta extends JFrame implements ActionListener {
    private JLabel mensajeInicial;
    private JTextArea mensaje;
    private JButton Button14edad;
    private JButton Button18edad;
    private JButton Button25edad;
    private JButton obtenerMensaje;
    private MensajeEdades mensajeEdades;
    public FortunaGalleta() {
        setTitle("Galleta de la Fortuna");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        mensajeInicial = new JLabel("¿Me podrías proporcionar tu edad?");
        mensajeInicial.setForeground(Color.BLUE);
        mensajeInicial.setFont(new Font("Arial", Font.BOLD, 14));
        mensajeInicial.setPreferredSize(new Dimension(250, 50));

        mensaje = new JTextArea();
        mensaje.setForeground(Color.BLACK);
        mensaje.setFont(new Font("Arial", Font.BOLD, 16));
        mensaje.setPreferredSize(new Dimension(600, 200));
        mensaje.setEditable(false);

        Button14edad = new JButton("Tengo Menos de 14 años");
        Button18edad = new JButton("Tengo 18 años");
        Button25edad = new JButton("Tengo Más de 25 años");
        obtenerMensaje = new JButton("Caja de Galletas");

        Button14edad.setBackground(Color.CYAN);
        Button14edad.setFont(new Font("Arial", Font.BOLD, 12));
        Button18edad.setBackground(Color.CYAN);
        Button18edad.setFont(new Font("Arial", Font.BOLD, 12));
        Button25edad.setBackground(Color.CYAN);
        Button25edad.setFont(new Font("Arial", Font.BOLD, 12));
        obtenerMensaje.setBackground(Color.GREEN);
        obtenerMensaje.setFont(new Font("Arial", Font.BOLD, 13));

        Button14edad.addActionListener(this);
        Button18edad.addActionListener(this);
        Button25edad.addActionListener(this);
        obtenerMensaje.addActionListener(this);

        add(mensajeInicial);
        add(Button14edad);
        add(Button18edad);
        add(Button25edad);
        add(mensaje);
        add(obtenerMensaje);

        mensajeEdades = new MensajeEdades();
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Button14edad) {
            String mensaje = mensajeEdades.mensajeEdad14();
            this.mensaje.setText(mensaje);
        } else if (e.getSource() == Button18edad) {
            String mensaje = mensajeEdades.mensajeEdad18();
            this.mensaje.setText(mensaje);
        } else if (e.getSource() == Button25edad) {
            String mensaje = mensajeEdades.mensajeEdad25();
            this.mensaje.setText(mensaje);
        } else if (e.getSource() == obtenerMensaje) {
            String mensaje = mensajeEdades.mensajeAleatorio();
            this.mensaje.setText(mensaje);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FortunaGalleta();
            }
        });
    }
}
