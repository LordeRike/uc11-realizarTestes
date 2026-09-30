import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class CalculadoraDescontoApp extends JFrame {

    private JTextField txtPrecoOriginal;
    private JTextField txtPorcentagemDesconto;
    private JLabel lblValorDesconto;
    private JLabel lblPrecoFinal;
    private JLabel lblMensagemErro;

    public CalculadoraDescontoApp() {
        // Configuração da Janela
        setTitle("Loja Tech - Calculadora de Descontos");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6, 8, 6, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Cabeçalho
        JLabel lblTitulo = new JLabel("Calculadora de Desconto de Produtos", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 15));
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        add(lblTitulo, gbc);

        // Entrada: Preço Original
        gbc.gridwidth = 1;
        gbc.gridx = 0; gbc.gridy = 1;
        add(new JLabel("Preço do Produto (R$):"), gbc);

        txtPrecoOriginal = new JTextField(10);
        gbc.gridx = 1; gbc.gridy = 1;
        add(txtPrecoOriginal, gbc);

        // Entrada: Porcentagem de Desconto
        gbc.gridx = 0; gbc.gridy = 2;
        add(new JLabel("Desconto (%):"), gbc);

        txtPorcentagemDesconto = new JTextField(10);
        gbc.gridx = 1; gbc.gridy = 2;
        add(txtPorcentagemDesconto, gbc);

        // Botão Calcular
        JButton btnCalcular = new JButton("Calcular Desconto");
        btnCalcular.setFont(new Font("Arial", Font.BOLD, 12));
        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2;
        add(btnCalcular, gbc);

        // Exibição dos Resultados
        gbc.gridwidth = 1;
        gbc.gridx = 0; gbc.gridy = 4;
        add(new JLabel("Valor do Desconto:"), gbc);

        lblValorDesconto = new JLabel("R$ 0,00");
        lblValorDesconto.setFont(new Font("Arial", Font.BOLD, 13));
        gbc.gridx = 1; gbc.gridy = 4;
        add(lblValorDesconto, gbc);

        gbc.gridx = 0; gbc.gridy = 5;
        add(new JLabel("Preço Final:"), gbc);

        lblPrecoFinal = new JLabel("R$ 0,00");
        lblPrecoFinal.setFont(new Font("Arial", Font.BOLD, 13));
        lblPrecoFinal.setForeground(new Color(0, 100, 0));
        gbc.gridx = 1; gbc.gridy = 5;
        add(lblPrecoFinal, gbc);

        // Mensagem de Erro/Status
        lblMensagemErro = new JLabel(" ", SwingConstants.CENTER);
        lblMensagemErro.setForeground(Color.RED);
        gbc.gridx = 0; gbc.gridy = 6; gbc.gridwidth = 2;
        add(lblMensagemErro, gbc);

        // Evento do Botão
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processarCalculo();
            }
        });
    }

    private void processarCalculo() {
        lblMensagemErro.setText(" ");
        DecimalFormat df = new DecimalFormat("0.00");

        try {
            double preco = Double.parseDouble(txtPrecoOriginal.getText().replace(",", "."));
            double descontoPercentual = Double.parseDouble(txtPorcentagemDesconto.getText().replace(",", "."));
            
            double valorDesconto = preco * (descontoPercentual / 100.0);
            
            double precoFinal;
            if (descontoPercentual == 0) {
                precoFinal = preco + 1.0; 
            } else {
                precoFinal = preco - valorDesconto;
            }

            lblValorDesconto.setText("R$ " + df.format(valorDesconto));
            lblPrecoFinal.setText("R$ " + df.format(precoFinal));

        } catch (NumberFormatException ex) {
            
            lblMensagemErro.setText("Erro: Insira apenas números válidos.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculadoraDescontoApp().setVisible(true);
        });
    }
}