import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class PedirSuporteTest {
    @Test
    public void testSuporteTecnico() {
        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Scanner scanner = new Scanner(System.in);
        PedirSuporte pedirSuporte = new PedirSuporte();
        pedirSuporte.executar();

        String expectedOutput = "Escolha o tipo de suporte:\n1. Suporte Técnico\n2. Suporte Financeiro\nVocê escolheu Suporte Técnico.\nO número para suporte técnico é: 3834-1230\n";
        assertEquals(expectedOutput,"Escolha o tipo de suporte:\n1. Suporte Técnico\n2. Suporte Financeiro\nVocê escolheu Suporte Técnico.\nO número para suporte técnico é: 3834-1230\n" );
    }

    @Test
    public void testSuporteFinanceiro() {
        String input = "2\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Scanner scanner = new Scanner(System.in);
        PedirSuporte pedirSuporte = new PedirSuporte();
        pedirSuporte.executar();

        String expectedOutput = "Escolha o tipo de suporte:\n1. Suporte Técnico\n2. Suporte Financeiro\nVocê escolheu Suporte Financeiro.\nO número para suporte financeiro é: 3834-1129\n";
        assertEquals(expectedOutput, "Escolha o tipo de suporte:\n1. Suporte Técnico\n2. Suporte Financeiro\nVocê escolheu Suporte Financeiro.\nO número para suporte financeiro é: 3834-1129\n");
    }

    @Test
    public void testOpcaoInvalida() {
        String input = "3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Scanner scanner = new Scanner(System.in);
        PedirSuporte pedirSuporte = new PedirSuporte();
        pedirSuporte.executar();

        String expectedOutput = "Escolha o tipo de suporte:\n1. Suporte Técnico\n2. Suporte Financeiro\nOpção inválida.\n";
        assertEquals(expectedOutput, "Escolha o tipo de suporte:\n1. Suporte Técnico\n2. Suporte Financeiro\nOpção inválida.\n");
    }
}
