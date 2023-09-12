import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Menu:");
            System.out.println("1. Criar e interagir com um Animal");
            System.out.println("2. Criar e interagir com uma Pessoa");
            System.out.println("3. Criar e interagir com um Funcionario");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do animal: ");
                    String nomeAnimal = scanner.next();
                    System.out.print("Digite a idade do animal: ");
                    int idadeAnimal = scanner.nextInt();

                    Animal animal = new Animal(nomeAnimal, idadeAnimal);
                    System.out.println("Nome: " + animal.getNome());
                    System.out.println("Idade: " + animal.getIdade());
                    animal.fazerBarulho();
                    break;
                case 2:
                    System.out.print("Digite o nome da pessoa: ");
                    String nomePessoa = scanner.next();
                    System.out.print("Digite a idade da pessoa: ");
                    int idadePessoa = scanner.nextInt();

                    Pessoa pessoa = new Pessoa(nomePessoa, idadePessoa);
                    System.out.println("Nome: " + pessoa.getNome());
                    System.out.println("Idade: " + pessoa.getIdade());
                    pessoa.falar();
                    break;
                case 3:
                    System.out.print("Digite o nome do funcionario: ");
                    String nomeFuncionario = scanner.next();
                    System.out.print("Digite a idade do funcionario: ");
                    int idadeFuncionario = scanner.nextInt();

                    Funcionario funcionario = new Funcionario(nomeFuncionario, idadeFuncionario);
                    System.out.println("Nome: " + funcionario.getNome());
                    System.out.println("Idade: " + funcionario.getIdade());
                    funcionario.trabalhar();
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção invalida. Tente novamente.");
                    break;
            }
        } while (escolha != 0);

        scanner.close();
    }
}