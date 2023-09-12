class Secretaria extends Funcionario {
    public Secretaria(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void trabalhar() {
        System.out.println("Secretaria organiza.");
    }
}
