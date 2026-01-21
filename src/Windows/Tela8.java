package Windows;

import Utils.CalculosMatematicos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Tela8 extends JFrame {

    private JPanel painelCabecalho;
    private JLabel lblCabecalho, lblA, lblB, lblR1, lblResultado;
    private JTextField txfA, txfB, txfR1, txfResultado;
    private JButton btnCalcular;

    public Tela8() {

        setTitle("Regra de Três");
        setSize(500,300);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        criarComponentes();
        setVisible(true);
    }

    public void criarComponentes() {

        painelCabecalho = new JPanel();
        painelCabecalho.setBounds(0, 0, 500, 50);
        painelCabecalho.setLayout(null);
        painelCabecalho.setBackground(new Color(60, 120, 180));
        getContentPane().add(painelCabecalho);

        lblCabecalho = new JLabel("Regra de Três :");
        lblCabecalho.setBounds(150, 10, 280, 25);
        lblCabecalho.setForeground(Color.WHITE);
        lblCabecalho.setFont(new Font("SansSerif", Font.BOLD, 18));
        painelCabecalho.add(lblCabecalho);

        lblA = new JLabel("a :");
        lblA.setBounds(35, 70, 250, 25);
        lblA.setFont(new Font("SansSerif", Font.BOLD, 15));
        lblA.setForeground(Color.RED);
        getContentPane().add(lblA);

        txfA = new JTextField();
        txfA.setBounds(75, 70, 125, 25);
        getContentPane().add(txfA);

        lblB = new JLabel("b :");
        lblB.setBounds(35, 105, 250, 25);
        lblB.setFont(new Font("SansSerif", Font.BOLD, 15));
        lblB.setForeground(Color.BLUE);
        getContentPane().add(lblB);

        txfB = new JTextField();
        txfB.setBounds(75, 105, 125, 25);
        getContentPane().add(txfB);

        lblR1 = new JLabel("r1 :");
        lblR1.setBounds(265, 70, 250, 25);
        lblR1.setFont(new Font("SansSerif", Font.BOLD, 15));
        lblR1.setForeground(Color.GREEN);
        getContentPane().add(lblR1);

        txfR1 = new JTextField();
        txfR1.setBounds(305, 70, 125, 25);
        getContentPane().add(txfR1);

        lblResultado = new JLabel("r2 :");
        lblResultado.setBounds(265, 105, 250, 25);
        lblResultado.setFont(new Font("SansSerif", Font.BOLD, 15));
        getContentPane().add(lblResultado);

        txfResultado = new JTextField();
        txfResultado.setBounds(305, 105, 125, 25);
        txfResultado.setFont(new Font("SansSerif", Font.BOLD, 15));
        getContentPane().add(txfResultado);

        btnCalcular = new JButton(new AbstractAction("Calcular") {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(txfA.getText().isEmpty()){
                    JOptionPane.showMessageDialog(lblA, "EERO: campo A vazio!");
                    txfA.requestFocus();
                    return;
                }
                if(txfB.getText().isEmpty()){
                    JOptionPane.showMessageDialog(lblB, "EERO: campo B vazio!");
                    txfB.requestFocus();
                    return;
                }

                if(txfR1.getText().isEmpty()){
                    JOptionPane.showMessageDialog(lblR1, "EERO: campo R1 vazio!");
                    txfR1.requestFocus();
                    return;
                }

                double a = Double.parseDouble(txfA.getText());
                double b = Double.parseDouble(txfB.getText());
                double r1 = Double.parseDouble(txfR1.getText());
                double resultado = CalculosMatematicos.regraDeTres(a, b, r1);
                txfResultado.setText(String.format("%.2f", resultado));
            }
        });
        btnCalcular.setBounds(35, 175, 150, 25);
        btnCalcular.setFont(new Font("SansSerif", Font.BOLD, 15));
        getContentPane().add(btnCalcular);
    }

}