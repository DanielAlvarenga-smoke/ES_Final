import javax.swing.*;

public class AcessarManual {
    public void executar() {
        String[] opcoes = {"Manual de Funcionamento", "Manual de Instalação"};
        int escolhaManual = JOptionPane.showOptionDialog(null, "Qual tipo de manual deseja escolher?",
                "Acessar Manual", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if (escolhaManual == 0) {
            JOptionPane.showMessageDialog(null, "O manual de funcionamento foi enviado para o seu e-mail.");
        } else if (escolhaManual == 1) {
            JOptionPane.showMessageDialog(null, "O manual de instalação foi enviado para o seu e-mail.");
        } else {
            JOptionPane.showMessageDialog(null, "Escolha inválida.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AcessarManual().executar());
    }
}
