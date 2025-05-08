package Windows;

import Utils.CalculosMatematicos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Tela7 extends JFrame {

    private JPanel painelCabecalho;
    private JLabel lblCabecalho, lblFinal, lblDesconto, lblResultado;
    private JTextField txfFinal, txfDesconto, txfResultado;
    private JButton btnCalcular;

    public Tela7() {

        setTitle("Valor Original");
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

        lblCabecalho = new JLabel("Qual era o valor original :");
        lblCabecalho.setBounds(80, 10, 270, 25);
        lblCabecalho.setForeground(Color.WHITE);
        lblCabecalho.setFont(new Font("SansSerif", Font.BOLD, 18));
        painelCabecalho.add(lblCabecalho);

        lblFinal = new JLabel("Valor final :");
        lblFinal.setBounds(20, 70, 250, 25);
        lblFinal.setFont(new Font("SansSerif", Font.BOLD, 15));
        lblFinal.setForeground(Color.RED);
        getContentPane().add(lblFinal);

        txfFinal = new JTextField();
        txfFinal.setBounds(130, 70, 125, 25);
        getContentPane().add(txfFinal);

        lblDesconto = new JLabel("Desconto % :");
        lblDesconto.setBounds(20, 105, 250, 25);
        lblDesconto.setFont(new Font("SansSerif", Font.BOLD, 15));
        lblDesconto.setForeground(Color.BLUE);
        getContentPane().add(lblDesconto);

        txfDesconto = new JTextField();
        txfDesconto.setBounds(130, 105, 125, 25);
        getContentPane().add(txfDesconto);

        lblResultado = new JLabel("Valor inicial :");
        lblResultado.setBounds(20, 140, 250, 25);
        lblResultado.setFont(new Font("SansSerif", Font.BOLD, 15));
        getContentPane().add(lblResultado);

        txfResultado = new JTextField();
        txfResultado.setBounds(130, 140, 125, 25);
        txfResultado.setFont(new Font("SansSerif", Font.BOLD, 15));
        getContentPane().add(txfResultado);

        btnCalcular = new JButton(new AbstractAction("Calcular") {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(txfFinal.getText().isEmpty()){
                    JOptionPane.showMessageDialog(lblFinal, "EERO: campo VALOR FINAL vazio!");
                    txfFinal.requestFocus();
                    return;
                }
                if(txfDesconto.getText().isEmpty()){
                    JOptionPane.showMessageDialog(lblDesconto, "EERO: campo DESCONTO vazio!");
                    txfDesconto.requestFocus();
                    return;
                }

                double a = Double.parseDouble(txfFinal.getText());
                double b = Double.parseDouble(txfDesconto.getText());
                double resultado = CalculosMatematicos.valorOriginal(a, b);
                txfResultado.setText(String.format("%.2f", resultado));
            }
        });
        btnCalcular.setBounds(20, 175, 150, 25);
        btnCalcular.setFont(new Font("SansSerif", Font.BOLD, 15));
        getContentPane().add(btnCalcular);
    }

}