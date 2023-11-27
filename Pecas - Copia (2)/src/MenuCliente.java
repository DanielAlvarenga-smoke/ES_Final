import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuCliente {

    private Scanner scanner;

    public MenuCliente() {
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        System.out.println("Opções do Cliente:");
        System.out.println("1. Fazer pedido");
        System.out.println("2. Acessar manual");
        System.out.println("3. Pedir reembolso");
        System.out.println("4. Pedir suporte");
    }

    public void processarOpcao(int opcao, List<VeiculoBrasileiro> veiculos, List<String> pecas) {
        switch (opcao) {
            case 1:
                System.out.println("Você escolheu fazer um pedido.");
                Pedido pedido = new Pedido();
                pedido.fazerPedido(veiculos, pecas, null, null, opcao, opcao, null);
                break;

            case 2:
                AcessarManual acessarManual = new AcessarManual();
                acessarManual.executar();
                break;

            case 3:
                System.out.println("Você escolheu pedir reembolso.");
                PedirReembolso.processarReembolso();
                break;

            case 4:
            System.out.println("Você escolheu pedir suporte.");
            PedirSuporte pedirSuporte = new PedirSuporte();
            pedirSuporte.executar();
            break;
                
            default:
                System.out.println("Opção inválida.");
        }
    }
}