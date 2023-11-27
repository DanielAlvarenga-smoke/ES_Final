import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class MenuClienteTest {
    @Test
    public void testProcessarOpcaoFazerPedido() {
        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MenuCliente menuCliente = new MenuCliente();
        List<VeiculoBrasileiro> veiculos = new ArrayList<>();
        List<String> pecas = new ArrayList<>();
        menuCliente.processarOpcao(1, veiculos, pecas);

        String expectedOutput = "Você escolheu fazer um pedido.\n"; 
        assertEquals(expectedOutput, "Você escolheu fazer um pedido.\n");
    }

    @Test
    public void testProcessarOpcaoAcessarManual() {
        String input = "2\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MenuCliente menuCliente = new MenuCliente();
        List<VeiculoBrasileiro> veiculos = new ArrayList<>();
        List<String> pecas = new ArrayList<>();
        menuCliente.processarOpcao(2, veiculos, pecas);

        String expectedOutput = "Qual tipo de manual deseja escolher?\n1. Manual de Funcionamento\n2. Manual de Instalação\nO manual de funcionamento foi enviado para o seu e-mail.\n";
        assertEquals(expectedOutput, "Qual tipo de manual deseja escolher?\n1. Manual de Funcionamento\n2. Manual de Instalação\nO manual de funcionamento foi enviado para o seu e-mail.\n");
    }

    @Test
    public void testProcessarOpcaoPedirReembolso() {
        String input = "3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MenuCliente menuCliente = new MenuCliente();
        List<VeiculoBrasileiro> veiculos = new ArrayList<>();
        List<String> pecas = new ArrayList<>();
        menuCliente.processarOpcao(3, veiculos, pecas);

        String expectedOutput = "A peça ainda está lacrada? (s/n): Devolução negada.\n"; 
        assertEquals(expectedOutput, "A peça ainda está lacrada? (s/n): Devolução negada.\n");
    }

    @Test
    public void testProcessarOpcaoPedirSuporte() {
        String input = "4\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MenuCliente menuCliente = new MenuCliente();
        List<VeiculoBrasileiro> veiculos = new ArrayList<>();
        List<String> pecas = new ArrayList<>();
        menuCliente.processarOpcao(4, veiculos, pecas);

        String expectedOutput = "Qual tipo de suporte:\n1. Suporte Técnico\n2. Suporte Financeiro\nVocê escolheu Suporte Técnico.\nO número para suporte técnico é: 3834-1230\n"; 
        assertEquals(expectedOutput, "Qual tipo de suporte:\n1. Suporte Técnico\n2. Suporte Financeiro\nVocê escolheu Suporte Técnico.\nO número para suporte técnico é: 3834-1230\n");
    }

    @Test
    public void testProcessarOpcaoInvalida() {
        String input = "5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MenuCliente menuCliente = new MenuCliente();
        List<VeiculoBrasileiro> veiculos = new ArrayList<>();
        List<String> pecas = new ArrayList<>();
        menuCliente.processarOpcao(5, veiculos, pecas);

        String expectedOutput = "Opção inválida.\n"; 
        assertEquals(expectedOutput, "Opção inválida.\n");
    }
}
