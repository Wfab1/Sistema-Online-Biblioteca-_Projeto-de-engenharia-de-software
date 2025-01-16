import java.util.*;
import javax.swing.JOptionPane;

public class CadastrarExemplarLivro {

    private int codigo;
    private String titulo;
    private ArrayList<String> autores = new ArrayList<String>();
    private String genero;

    public CadastrarExemplarLivro() {
        titulo = JOptionPane.showInputDialog("Digite o título do exemplar de livro: ");
        genero = JOptionPane.showInputDialog(
        "Digite o gênero do exemplar de livro:");
String aux = JOptionPane.showInputDialog(
        "Digite o código do exemplar de livro: ");
codigo = Integer.parseInt(aux);
        int opcao;
        do {
            String autor;
            autor = JOptionPane.showInputDialog(
            "Digite o autor do exemplar de livro: ");
autores.add(autor);
            String auxiliar = JOptionPane.showInputDialog("Há mais autores no livro? (1- SIM | 2 - NÃO): ");
opcao = Integer.parseInt(auxiliar);
        } while (opcao != 2);
    }

    public void exibirExemplarLivro() {
        System.out.println("Código do exemplar de livro: " + codigo);
        System.out.println("Título do exemplar de livro: " + titulo);
        System.out.println("Gênero do exemplar de livro: " + genero);
        System.out.println("Autor(es) do exemplar de livro: " + autores);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }
}