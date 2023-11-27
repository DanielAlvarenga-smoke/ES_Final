import javax.swing.*;

public class PedirSuporte {
    public void executar() {
        String[] opcoes = {"Suporte Técnico", "Suporte Financeiro"};
        int escolhaSuporte = JOptionPane.showOptionDialog(null, "Escolha o tipo de suporte:",
                "Pedir Suporte", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        switch (escolhaSuporte) {
            case 0:
                JOptionPane.showMessageDialog(null, "Você escolheu Suporte Técnico.\nO número para suporte técnico é: 3834-1230");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Você escolheu Suporte Financeiro.\nO número para suporte financeiro é: 3834-1129");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PedirSuporte().executar());
    }
}
