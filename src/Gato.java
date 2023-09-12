class Gato extends Mamifero {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Gato mia.");
    }
}
