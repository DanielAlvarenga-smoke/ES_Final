import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Usuario> usuarios = new ArrayList<>();

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário " + usuario.getNome() + " adicionado ao sistema.");
    }

    public void entrar(Usuario usuario) {
        usuario.entrar();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
