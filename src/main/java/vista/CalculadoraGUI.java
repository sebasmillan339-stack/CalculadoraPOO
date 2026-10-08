package vista;

import controlador.Controlador;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculadoraGUI extends JFrame {

    private Controlador controlador = new Controlador();

    private JLabel lblNumero1 = new JLabel("Primer número");
    private JTextField txtNumero1 = new JTextField();
    private JLabel lblNumero2 = new JLabel("Segundo número");
    private JTextField txtNumero2 = new JTextField();
    private JLabel lblResultado = new JLabel("Resultado: ");
    private JButton btnSumar = new JButton("Sumar");
    private JButton btnRestar = new JButton("Restar");
    private JButton btnMultiplicar = new JButton("Multiplicar");
    private JButton btnDividir = new JButton("Dividir");
    private JButton btnRaizCuadrada = new JButton("Raíz cuadrada");
    private JButton btnRaizCubica = new JButton("Raíz cúbica");
    private JButton btnLogaritmo = new JButton("Logaritmo natural");

    public CalculadoraGUI() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Calculadora");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setSize(540, 360);
        setResizable(false);
        setLocationRelativeTo(null);

        lblNumero1.setBounds(20, 15, 200, 20);
        txtNumero1.setBounds(20, 40, 480, 28);
        lblNumero2.setBounds(20, 80, 200, 20);
        txtNumero2.setBounds(20, 105, 480, 28);
        lblResultado.setBounds(20, 255, 480, 40);
        lblResultado.setFont(new java.awt.Font("Segoe UI", 1, 18));

        add(lblNumero1);
        add(txtNumero1);
        add(lblNumero2);
        add(txtNumero2);
        add(lblResultado);

        btnSumar.setBounds(20, 150, 110, 30);
        btnRestar.setBounds(140, 150, 110, 30);
        btnMultiplicar.setBounds(260, 150, 125, 30);
        btnDividir.setBounds(395, 150, 105, 30);
        btnRaizCuadrada.setBounds(20, 195, 145, 30);
        btnRaizCubica.setBounds(175, 195, 135, 30);
        btnLogaritmo.setBounds(320, 195, 180, 30);

        add(btnSumar);
        add(btnRestar);
        add(btnMultiplicar);
        add(btnDividir);
        add(btnRaizCuadrada);
        add(btnRaizCubica);
        add(btnLogaritmo);

        btnSumar.addActionListener(this::btnSumarActionPerformed);
        btnRestar.addActionListener(this::btnRestarActionPerformed);
        btnMultiplicar.addActionListener(this::btnMultiplicarActionPerformed);
        btnDividir.addActionListener(this::btnDividirActionPerformed);
        btnRaizCuadrada.addActionListener(this::btnRaizCuadradaActionPerformed);
        btnRaizCubica.addActionListener(this::btnRaizCubicaActionPerformed);
        btnLogaritmo.addActionListener(this::btnLogaritmoActionPerformed);
    }

    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            double a = Double.parseDouble(txtNumero1.getText());
            double b = Double.parseDouble(txtNumero2.getText());
            double resultado = controlador.sumar(a, b);
            lblResultado.setText("Resultado: " + String.format("%.4f", resultado));
        } catch (NumberFormatException e) {
            mostrarError("Por favor ingrese valores numéricos válidos");
        }
    }

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            double a = Double.parseDouble(txtNumero1.getText());
            double b = Double.parseDouble(txtNumero2.getText());
            double resultado = controlador.restar(a, b);
            lblResultado.setText("Resultado: " + String.format("%.4f", resultado));
        } catch (NumberFormatException e) {
            mostrarError("Por favor ingrese valores numéricos válidos");
        }
    }

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            double a = Double.parseDouble(txtNumero1.getText());
            double b = Double.parseDouble(txtNumero2.getText());
            double resultado = controlador.multiplicar(a, b);
            lblResultado.setText("Resultado: " + String.format("%.4f", resultado));
        } catch (NumberFormatException e) {
            mostrarError("Por favor ingrese valores numéricos válidos");
        }
    }

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            double a = Double.parseDouble(txtNumero1.getText());
            double b = Double.parseDouble(txtNumero2.getText());
            double resultado = controlador.dividir(a, b);
            lblResultado.setText("Resultado: " + String.format("%.4f", resultado));
        } catch (NumberFormatException e) {
            mostrarError("Por favor ingrese valores numéricos válidos");
        } catch (ArithmeticException e) {
            mostrarError(e.getMessage());
        }
    }

    private void btnRaizCuadradaActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            double a = Double.parseDouble(txtNumero1.getText());
            double resultado = controlador.raizCuadrada(a);
            lblResultado.setText("Resultado: " + String.format("%.4f", resultado));
        } catch (NumberFormatException e) {
            mostrarError("Por favor ingrese valores numéricos válidos");
        } catch (ArithmeticException e) {
            mostrarError(e.getMessage());
        }
    }

    private void btnRaizCubicaActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            double a = Double.parseDouble(txtNumero1.getText());
            double resultado = controlador.raizCubica(a);
            lblResultado.setText("Resultado: " + String.format("%.4f", resultado));
        } catch (NumberFormatException e) {
            mostrarError("Por favor ingrese valores numéricos válidos");
        }
    }

    private void btnLogaritmoActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            double a = Double.parseDouble(txtNumero1.getText());
            double resultado = controlador.logaritmoNatural(a);
            lblResultado.setText("Resultado: " + String.format("%.4f", resultado));
        } catch (NumberFormatException e) {
            mostrarError("Por favor ingrese valores numéricos válidos");
        } catch (ArithmeticException e) {
            mostrarError(e.getMessage());
        }
    }
}
