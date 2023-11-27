import java.util.ArrayList;
import java.util.List;

public class GestorVeiculosBrasileiros {
    private List<VeiculoBrasileiro> veiculosBrasileiros = new ArrayList<>();

    public GestorVeiculosBrasileiros() {
        inicializarVeiculos();
    }

    private void inicializarVeiculos() {
        veiculosBrasileiros.add(new VeiculoBrasileiro("Chevrolet", "Onix", 2023, 55000.0));
        veiculosBrasileiros.add(new VeiculoBrasileiro("Volkswagen", "Gol", 2023, 52000.0));
        veiculosBrasileiros.add(new VeiculoBrasileiro("Fiat", "Uno", 2023, 48000.0));
        veiculosBrasileiros.add(new VeiculoBrasileiro("Ford", "Ka", 2023, 54000.0));
        veiculosBrasileiros.add(new VeiculoBrasileiro("Renault", "Kwid", 2023, 46000.0));
        veiculosBrasileiros.add(new VeiculoBrasileiro("Toyota", "Corolla", 2023, 75000.0));
        veiculosBrasileiros.add(new VeiculoBrasileiro("Honda", "Civic", 2023, 80000.0));
        veiculosBrasileiros.add(new VeiculoBrasileiro("Nissan", "Kicks", 2023, 70000.0));
        veiculosBrasileiros.add(new VeiculoBrasileiro("Hyundai", "HB20", 2023, 56000.0));
        veiculosBrasileiros.add(new VeiculoBrasileiro("Kia", "Cerato", 2023, 77000.0));
        veiculosBrasileiros.add(new VeiculoBrasileiro("Jeep", "Renegade", 2023, 73000.0));
        veiculosBrasileiros.add(new VeiculoBrasileiro("Mitsubishi", "Outlander", 2023, 90000.0));
        veiculosBrasileiros.add(new VeiculoBrasileiro("Subaru", "Forester", 2023, 84000.0));
        veiculosBrasileiros.add(new VeiculoBrasileiro("Peugeot", "208", 2023, 59000.0));
        veiculosBrasileiros.add(new VeiculoBrasileiro("Citroën", "C3", 2023, 58000.0));
        veiculosBrasileiros.add(new VeiculoBrasileiro("Audi", "A3", 2023, 98000.0));
        veiculosBrasileiros.add(new VeiculoBrasileiro("BMW", "Série 3", 2023, 110000.0));
        veiculosBrasileiros.add(new VeiculoBrasileiro("Mercedes-Benz", "Classe C", 2023, 115000.0));
        veiculosBrasileiros.add(new VeiculoBrasileiro("Lexus", "UX 200", 2023, 94000.0));
        veiculosBrasileiros.add(new VeiculoBrasileiro("Volvo", "XC40", 2023, 99000.0));
    }

    public List<VeiculoBrasileiro> getVeiculosBrasileiros() {
        return veiculosBrasileiros;
    }
}
