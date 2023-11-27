import javax.swing.*;
import java.util.List;

public class Pedido {
    public void fazerPedido(List<VeiculoBrasileiro> veiculos, List<String> pecas, String string, String string2, int k, double d, String string3) {
        int cupons = 0;

        while (true) {
            StringBuilder veiculosDisponiveis = new StringBuilder("Veículos disponíveis:\n");
            for (int i = 0; i < veiculos.size(); i++) {
                veiculosDisponiveis.append(i + 1).append(". ").append(veiculos.get(i)).append("\n");
            }

            String escolhaVeiculo = JOptionPane.showInputDialog(null, veiculosDisponiveis.toString(),
                    "Escolha o número do veículo que deseja pedir", JOptionPane.INFORMATION_MESSAGE);

            try {
                int escolha = Integer.parseInt(escolhaVeiculo);

                if (escolha > 0 && escolha <= veiculos.size()) {
                    VeiculoBrasileiro veiculoEscolhido = veiculos.get(escolha - 1);
                    JOptionPane.showMessageDialog(null, "Pedido para: " + veiculoEscolhido);

                    StringBuilder pecasDisponiveis = new StringBuilder("Peças disponíveis para esse veículo:\n");
                    for (int j = 0; j < pecas.size(); j++) {
                        pecasDisponiveis.append(j + 1).append(". ").append(pecas.get(j)).append("\n");
                    }

                    String escolhaPeca = JOptionPane.showInputDialog(null, pecasDisponiveis.toString(),
                            "Escolha o número da peça que deseja", JOptionPane.INFORMATION_MESSAGE);

                    try {
                        int escolhaPecaInt = Integer.parseInt(escolhaPeca);

                        if (escolhaPecaInt > 0 && escolhaPecaInt <= pecas.size()) {
                            String pecaEscolhida = pecas.get(escolhaPecaInt - 1);
                            JOptionPane.showMessageDialog(null, "Pedido para a peça: " + pecaEscolhida);

                            String respostaEstrangeira = JOptionPane.showInputDialog(null,
                                    "A peça é estrangeira? (Sim ou Não):", "Confirmação",
                                    JOptionPane.INFORMATION_MESSAGE);
                            boolean estrangeira = respostaEstrangeira.equalsIgnoreCase("sim");

                            if (estrangeira) {
                                JOptionPane.showMessageDialog(null, "Cobrado imposto de 20%.");
                            } else {
                                JOptionPane.showMessageDialog(null, "Sem imposto.");
                            }

                            String quantidadeString = JOptionPane.showInputDialog(null, "Quantidade desejada:",
                                    "Quantidade", JOptionPane.INFORMATION_MESSAGE);
                            int quantidade = Integer.parseInt(quantidadeString);

                            JOptionPane.showMessageDialog(null,
                                    "Pedido feito para a peça: " + pecaEscolhida + "\nPeça estrangeira: "
                                            + (estrangeira ? "Sim" : "Não") + "\nQuantidade: " + quantidade);

                            // Perguntar quantos cupons de desconto o usuário quer aplicar
                            String cuponsString = JOptionPane.showInputDialog(null,
                                    "Quantos cupons de desconto deseja aplicar?", "Cupons",
                                    JOptionPane.INFORMATION_MESSAGE);
                            int cuponsAplicar = Integer.parseInt(cuponsString);

                            JOptionPane.showMessageDialog(null,
                                    "Você aplicou " + cuponsAplicar + " cupon(s) de desconto!");

                            // Perguntar se o usuário quer finalizar o pedido
                            String finalizarPedido = JOptionPane.showInputDialog(null,
                                    "Deseja finalizar o pedido? (Sim ou Não):", "Confirmação",
                                    JOptionPane.INFORMATION_MESSAGE);

                            if (finalizarPedido.equalsIgnoreCase("sim")) {
                                // Perguntar quantos cupons o usuário possui
                                String cuponsUsuarioString = JOptionPane.showInputDialog(null,
                                        "Quantos cupons de desconto você possui?", "Cupons",
                                        JOptionPane.INFORMATION_MESSAGE);
                                int cuponsUsuario = Integer.parseInt(cuponsUsuarioString);

                                if (cuponsUsuario > 4) {
                                    JOptionPane.showMessageDialog(null,
                                            "Você já excedeu o limite de cupons de desconto.");
                                } else {
                                    JOptionPane.showMessageDialog(null,
                                            "Você recebeu um cupom de desconto de 10% acumulativo até 50%!");
                                    cupons++;
                                }

                                String respostaRetornar = JOptionPane.showInputDialog(null,
                                        "Deseja retornar ao menu? (Sim ou Não):", "Confirmação",
                                        JOptionPane.INFORMATION_MESSAGE);

                                if (respostaRetornar.equalsIgnoreCase("sim")) {
                                    AppSwing app = new AppSwing();
                                    app.main(null);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Opção inválida. Por favor, escolha uma peça válida.");
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha uma peça válida.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha um veículo válido.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha um veículo válido.");
            }
        }
    }
}
