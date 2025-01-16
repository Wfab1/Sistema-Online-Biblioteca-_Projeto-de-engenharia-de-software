import java.util.*;
import javax.swing.JOptionPane;

public class DevolverLivro {

    private String titulo;
    private String nomeUsuario;
    private String dataDevolucao;
    private int senha;
    String aux;

    public DevolverLivro() {
       titulo = JOptionPane.showInputDialog("Informe o título do livro para a devolução: ");
       nomeUsuario = JOptionPane.showInputDialog("Informe o nome de usuário: ");
       dataDevolucao = JOptionPane.showInputDialog("Informe a data da devolução no formato xx/xx/xxxx: ");
       aux = JOptionPane.showInputDialog("Informe a senha: ");
       senha = Integer.parseInt(aux);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
}