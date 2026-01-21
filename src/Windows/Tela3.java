package Windows;

import Utils.CalculosMatematicos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Tela3 extends JFrame {

    private JPanel painelCabecalho;
    private JLabel lblCabecalho, lblTotal, lblPorcentagem, lblResultado;
    private JTextField txfTotal, txfPorcentagem, txfResultado;
    private JButton btnCalcular;

    public Tela3() {

        setTitle("Amostragem");
        setSize(400,300);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        criarComponentes();
        setVisible(true);
    }

    public void criarComponentes() {

        painelCabecalho = new JPanel();
        painelCabecalho.setBounds(0, 0, 400, 50);
        painelCabecalho.setLayout(null);
        painelCabecalho.setBackground(new Color(60, 120, 180));
        getContentPane().add(painelCabecalho);

        lblCabecalho = new JLabel("Quanto X% representa de Y:");
        lblCabecalho.setBounds(70, 10, 270, 25);
        lblCabecalho.setForeground(Color.WHITE);
        lblCabecalho.setFont(new Font("SansSerif", Font.BOLD, 18));
        painelCabecalho.add(lblCabecalho);

        lblTotal = new JLabel("Total :");
        lblTotal.setBounds(20, 70, 250, 25);
        lblTotal.setFont(new Font("SansSerif", Font.BOLD, 15));
        lblTotal.setForeground(Color.RED);
        getContentPane().add(lblTotal);

        txfTotal = new JTextField();
        txfTotal.setBounds(150, 70, 125, 25);
        getContentPane().add(txfTotal);

        lblPorcentagem = new JLabel("Porcentagem % :");
        lblPorcentagem.setBounds(20, 105, 250, 25);
        lblPorcentagem.setFont(new Font("SansSerif", Font.BOLD, 15));
        lblPorcentagem.setForeground(Color.BLUE);
        getContentPane().add(lblPorcentagem);

        txfPorcentagem = new JTextField();
        txfPorcentagem.setBounds(150, 105, 125, 25);
        getContentPane().add(txfPorcentagem);

        lblResultado = new JLabel("Corresponde a :");
        lblResultado.setBounds(20, 140, 250, 25);
        lblResultado.setFont(new Font("SansSerif", Font.BOLD, 15));
        getContentPane().add(lblResultado);

        txfResultado = new JTextField();
        txfResultado.setBounds(150, 140, 125, 25);
        txfResultado.setFont(new Font("SansSerif", Font.BOLD, 15));
        getContentPane().add(txfResultado);

        btnCalcular = new JButton(new AbstractAction("Calcular") {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(txfTotal.getText().isEmpty()){
                    JOptionPane.showMessageDialog(lblTotal, "EERO: campo TOTAL vazio!");
                    txfTotal.requestFocus();
                    return;
                }
                if(txfPorcentagem.getText().isEmpty()){
                    JOptionPane.showMessageDialog(lblPorcentagem, "EERO: campo PORCENTAGEM vazio!");
                    txfPorcentagem.requestFocus();
                    return;
                }

                double a = Double.parseDouble(txfTotal.getText());
                double b = Double.parseDouble(txfPorcentagem.getText());
                double resultado = CalculosMatematicos.amostragem(a, b);
                txfResultado.setText(String.format("%.2f", resultado));
            }
        });
        btnCalcular.setBounds(20, 175, 150, 25);
        btnCalcular.setFont(new Font("SansSerif", Font.BOLD, 15));
        getContentPane().add(btnCalcular);
    }


}

