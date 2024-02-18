package forms;

import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class Principal extends JDialog {
    private JPanel contentPane;
    private JButton btnGenerate;
    private JButton btnExit;
    private JTextArea txtMsg;
    private JLabel lblTitle;
    private String[] mensajes = {
            "El éxito es la suma de pequeños esfuerzos repetidos día tras día.",
            "Cree en ti mismo y todo será posible.",
            "El único camino hacia adelante es a través de tus propios pasos.",
            "La perseverancia es la clave del éxito.",
            "Cada desafío es una oportunidad para crecer y aprender.",
            "Las mejores vistas siempre llegan después de las subidas más difíciles.",
            "Nunca subestimes el poder de tus sueños.",
            "El cambio comienza con una sola decisión.",
            "Confía en el proceso, incluso cuando no entiendas el camino.",
            "Haz hoy lo que otros no quieren para tener mañana lo que otros no pueden.",
            "Las oportunidades no suelen caer del cielo; hay que salir a buscarlas.",
            "La felicidad no es el destino, es el camino.",
            "Cada pequeño paso te acerca más a tus grandes sueños.",
            "El éxito no es definitivo, el fracaso no es fatal: lo que cuenta es el coraje para continuar.",
            "Tu actitud determina tu dirección.",
            "La verdadera fuerza proviene de levantarse cada vez que caes.",
            "Sé la razón por la que alguien cree en la bondad del mundo.",
            "El optimismo es la fe que conduce al logro.",
            "Los obstáculos son simplemente oportunidades disfrazadas.",
            "No hay límites para lo que puedes lograr cuando crees en ti mismo."
    };

    public Principal() {
        setSize(400, 300);
        setLocationRelativeTo(null);// Centrar el formulario en la pantalla
        setContentPane(contentPane);
        setModal(true);

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        btnGenerate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                msgGenerate();
            }
        });
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exit();
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                exit();
            }
        });
    }
    private void msgGenerate() {
        Random rand = new Random();
        int i = rand.nextInt(mensajes.length);
        String mensaje= mensajes[i];
        txtMsg.setText(mensaje);
    }

    private void exit() {
        dispose();
    }
}
