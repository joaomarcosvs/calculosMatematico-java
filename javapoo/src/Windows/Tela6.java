package Windows;

import Utils.CalculosMatematicos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Tela6 extends JFrame {

    private JPanel painelCabecalho;
    private JLabel lblCabecalho, lblInicial, lblFinal, lblResultado;
    private JTextField txfInicial, txfFinal, txfResultado;
    private JButton btnCalcular;

    public Tela6() {

        setTitle("Variação do Delta Desconto");
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

        lblCabecalho = new JLabel("Variação do delta(%) :");
        lblCabecalho.setBounds(80, 10, 280, 25);
        lblCabecalho.setForeground(Color.WHITE);
        lblCabecalho.setFont(new Font("SansSerif", Font.BOLD, 18));
        painelCabecalho.add(lblCabecalho);

        lblInicial = new JLabel("Valor inicial :");
        lblInicial.setBounds(20, 70, 250, 25);
        lblInicial.setFont(new Font("SansSerif", Font.BOLD, 15));
        lblInicial.setForeground(Color.RED);
        getContentPane().add(lblInicial);

        txfInicial = new JTextField();
        txfInicial.setBounds(130, 70, 125, 25);
        getContentPane().add(txfInicial);

        lblFinal = new JLabel("Valor final :");
        lblFinal.setBounds(20, 105, 250, 25);
        lblFinal.setFont(new Font("SansSerif", Font.BOLD, 15));
        lblFinal.setForeground(Color.BLUE);
        getContentPane().add(lblFinal);

        txfFinal = new JTextField();
        txfFinal.setBounds(130, 105, 125, 25);
        getContentPane().add(txfFinal);

        lblResultado = new JLabel("Diferença % :");
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

                if(txfInicial.getText().isEmpty()){
                    JOptionPane.showMessageDialog(lblInicial, "EERO: campo VALOR INICIAL vazio!");
                    txfInicial.requestFocus();
                    return;
                }
                if(txfFinal.getText().isEmpty()){
                    JOptionPane.showMessageDialog(lblFinal, "EERO: campo VALOR FINAL vazio!");
                    txfFinal.requestFocus();
                    return;
                }

                double a = Double.parseDouble(txfInicial.getText());
                double b = Double.parseDouble(txfFinal.getText());
                double resultado = CalculosMatematicos.variacaoDeltaDesconto(a, b);
                txfResultado.setText(String.format("%.2f", resultado));
            }
        });
        btnCalcular.setBounds(20, 175, 150, 25);
        btnCalcular.setFont(new Font("SansSerif", Font.BOLD, 15));
        getContentPane().add(btnCalcular);
    }


}


