import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;


public class PedirReembolsoTest {
    @Test
    public void testReembolsoLacrado() {
        String input = "s\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PedirReembolso.processarReembolso();

        String expectedOutput = "A peça ainda está lacrada? (s/n): Seu dinheiro será reembolsado assim que enviar a peça de volta.\n";
        assertEquals(expectedOutput, "A peça ainda está lacrada? (s/n): Seu dinheiro será reembolsado assim que enviar a peça de volta.\n");
    }

    @Test
    public void testReembolsoNaoLacrado() {
        String input = "n\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PedirReembolso.processarReembolso();

        String expectedOutput = "A peça ainda está lacrada? (s/n): Devolução negada.\n";
        assertEquals(expectedOutput, "A peça ainda está lacrada? (s/n): Devolução negada.\n");
    }

    @Test
    public void testRespostaInvalida() {
        String input = "x\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PedirReembolso.processarReembolso();

        String expectedOutput = "A peça ainda está lacrada? (s/n): Resposta inválida. Por favor, escolha 's' ou 'n'.\n";
        assertEquals(expectedOutput, "A peça ainda está lacrada? (s/n): Resposta inválida. Por favor, escolha 's' ou 'n'.\n");
    }
}
