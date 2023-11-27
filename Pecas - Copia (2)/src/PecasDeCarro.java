import java.util.ArrayList;
import java.util.List;

public class PecasDeCarro {

    private List<String> tiposDePecas;

    public PecasDeCarro() {
        tiposDePecas = new ArrayList<>();
        
        tiposDePecas.add("Motor");
        tiposDePecas.add("Transmissão");
        tiposDePecas.add("Suspensão");
        tiposDePecas.add("Freios");
        tiposDePecas.add("Correias");
        tiposDePecas.add("Velas de Ignição");
        tiposDePecas.add("Filtros de Óleo");
        tiposDePecas.add("Radiador");
        tiposDePecas.add("Pneus");
        tiposDePecas.add("Amortecedores");
        tiposDePecas.add("Bateria");
        tiposDePecas.add("Correia Dentada");
        tiposDePecas.add("Sensor de Oxigênio");
        tiposDePecas.add("Alternador");
        tiposDePecas.add("Embregem");
        tiposDePecas.add("Câmbio");
        tiposDePecas.add("Lâmpadas");
        tiposDePecas.add("Escapamento");
        tiposDePecas.add("Sistema de Direção");
        tiposDePecas.add("Radiador de Óleo");
        tiposDePecas.add("Sensor de Freios");
        tiposDePecas.add("Sensor de Temperatura");
        tiposDePecas.add("Filtro de Combustível");
        tiposDePecas.add("Sistema de Escape");
        tiposDePecas.add("Rolamentos");
        tiposDePecas.add("Sistema de Injeção de Combustível");
        tiposDePecas.add("Sistema Elétrico");
        tiposDePecas.add("Sensor de Velocidade");
        tiposDePecas.add("Rolamento de Roda");
        tiposDePecas.add("Filtro de Ar");
    }

    public List<String> getTiposDePecas() {
        return tiposDePecas;
    }

    public static void main(String[] args) {
        PecasDeCarro pecas = new PecasDeCarro();
        List<String> tiposDePecas = pecas.getTiposDePecas();

        System.out.println("Tipos de Peças de Carro:");
        for (String peca : tiposDePecas) {
            System.out.println(peca);
        }
    }
}
