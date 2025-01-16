import java.util.*;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int opcao = 1;
        String aux;
        int op;
        int opcao2;
        String auxiliar;
        String auxiliar2;
        ArrayList<CadastrarLivro> livros = new ArrayList<CadastrarLivro>();
        ArrayList<CadastrarExemplarLivro> exemplares = new ArrayList<CadastrarExemplarLivro>();
        ArrayList<CadastrarUsuario> cadastrarUsuarios = new ArrayList<CadastrarUsuario>();
        ArrayList<EmprestarLivro> emprestarLivros = new ArrayList<EmprestarLivro>();
        ArrayList<DevolverLivro> devolverLivros = new ArrayList<DevolverLivro>();
        while (opcao != 0) {
            aux = JOptionPane.showInputDialog("\nMENU:"
                    + "\n1- Cadastrar Livro."
                    + "\n2- Cadastrar Exemplar de Livro."
                    + "\n3-  Cadastrar Usuário."
                    + "\n4- Notificação por email."
                    + "\n5- Emprestar Livro."
                    + "\n6- Controle histórico dos empréstimos."
                    + "\n7- Devolver Livro."
                    + "\n0- Sair."
                    + "\nEscolha uma opção: ");
            opcao = Integer.parseInt(aux);
            if (opcao == 1) {
                JOptionPane.showInputDialog("Cadastrando novo(s) livro(s).");
                do {
                    CadastrarLivro cadastrarLivro = new CadastrarLivro();
                    livros.add(cadastrarLivro);
                    auxiliar = JOptionPane.showInputDialog("\nHá mais livros para cadastrar? (1-SIM | 2 - NÃO) ");
                    op = Integer.parseInt(auxiliar);
                } while (op != 2);
                System.out.println("Exibindo livros cadastrados...\n");
                for (int i = 0; i < livros.size(); i++) {
                    livros.get(i).exibirLivro();
                }
            } else if (opcao == 2) {
                JOptionPane.showInputDialog("Cadastrando novo(s) exemplar(es) de livro(s).");
                do {
                    CadastrarExemplarLivro cadastrarExemplarLivro = new CadastrarExemplarLivro();
                    exemplares.add(cadastrarExemplarLivro);
                    auxiliar = JOptionPane.showInputDialog("\nHá mais exemplares para cadastrar? (1-SIM | 2 - NÃO) ");
                    op = Integer.parseInt(auxiliar);
                } while (op != 2);
                System.out.println("Exibindo exemplares cadastrados...\n");
                for (int i = 0; i < exemplares.size(); i++) {
                    exemplares.get(i).exibirExemplarLivro();
                }
            } else if (opcao == 3) {
                JOptionPane.showInputDialog("Cadastrando novo(s) usuário(s) da biblioteca.");
                do {
                    CadastrarUsuario cadastrarUsuario = new CadastrarUsuario();
                    cadastrarUsuarios.add(cadastrarUsuario);
                    auxiliar = JOptionPane.showInputDialog("\nHá mais usuários para cadastrar? (1-SIM | 2 - NÃO) ");
                    op = Integer.parseInt(auxiliar);
                } while (op != 2);
                System.out.println("Exibindo usuários cadastrados...\n");
                for (int i = 0; i < exemplares.size(); i++) {
                    cadastrarUsuarios.get(i).exibirUsuario();
                }
            } else if (opcao == 4) {
                JOptionPane.showInputDialog("Notificação por email.");
                NotificacaoEmail notificacaoPorEmail = new NotificacaoEmail();
                auxiliar = JOptionPane.showInputDialog("Escolha um tipo de notificação."
                        + "\n1- Notificar empréstimo."
                        + "\n2- Notificar devolução."
                        + "\n3- Lembrar devolução."
                        + "\n0- Sair.");
                op = Integer.parseInt(auxiliar);
                if (op == 1) {
                    notificacaoPorEmail.notificarEmprestimo();
                } else if (op == 2) {
                    notificacaoPorEmail.notificarDevolucao();
                } else if (op == 4) {
                    notificacaoPorEmail.lembrarDevolucao();
                } else {
                    JOptionPane.showInputDialog("Escolha inválida!");
                }
            } else if (opcao == 5) {
                JOptionPane.showInputDialog("Emprestando livro(s)...");
                do {
                    EmprestarLivro emprestarLivro = new EmprestarLivro();
                    emprestarLivros.add(emprestarLivro);
                    auxiliar = JOptionPane.showInputDialog("\nHá mais livros para serem emprestados? (1-SIM | 2 - NÃO) ");
                    op = Integer.parseInt(auxiliar);
                } while (op != 2);
                auxiliar2 = JOptionPane.showInputDialog("Escolha uma opção."
                        + "\n1- Exibir confirmação de empréstimo."
                        + "\n2- Verificar empréstimo."
                        + "\n0- Sair.");
                opcao2 = Integer.parseInt(auxiliar2);
                if (opcao2 == 1) {
                    for (int i = 0; i < cadastrarUsuarios.size(); i++) {
                        for (int j = 0; j < emprestarLivros.size(); j++) {
                            if (cadastrarUsuarios.get(i).getSenha() == emprestarLivros.get(j).getSenha()) {
                                JOptionPane.showInputDialog("Empréstimo realizado com sucesso!");
                                emprestarLivros.get(i).exibirEmprestimo();
                            } else {
                                JOptionPane.showInputDialog("Senha incorreta!");
                            }
                        }
                    }
                } else if (opcao2 == 2) {
                    for (int i = 0; i < cadastrarUsuarios.size(); i++) {
                        for (int j = 0; j < emprestarLivros.size(); j++) {
                            if (cadastrarUsuarios.get(i).getSenha() == emprestarLivros.get(j).getSenha()) {
                                emprestarLivros.get(i).verificarEmprestimo();
                            } else {
                                JOptionPane.showInputDialog("Senha incorreta!");
                            }
                        }
                    }
                } else {
                    JOptionPane.showInputDialog("Opção inválida!");
                }
            } else if (opcao == 6) {
                for (int i = 0; i < emprestarLivros.size(); i++) {
                    emprestarLivros.get(i).exibirEmprestimo();
                }
            } else if (opcao == 7) {
                JOptionPane.showInputDialog("Devolvendo livro(s)...");
                do {
                    DevolverLivro devolverLivro = new DevolverLivro();
                    devolverLivros.add(devolverLivro);
                    auxiliar = JOptionPane.showInputDialog("\nHá mais livros para serem devolvidos? (1-SIM | 2 - NÃO) ");
                    op = Integer.parseInt(auxiliar);
                } while (op != 2);
                for (int i = 0; i < cadastrarUsuarios.size(); i++) {
                    for (int j = 0; j < devolverLivros.size(); j++) {
                        if (cadastrarUsuarios.get(i).getSenha() == devolverLivros.get(j).getSenha()) {
                            JOptionPane.showInputDialog("Devolução do livro " + devolverLivros.get(j).getTitulo() + " realizada com sucesso!");
                            for (int k = 0; k < emprestarLivros.size(); k++) {
                                for (int w = 0; w < devolverLivros.size(); w++) {
                                    if (devolverLivros.get(w).getTitulo().equalsIgnoreCase(emprestarLivros.get(k).getTituloLivro())) {
                                        emprestarLivros.remove(k);
                                    }
                                }
                            }
                        } else {
                            JOptionPane.showInputDialog("Senha incorreta!");
                        }
                    }
                }
            } else {
                JOptionPane.showInputDialog("Opção inválida!");
            }
        }
    }
}