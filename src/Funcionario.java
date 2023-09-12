class Funcionario {
    private String nome;
    private int idade;

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void trabalhar() {
        System.out.println("Funcionario trabalha.");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
