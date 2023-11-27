public class Gerente implements Usuario {
    private String nome;
    private String senha;

    public Gerente(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void entrar() {
        System.out.println("Bem-vindo, Gerente " + nome + "!");
    }

    public boolean verificarSenha(String senha) {
        return this.senha.equals(senha);
    }
}
