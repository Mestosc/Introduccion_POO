package EjemploSwing;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class App extends JFrame {
    private JTextField cadroTexto;

    public App() {
        super();
        setTitle("Primera aplciacion Swing");
        JComponent botonera = creaBotons();
        JComponent panelCadroTexto = crearPanelTexto();
        cadroTexto = (JTextField) panelCadroTexto;
        JSplitPane panelPrincipal = new JSplitPane(JSplitPane.VERTICAL_SPLIT,cadroTexto,botonera);
        getContentPane().add(panelPrincipal);
        pack();
        setVisible(true);
    }
    private JComponent creaBotons() {
        JPanel botonera = new JPanel();
        JButton btn = new JButton("Hola anormal");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cadroTexto.setText("Ola anormales");
            }
        });
        botonera.add(btn);
        return botonera;
    }
    private JComponent crearPanelTexto() {
        JPanel texto = new JPanel();
        JTextField text = new JTextField();
        text.setColumns(5);
        texto.add(text);
        return texto;
    }
}
