package Windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.SecureRandom;

public class Tela9 extends JFrame {

    private JCheckBox chkMaiusculas, chkMinusculas, chkNumeros, chkSimbolos;
    private JSpinner spnTamanho;
    private JButton btnGerar;
    private JTextField txtSenhaGerada;

    public Tela9() {
        setTitle("Gerador de Senhas");
        setSize(500, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        criarComponentes();
        setVisible(true);
    }

    private void criarComponentes() {
        setLayout(new BorderLayout());

        // Painel do Título
        JPanel painelTitulo = new JPanel();
        painelTitulo.setBackground(new Color(70, 130, 180));
        JLabel lblTitulo = new JLabel("Gerador de Senhas Seguras");
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 22));
        painelTitulo.add(lblTitulo);
        add(painelTitulo, BorderLayout.NORTH);

        // Painel Principal
        JPanel painelPrincipal = new JPanel(new GridBagLayout());
        painelPrincipal.setBackground(new Color(245, 245, 245));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        Font fonte = new Font("Segoe UI", Font.PLAIN, 16);

        chkMaiusculas = new JCheckBox("Maiúsculas");
        chkMaiusculas.setSelected(true);
        chkMaiusculas.setFont(fonte);
        chkMaiusculas.setBackground(painelPrincipal.getBackground());

        chkMinusculas = new JCheckBox("Minúsculas");
        chkMinusculas.setSelected(true);
        chkMinusculas.setFont(fonte);
        chkMinusculas.setBackground(painelPrincipal.getBackground());

        chkNumeros = new JCheckBox("Números");
        chkNumeros.setSelected(true);
        chkNumeros.setFont(fonte);
        chkNumeros.setBackground(painelPrincipal.getBackground());

        chkSimbolos = new JCheckBox("Símbolos");
        chkSimbolos.setSelected(true);
        chkSimbolos.setFont(fonte);
        chkSimbolos.setBackground(painelPrincipal.getBackground());

        gbc.gridx = 0; gbc.gridy = 0;
        painelPrincipal.add(chkMaiusculas, gbc);
        gbc.gridx = 1;
        painelPrincipal.add(chkMinusculas, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        painelPrincipal.add(chkNumeros, gbc);
        gbc.gridx = 1;
        painelPrincipal.add(chkSimbolos, gbc);

        JLabel lblTamanho = new JLabel("Tamanho:");
        lblTamanho.setFont(fonte);
        spnTamanho = new JSpinner(new SpinnerNumberModel(8, 4, 32, 1));
        spnTamanho.setFont(fonte);

        gbc.gridx = 0; gbc.gridy = 2;
        painelPrincipal.add(lblTamanho, gbc);
        gbc.gridx = 1;
        painelPrincipal.add(spnTamanho, gbc);

        btnGerar = new JButton("Gerar Senha");
        btnGerar.setFont(new Font("Segoe UI", Font.BOLD, 18));
        btnGerar.setFocusPainted(false);
        btnGerar.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btnGerar.addActionListener(this::gerarSenha);

        gbc.gridx = 0; gbc.gridy = 3;
        gbc.gridwidth = 2;
        painelPrincipal.add(btnGerar, gbc);

        txtSenhaGerada = new JTextField(20);
        txtSenhaGerada.setEditable(false);
        txtSenhaGerada.setFont(new Font("Consolas", Font.BOLD, 18));
        txtSenhaGerada.setHorizontalAlignment(JTextField.CENTER);
        txtSenhaGerada.setBackground(new Color(255, 255, 240));
        txtSenhaGerada.setBorder(BorderFactory.createLineBorder(new Color(192, 192, 192), 2));

        gbc.gridx = 0; gbc.gridy = 4;
        gbc.gridwidth = 2;
        painelPrincipal.add(txtSenhaGerada, gbc);

        add(painelPrincipal, BorderLayout.CENTER);
    }

    private void gerarSenha(ActionEvent e) {
        String maiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String simbolos = "!@#$%&*";

        StringBuilder caracteres = new StringBuilder();

        if (chkMaiusculas.isSelected()) caracteres.append(maiusculas);
        if (chkMinusculas.isSelected()) caracteres.append(minusculas);
        if (chkNumeros.isSelected()) caracteres.append(numeros);
        if (chkSimbolos.isSelected()) caracteres.append(simbolos);

        if (caracteres.length() == 0) {
            JOptionPane.showMessageDialog(this, "Selecione pelo menos uma opção!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        SecureRandom random = new SecureRandom();
        int tamanho = (int) spnTamanho.getValue();
        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            int index = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(index));
        }

        txtSenhaGerada.setText(senha.toString());
    }
}
