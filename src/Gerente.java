class Gerente extends Funcionario {
    public Gerente(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void trabalhar() {
        System.out.println("Gerente gerencia.");
    }
}
