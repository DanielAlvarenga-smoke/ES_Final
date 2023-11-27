import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class AcessarManualTest {
    @Test
    public void testManualFuncionamento() {
        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        AcessarManual acessarManual = new AcessarManual();
        acessarManual.executar();

        String expectedOutput = "Qual tipo de manual deseja escolher?\n1. Manual de Funcionamento\n2. Manual de Instalação\nO manual de funcionamento foi enviado para o seu e-mail.\n";
        assertEquals(expectedOutput, "Qual tipo de manual deseja escolher?\n1. Manual de Funcionamento\n2. Manual de Instalação\nO manual de funcionamento foi enviado para o seu e-mail.\n");
    }

    @Test
    public void testManualInstalacao() {
        String input = "2\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        AcessarManual acessarManual = new AcessarManual();
        acessarManual.executar();

        String expectedOutput = "Qual tipo de manual deseja escolher?\n1. Manual de Funcionamento\n2. Manual de Instalação\nO manual de instalação foi enviado para o seu e-mail.\n";
        assertEquals(expectedOutput, "Qual tipo de manual deseja escolher?\n1. Manual de Funcionamento\n2. Manual de Instalação\nO manual de instalação foi enviado para o seu e-mail.\n");
    }

    @Test
    public void testEscolhaInvalida() {
        String input = "3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        AcessarManual acessarManual = new AcessarManual();
        acessarManual.executar();

        String expectedOutput = "Qual tipo de manual deseja escolher?\n1. Manual de Funcionamento\n2. Manual de Instalação\nEscolha inválida.\n";
        assertEquals(expectedOutput, "Qual tipo de manual deseja escolher?\n1. Manual de Funcionamento\n2. Manual de Instalação\nEscolha inválida.\n");
    }
}
