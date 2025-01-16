import javax.swing.JOptionPane;
import java.util.*;

public class EmprestarLivro {
    private String dataEmprestimo;
    private String dataDevolucao;
    private String nomeUsuario;
    private String tituloLivro;
    private String dataAtual;
    private int senha;
    String aux;

    Scanner leitura = new Scanner(System.in);

    public EmprestarLivro(){
        nomeUsuario = JOptionPane.showInputDialog("Informe o nome do usuário: ");
        tituloLivro = JOptionPane.showInputDialog("Informe o título do livro:  ");
        dataEmprestimo = JOptionPane.showInputDialog("Informe a data do empréstimo no formato xx/xx/xxxx:  ");
        dataDevolucao = JOptionPane.showInputDialog("Informe a data da devolução no formato xx/xx/xxxx:  ");
        aux = JOptionPane.showInputDialog("Informe a senha para realizar o empréstimo: ");
        senha = Integer.parseInt(aux);
    }
    
    public void exibirEmprestimo() {
            String mensagem = "\n";
            mensagem += "Usuário: " + nomeUsuario + "\n";
            mensagem += "Livro: " + tituloLivro + "\n";
            mensagem += "Data de Empréstimo: " + dataEmprestimo + "\n";
            mensagem += "Data de Devolução: " + dataDevolucao + "\n";

            JOptionPane.showMessageDialog(null, mensagem);
    }

    public void verificarEmprestimo() {
    dataAtual = JOptionPane.showInputDialog("Informe a data atual no formato DD/MM/AAAA:");

    if (this.dataEmprestimo != null) {
        
        if (dataAtual.length() == 10 && dataDevolucao.length() == 10) {
            
            String dataAtualFormatada = dataAtual.substring(6) + dataAtual.substring(3, 5) + dataAtual.substring(0, 2);
            String dataDevolucaoFormatada = dataDevolucao.substring(6) + dataDevolucao.substring(3, 5) + dataDevolucao.substring(0, 2);

            
            if (dataAtualFormatada.compareTo(dataDevolucaoFormatada) > 0) {
                JOptionPane.showMessageDialog(null, "O livro está atrasado! Data de devolução: " + dataDevolucao);
            } else {
                JOptionPane.showMessageDialog(null, "O livro está dentro do prazo de devolução.\nData de devolução: " + dataDevolucao);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Formato de data inválido. Use o formato DD/MM/AAAA.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Este livro não foi emprestado.");
    }
}

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }
    
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}