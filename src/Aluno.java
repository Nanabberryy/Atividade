class Aluno extends Pessoa {
    public Aluno(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void falar() {
        System.out.println("Aluno aprende.");
    }
}
