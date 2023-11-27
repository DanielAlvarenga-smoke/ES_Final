import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class AppSwing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Sistema sistema = new Sistema();
            sistema.adicionarUsuario(new Cliente("Cliente1"));
            sistema.adicionarUsuario(new Gerente("Daniel", "1234"));

            JFrame frame = new JFrame("Sistema de Pedidos");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);
            placeComponents(panel, sistema, frame);

            frame.setSize(300, 200);
            frame.setVisible(true);
        });
    }

    private static void placeComponents(JPanel panel, Sistema sistema, JFrame frame) {
        panel.setLayout(null);

        JLabel tipoUsuarioLabel = new JLabel("Escolha o tipo de usuário (cliente/gerente):");
        tipoUsuarioLabel.setBounds(10, 20, 260, 25);
        panel.add(tipoUsuarioLabel);

        JTextField tipoUsuarioText = new JTextField(20);
        tipoUsuarioText.setBounds(10, 50, 160, 25);
        panel.add(tipoUsuarioText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(180, 50, 80, 25);
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tipoUsuario = tipoUsuarioText.getText();

                if (tipoUsuario.equalsIgnoreCase("cliente")) {
                    Usuario cliente = new Cliente("Temporário");
                    sistema.entrar(cliente);

                    MenuCliente menuCliente = new MenuCliente();
                    menuCliente.exibirMenu();

                    int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                            "Escolha uma opção:\n" +
                                    "1. Fazer Pedido\n" +
                                    "2. Acessar Manual\n" +
                                    "3. Pedir Reembolso\n" +
                                    "4. Pedir Suporte"
                    ));

                    if (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4) {
                        GestorVeiculosBrasileiros gestorVeiculos = new GestorVeiculosBrasileiros();
                        List<VeiculoBrasileiro> veiculos = gestorVeiculos.getVeiculosBrasileiros();

                        PecasDeCarro pecasDeCarro = new PecasDeCarro();
                        List<String> pecas = pecasDeCarro.getTiposDePecas();

                        menuCliente.processarOpcao(opcao, veiculos, pecas);
                        frame.dispose(); // Fechar a janela após a ação
                    } else {
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                    }
                } else if (tipoUsuario.equalsIgnoreCase("gerente")) {
                    String senha = JOptionPane.showInputDialog("Digite a senha:");
                    Usuario gerente = new Gerente("Temporário", senha);

                    for (Usuario usuario : sistema.getUsuarios()) {
                        if (usuario instanceof Gerente) {
                            Gerente gerenteSistema = (Gerente) usuario;
                            if (gerenteSistema.verificarSenha(senha)) {
                                sistema.entrar(usuario);
                                String informacoes = JOptionPane.showInputDialog("Digite as informações do pedido a ser cadastrado:");
                                JOptionPane.showMessageDialog(null, "Informações cadastradas: " + informacoes);
                                frame.dispose(); // Fechar a janela após a ação
                                return;
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Senha incorreta. Acesso negado.");
                } else {
                    JOptionPane.showMessageDialog(null, "Tipo de usuário inválido.");
                }
            }
        });
    }
}
