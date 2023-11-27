import javax.swing.*;

public class PedirReembolso {
    public static void processarReembolso() {
        String resposta = JOptionPane.showInputDialog(null, "A peça ainda está lacrada? (Sim/Não):", "Reembolso",
                JOptionPane.INFORMATION_MESSAGE).toLowerCase();

        if (resposta.equals("sim")) {
            JOptionPane.showMessageDialog(null, "Seu dinheiro será reembolsado assim que enviar a peça de volta.");
        } else if (resposta.equals("não")) {
            JOptionPane.showMessageDialog(null, "Devolução negada.");
        } else {
            JOptionPane.showMessageDialog(null, "Resposta inválida. Por favor, escolha 'Sim' ou 'Não'.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> processarReembolso());
    }
}
