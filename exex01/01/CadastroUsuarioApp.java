import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroUsuarioApp extends JFrame {

    private JPasswordField txtSenha;
    private JPasswordField txtConfirmarSenha;
    private JButton btnCadastrar;
    private JLabel lblResultado;

    public CadastroUsuarioApp() {
        // Configuração da Janela
        setTitle("Exercício Prático - Cadastro de Usuário");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new java.awt.Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Título Visual na Tela
        JLabel lblTitulo = new JLabel("Cadastro de Usuário", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        add(lblTitulo, gbc);

        // Requisito Exibido para os Alunos
        JLabel lblRequisito = new JLabel("<html><body style='width: 300px; color: gray;'>"
                + "<b>Requisito:</b> O campo 'Senha' deve conter no mínimo 8 caracteres, "
                + "aceitar letras e números, e o campo 'Confirmar Senha' deve ser idêntico ao campo 'Senha'."
                + "</body></html>");
        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 2;
        add(lblRequisito, gbc);

        // Campo Senha
        gbc.gridwidth = 1;
        gbc.gridx = 0; gbc.gridy = 2;
        add(new JLabel("Senha:"), gbc);

        txtSenha = new JPasswordField(15);
        gbc.gridx = 1; gbc.gridy = 2;
        add(txtSenha, gbc);

        // Campo Confirmar Senha
        gbc.gridx = 0; gbc.gridy = 3;
        add(new JLabel("Confirmar Senha:"), gbc);

        txtConfirmarSenha = new JPasswordField(15);
        gbc.gridx = 1; gbc.gridy = 3;
        add(txtConfirmarSenha, gbc);

        // Botão Salvar
        btnCadastrar = new JButton("Cadastrar");
        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2;
        add(btnCadastrar, gbc);

        // Feedback do Resultado
        lblResultado = new JLabel(" ", SwingConstants.CENTER);
        lblResultado.setFont(new Font("Arial", Font.BOLD, 12));
        gbc.gridx = 0; gbc.gridy = 5; gbc.gridwidth = 2;
        add(lblResultado, gbc);

        // Ação do Botão
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarCadastro();
            }
        });
    }

    private void validarCadastro() {
        String senha = new String(txtSenha.getPassword());
        String confirmarSenha = new String(txtConfirmarSenha.getPassword());

        // Implementação estrita do que o requisito diz:
        // 1. Mínimo 8 caracteres
        if (senha.length() < 8) {
            lblResultado.setForeground(Color.RED);
            lblResultado.setText("Erro: A senha deve ter no mínimo 8 caracteres.");
            return;
        }

        // 2. Aceita letras e números (Não valida/bloqueia caracteres especiais nem obriga a ter ambos)
        // 3. Confirmar Senha deve ser idêntico
        if (!senha.equals(confirmarSenha)) {
            lblResultado.setForeground(Color.RED);
            lblResultado.setText("Erro: O campo 'Confirmar Senha' não confere.");
            return;
        }

        // Se passar das validações básicas acima:
        lblResultado.setForeground(new Color(0, 128, 0));
        lblResultado.setText(" Sucesso: Usuário cadastrado com sucesso!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CadastroUsuarioApp().setVisible(true);
        });
    }
}