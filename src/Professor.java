class Professor extends Pessoa {
    public Professor(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void falar() {
        System.out.println("Professor ensina.");
    }
}
