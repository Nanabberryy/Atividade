class Cachorro extends Mamifero {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Cachorro late.");
    }
}
