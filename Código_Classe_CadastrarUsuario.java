import java.util.*;
import javax.swing.JOptionPane;

public class CadastrarUsuario {

    private int senha;
    private String nome;
    private String email;
    private ArrayList<String> telefones = new ArrayList<String>();
    private String dataNascimento;
    private String endereco;

    public CadastrarUsuario() {
        nome = JOptionPane.showInputDialog("Digite o nome do usuário: ");
        email = JOptionPane.showInputDialog("Digite o e-mail do usuário: ");
        String aux = JOptionPane.showInputDialog("Digite a senha do usuário: ");
        senha = Integer.parseInt(aux);
        int opcao;
        do {
            String telefone;
            telefone = JOptionPane.showInputDialog("Digite o telefone do usuário: ");
            telefones.add(telefone);
            String auxiliar = JOptionPane.showInputDialog("Há mais telefones do usuário ? (1 - SIM | 2 - NÃO) : ");
opcao = Integer.parseInt(auxiliar);
        } while (opcao != 2);
        dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento usuário: ");
        endereco = JOptionPane.showInputDialog("Digite o endereço do usuário: ");
    }

    public void exibirUsuario() {
        System.out.println("Nome do usuário: " + nome);
        System.out.println("E-mail do usuário: " + email);
        System.out.println("Telefone(s) do usuário: " + telefones);
        System.out.println("Data de nascimento do usuário: " + dataNascimento);
        System.out.println("Endereco do usuário: " + endereco);
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<String> telefones) {
        this.telefones = telefones;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}