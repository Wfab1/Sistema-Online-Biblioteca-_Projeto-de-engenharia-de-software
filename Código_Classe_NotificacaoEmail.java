import java.util.*;
import javax.swing.JOptionPane;

public class NotificacaoEmail {
    private String emailUsuario;
    private String tituloLivro;

    public NotificacaoEmail() {
        emailUsuario = JOptionPane.showInputDialog("Informe o email do usuário: ");
        tituloLivro = JOptionPane.showInputDialog("Informe o título do livro: ");
    }
    public void notificarEmprestimo() {
        String assunto = "Empréstimo de Livro - Biblioteca";
        String mensagem = "Olá, você realizou o empréstimo do livro: " + tituloLivro +
                          "\nPor favor, devolva-o no prazo estipulado. \nAtenciosamente, biblioteca";
        JOptionPane.showInputDialog("O email enviado foi "+assunto+"\n"+mensagem);
    }
    
    public void notificarDevolucao() {
        String assunto = "Devolução de Livro - Biblioteca";
        String mensagem = "\nOlá,confirmamos a devolução do livro: " + tituloLivro  +
                          "\nObrigado por utilizar nossos serviços! \nAtenciosamente, biblioteca";
        JOptionPane.showInputDialog("O email enviado foi "+assunto+"\n"+mensagem);
    }
    public void lembrarDevolucao() {
        String assunto = "Lembrete de Devolução de Livro - Biblioteca";
        String mensagem = "\nOlá, este é um lembrete para devolver o livro: " + tituloLivro  +
                          "\nPor favor, devolva-o o mais rápido possível para evitar problemas no futuro. \nAtenciosamente, biblioteca";
        JOptionPane.showInputDialog("O email enviado foi "+assunto+"\n"+mensagem);
    }
}