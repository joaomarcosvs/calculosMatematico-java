package View;

import Windows.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MenuWindow extends JFrame {

    private JPanel painelCabecalho;
    private JLabel lblCabecalho, lblOp1, lblOp2, lblOp3, lblOp4, lblOp5, lblOp6, lblOp7, lblOp8, lblOp9, lblOpcao;
    private JTextField txfOpEscolhida;
    private JButton btnAvancar;

    public MenuWindow() {

        setTitle("Menu");
        setSize(400,600);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        criarComponentes();
        setVisible(true);
    }

    public void criarComponentes() {

        painelCabecalho = new JPanel();
        painelCabecalho.setBounds(0, 0, 400, 50);
        painelCabecalho.setLayout(null);
        painelCabecalho.setBackground(new Color(60, 120, 180));
        getContentPane().add(painelCabecalho);

        lblCabecalho = new JLabel("Menu");
        lblCabecalho.setBounds(150, 10, 250, 25);
        lblCabecalho.setForeground(Color.WHITE);
        lblCabecalho.setFont(new Font("SansSerif", Font.BOLD, 20));
        painelCabecalho.add(lblCabecalho);

        lblOp1 = new JLabel("Opção 1 - Aplicar Desconto");
        lblOp1.setBounds(10, 55, 200, 25);
        getContentPane().add(lblOp1);

        lblOp2 = new JLabel("Opção 2 - Incrementar Porcentagem");
        lblOp2.setBounds(10, 85, 250, 25);
        getContentPane().add(lblOp2);

        lblOp3 = new JLabel("Opção 3 - Amostragem");
        lblOp3.setBounds(10, 115, 200, 25);
        getContentPane().add(lblOp3);

        lblOp4 = new JLabel("Opção 4 - Amostragem 2");
        lblOp4.setBounds(10, 145, 200, 25);
        getContentPane().add(lblOp4);

        lblOp5 = new JLabel("Opção 5 - Descobrir Desconto");
        lblOp5.setBounds(10, 175, 200, 25);
        getContentPane().add(lblOp5);

        lblOp6 = new JLabel("Opção 6 - Variação Delta");
        lblOp6.setBounds(10, 205, 200, 25);
        getContentPane().add(lblOp6);

        lblOp7 = new JLabel("Opção 7 - Valor Original");
        lblOp7.setBounds(10, 235, 230, 25);
        getContentPane().add(lblOp7);

        lblOp8 = new JLabel("Opção 8 - Regra de Três");
        lblOp8.setBounds(10, 265, 200, 25);
        getContentPane().add(lblOp8);

        lblOp9 = new JLabel("Opção 9 - Gerador de Senha");
        lblOp9.setBounds(10, 295, 200, 25);
        getContentPane().add(lblOp9);

        lblOpcao = new JLabel("Digite a opção escolhida:");
        lblOpcao.setBounds(10, 325, 200, 25);
        getContentPane().add(lblOpcao);

        txfOpEscolhida = new JTextField();
        txfOpEscolhida.setBounds(10, 355, 100, 25);
        getContentPane().add(txfOpEscolhida);

        btnAvancar = new JButton(new AbstractAction("Avançar") {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (txfOpEscolhida.getText().isEmpty()) {

                    JOptionPane.showMessageDialog(lblOpcao, "ERRO: campo OPÇÃO vazio!");
                    txfOpEscolhida.requestFocus();
                    return;
                }
                int opcao = Integer.parseInt(txfOpEscolhida.getText());
                switch (opcao) {
                    case 1: new Tela1(); break;
                    case 2: new Tela2(); break;
                    case 3: new Tela3(); break;
                    case 4: new Tela4(); break;
                    case 5: new Tela5(); break;
                    case 6: new Tela6(); break;
                    case 7: new Tela7(); break;
                    case 8: new Tela8(); break;
                    case 9: new Tela9(); break;
                    default:
                        JOptionPane.showMessageDialog(lblOpcao, "Opção inválida!");
                        break;
                }

            }
        });
        btnAvancar.setBounds(10, 390, 150, 25);
        btnAvancar.setFont(new Font("SansSerif", Font.BOLD, 16));
        getContentPane().add(btnAvancar);
    }
}
