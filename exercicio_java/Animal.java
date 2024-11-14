

public class Animal {
    //Atributos gerais para todos os animais
    protected String nome;
    protected int idade;
    protected String tipoAlimentacao;

    //Construtor sobrecarregado
    public Animal(String nome) {
        this.nome = nome;
        this.idade = 0;
        this.tipoAlimentacao = "Desconhecido";
    }

    public Animal (String nome, int idade, String tipoAlimentacao) {
        this.nome = nome;
        this.idade = idade;
        this.tipoAlimentacao = tipoAlimentacao;
    }

    // Método para emitir som (será sobrescrito)
    public void emitirSom() {
        System.out.println("O animal está emitindo um som genérico.");
    }

    //Método para exibir informações do animal
    public void exibirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Tipo de Alimentação: " + tipoAlimentacao);
    }
}