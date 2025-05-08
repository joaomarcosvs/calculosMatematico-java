package Windows;

import Utils.CalculosMatematicos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Tela1 extends JFrame {

    private JPanel painelCabecalho;
    private JLabel lblCabecalho, lblValorInicial, lblDesconto, lblResultado;
    private JTextField txfValorInicial, txfDesconto, txfResultado;
    private JButton btnCalcular;

    public Tela1() {

        setTitle("Aplicar Desconto");
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

        lblCabecalho = new JLabel("Aplicar desconto % num valor:");
        lblCabecalho.setBounds(60, 10, 270, 25);
        lblCabecalho.setForeground(Color.WHITE);
        lblCabecalho.setFont(new Font("SansSerif", Font.BOLD, 18));
        painelCabecalho.add(lblCabecalho);

        lblValorInicial = new JLabel("Valor inicial R$ :");
        lblValorInicial.setBounds(20, 70, 250, 25);
        lblValorInicial.setFont(new Font("SansSerif", Font.BOLD, 15));
        lblValorInicial.setForeground(Color.RED);
        getContentPane().add(lblValorInicial);

        txfValorInicial = new JTextField();
        txfValorInicial.setBounds(140, 70, 125, 25);
        getContentPane().add(txfValorInicial);

        lblDesconto = new JLabel("Desconto % :");
        lblDesconto.setBounds(20, 105, 250, 25);
        lblDesconto.setFont(new Font("SansSerif", Font.BOLD, 15));
        lblDesconto.setForeground(Color.BLUE);
        getContentPane().add(lblDesconto);

        txfDesconto = new JTextField();
        txfDesconto.setBounds(140, 105, 125, 25);
        getContentPane().add(txfDesconto);

        lblResultado = new JLabel("Resultado :");
        lblResultado.setBounds(20, 140, 250, 25);
        lblResultado.setFont(new Font("SansSerif", Font.BOLD, 15));
        getContentPane().add(lblResultado);

        txfResultado = new JTextField();
        txfResultado.setBounds(140, 140, 125, 25);
        txfResultado.setFont(new Font("SansSerif", Font.BOLD, 15));
        getContentPane().add(txfResultado);

        btnCalcular = new JButton(new AbstractAction("Calcular") {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(txfValorInicial.getText().isEmpty()){
                    JOptionPane.showMessageDialog(lblValorInicial, "EERO: campo VALOR INICIAL vazio!");
                    txfValorInicial.requestFocus();
                    return;
                }
                if(txfDesconto.getText().isEmpty()){
                    JOptionPane.showMessageDialog(lblDesconto, "EERO: campo DESCONTO vazio!");
                    txfDesconto.requestFocus();
                    return;
                }

                double a = Double.parseDouble(txfValorInicial.getText());
                double b = Double.parseDouble(txfDesconto.getText());
                double resultado = CalculosMatematicos.aplicarDesconto(a, b);
                txfResultado.setText(String.format("%.2f", resultado));
            }
        });
        btnCalcular.setBounds(20, 175, 150, 25);
        btnCalcular.setFont(new Font("SansSerif", Font.BOLD, 15));
        getContentPane().add(btnCalcular);
    }


}
