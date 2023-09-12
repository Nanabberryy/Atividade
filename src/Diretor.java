class Diretor extends Funcionario {
    public Diretor(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void trabalhar() {
        System.out.println("Diretor direciona.");
    }
}
