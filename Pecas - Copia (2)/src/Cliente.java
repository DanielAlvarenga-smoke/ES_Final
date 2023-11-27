public class Cliente implements Usuario {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void entrar() {
        System.out.println("Bem-vindo como cliente!");
    }
}
