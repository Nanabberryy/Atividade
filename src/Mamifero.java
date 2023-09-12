class Mamifero extends Animal {
    public Mamifero(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Mamifero faz algum som.");
    }
}
