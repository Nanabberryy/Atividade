class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void fazerBarulho() {
        System.out.println("Animal faz algum som.");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
