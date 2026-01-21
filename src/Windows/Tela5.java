package Windows;

import Utils.CalculosMatematicos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Tela5 extends JFrame {

    private JPanel painelCabecalho;
    private JLabel lblCabecalho, lblOriginal, lblValorComDesconto, lblResultado;
    private JTextField txfOriginal, txfValorComDesconto, txfResultado;
    private JButton btnCalcular;

    public Tela5() {

        setTitle("Descobir o Desconto");
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

        lblCabecalho = new JLabel("Valor era X paguei Y qual foi o desconto:");
        lblCabecalho.setBounds(20, 10, 350, 25);
        lblCabecalho.setForeground(Color.WHITE);
        lblCabecalho.setFont(new Font("SansSerif", Font.BOLD, 17));
        painelCabecalho.add(lblCabecalho);

        lblOriginal = new JLabel("Valor original :");
        lblOriginal.setBounds(20, 70, 250, 25);
        lblOriginal.setFont(new Font("SansSerif", Font.BOLD, 15));
        lblOriginal.setForeground(Color.RED);
        getContentPane().add(lblOriginal);

        txfOriginal = new JTextField();
        txfOriginal.setBounds(160, 70, 125, 25);
        getContentPane().add(txfOriginal);

        lblValorComDesconto = new JLabel("Valor c/ desconto :");
        lblValorComDesconto.setBounds(20, 105, 250, 25);
        lblValorComDesconto.setFont(new Font("SansSerif", Font.BOLD, 15));
        lblValorComDesconto.setForeground(Color.BLUE);
        getContentPane().add(lblValorComDesconto);

        txfValorComDesconto = new JTextField();
        txfValorComDesconto.setBounds(160, 105, 125, 25);
        getContentPane().add(txfValorComDesconto);

        lblResultado = new JLabel("Desconto % :");
        lblResultado.setBounds(20, 140, 250, 25);
        lblResultado.setFont(new Font("SansSerif", Font.BOLD, 15));
        getContentPane().add(lblResultado);

        txfResultado = new JTextField();
        txfResultado.setBounds(160, 140, 125, 25);
        txfResultado.setFont(new Font("SansSerif", Font.BOLD, 15));
        getContentPane().add(txfResultado);

        btnCalcular = new JButton(new AbstractAction("Calcular") {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(txfOriginal.getText().isEmpty()){
                    JOptionPane.showMessageDialog(lblOriginal, "EERO: campo VALOR ORIGINAL vazio!");
                    txfOriginal.requestFocus();
                    return;
                }
                if(txfValorComDesconto.getText().isEmpty()){
                    JOptionPane.showMessageDialog(lblValorComDesconto, "EERO: campo VALOR COM DESCONTO vazio!");
                    txfValorComDesconto.requestFocus();
                    return;
                }

                double a = Double.parseDouble(txfOriginal.getText());
                double b = Double.parseDouble(txfValorComDesconto.getText());
                double resultado = CalculosMatematicos.descobrirDesconto(a, b);
                txfResultado.setText(String.format("%.2f", resultado));
            }
        });
        btnCalcular.setBounds(20, 175, 150, 25);
        btnCalcular.setFont(new Font("SansSerif", Font.BOLD, 15));
        getContentPane().add(btnCalcular);
    }


}


