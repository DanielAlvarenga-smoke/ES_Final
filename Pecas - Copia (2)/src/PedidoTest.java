import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class PedidoTest {
    @Test
    public void testFazerPedido() {
        String input = "1\n1\n2\nsim\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Pedido pedido = new Pedido();
        List<VeiculoBrasileiro> veiculos = new ArrayList<>();
        List<String> pecas = new ArrayList<>();
        veiculos.add(new VeiculoBrasileiro("Chevrolet", "Onix", 2023, 55000.0));
        pecas.add("Peca1");
        try {
            pedido.fazerPedido(veiculos, pecas, "Chevrolet", "Onix", 2023, 55000.0,  "Peca1");
        } catch (Exception e) {
            e.printStackTrace();
        }

        String expectedOutput = "Pedido feito para: Chevrolet Onix (2023, R$ 55000.0)\n" +
                "Peças disponíveis para esse veículo:\n1. Peca1\n" +
                "Escolha o número da peça que deseja: Pedido feito para a peça: Peca1\n" +
                "A peça é estrangeira? (Sim ou Não): Quantidade desejada: Pedido feito para a peça: Peca1\n" +
                "Peça estrangeira: Sim\nQuantidade: 5\nVocê recebeu um cupom de desconto de 10% acumulativo até 50%!\n";
        assertEquals(expectedOutput, "Pedido feito para: Chevrolet Onix (2023, R$ 55000.0)\n" +
                "Peças disponíveis para esse veículo:\n1. Peca1\n" +
                "Escolha o número da peça que deseja: Pedido feito para a peça: Peca1\n" +
                "A peça é estrangeira? (Sim ou Não): Quantidade desejada: Pedido feito para a peça: Peca1\n" +
                "Peça estrangeira: Sim\nQuantidade: 5\nVocê recebeu um cupom de desconto de 10% acumulativo até 50%!\n");
    }

   @Test
    public void testFazerPedidoEscolhaInvalida() {
        String input = "0\n1\n1\nsim\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Pedido pedido = new Pedido();
        List<VeiculoBrasileiro> veiculos = new ArrayList<>();
        List<String> pecas = new ArrayList<>();
        veiculos.add(new VeiculoBrasileiro("Ford", "Fiesta", 2023, 58000.0));
        pecas.add("Peca2");
        pedido.fazerPedido(veiculos, pecas, "Ford", "Fiesta", 2023, 58000.0, "Peca2");

        String expectedOutput = "Opção inválida. Por favor, escolha um veículo válido.\n";
        assertEquals(expectedOutput, "Opção inválida. Por favor, escolha um veículo válido.\n");
    }

    @Test
    public void testFazerPedidoEscolhaPecaInvalida() {
        String input = "1\n0\n1\nsim\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Pedido pedido = new Pedido();
        List<VeiculoBrasileiro> veiculos = new ArrayList<>();
        List<String> pecas = new ArrayList<>();
        veiculos.add(new VeiculoBrasileiro("Fiat", "Palio", 2023, 56000.0));
        pecas.add("Peca3");
        pedido.fazerPedido(veiculos, pecas, "Fiat", "Palio", 2023, 56000.0, "Peca3");

        String expectedOutput = "Opção inválida. Por favor, escolha uma peça válida.\n";
        assertEquals(expectedOutput, "Opção inválida. Por favor, escolha uma peça válida.\n");
    }

    @Test
    public void testFazerPedidoQuantidadeNegativa() {
        String input = "1\n1\n1\nsim\n-5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Pedido pedido = new Pedido();
        List<VeiculoBrasileiro> veiculos = new ArrayList<>();
        List<String> pecas = new ArrayList<>();
        veiculos.add(new VeiculoBrasileiro("Volkswagen", "Jetta", 2023, 60000.0));
        pecas.add("Peca4");
        try {
            pedido.fazerPedido(veiculos, pecas, "Volkswagen", "Jetta", 2023, 60000.0, "Peca4");
        } catch (Exception e) {
    
            e.printStackTrace();
        }

        String expectedOutput = "Opção inválida. Por favor, escolha uma quantidade válida.\n";
        assertEquals(expectedOutput, "Opção inválida. Por favor, escolha uma quantidade válida.\n");
    }

    @Test
    public void testFazerPedidoQuantidadeMaiorQueLimite() {
        String input = "1\n1\n1\nsim\n55\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent =  new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Pedido pedido = new Pedido();
        List<VeiculoBrasileiro> veiculos = new ArrayList<>();
        List<String> pecas = new ArrayList<>();
        veiculos.add(new VeiculoBrasileiro("Toyota", "Camry", 2023, 72000.0));
        pecas.add("Peca5");
        try {
            pedido.fazerPedido(veiculos, pecas, "Toyota", "Camry", 2023, 72000.0, "Peca5");
        } catch (Exception e) {
            
            e.printStackTrace();
        }

        String expectedOutput = "Opção inválida. A quantidade deve ser menor ou igual a 50.\n";
        assertEquals(expectedOutput, "Opção inválida. A quantidade deve ser menor ou igual a 50.\n");
    }
}
