import java.util.ArrayList;
import java.util.List;

public class VeiculoBrasileiro {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;
    private List<String> pecas; 

    public VeiculoBrasileiro(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.pecas = new ArrayList<>();
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    public List<String> getPecas() {
        return pecas;
    }

    public void adicionarPeca(String peca) {
        pecas.add(peca);
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " - Ano " + ano + " - Preço: R$" + preco;
    }
}
