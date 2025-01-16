import java.util.*;
import javax.swing.JOptionPane;

public class CadastrarLivro {

    Scanner scanner = new Scanner(System.in);
    private String titulo;
    private ArrayList<String> autores = new ArrayList<String>();
    private String genero;
    private int isbn;

    public CadastrarLivro() {
        titulo = JOptionPane.showInputDialog("Informe o título do livro: ");
        genero = JOptionPane.showInputDialog("Informe o gênero do livro: ");
        String aux = JOptionPane.showInputDialog("Informe o ISBN do livro: ");
        isbn = Integer.parseInt(aux);
        int opcao;
        int resposta;
        do {
            String autor;
            autor = JOptionPane.showInputDialog("Informe o autor do livro: ");
            autores.add(autor);
            String auxiliar = JOptionPane.showInputDialog("Há mais autores no livro? (1- SIM | 2 - NÃO): ");
            opcao = Integer.parseInt(auxiliar);
        } while (opcao != 2);
    }
    
    public void exibirLivro() {
        System.out.println("Título do livro: " + titulo);
        System.out.println("Gênero do livro: " + genero);
        System.out.println("ISBN do livro: " + isbn);
        System.out.println("Autor(es) do livro: " + autores);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}