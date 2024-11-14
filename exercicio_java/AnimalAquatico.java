

public class AnimalAquatico extends Animal {
    // Atributo específico para animais aquáticos
    private boolean temGuelras;

    //Construtor sobrecarregado
    public AnimalAquatico(String nome, boolean temGuelras) {
        super(nome); //Chama o construtor da classe base 
        this.temGuelras = temGuelras;
    }

    public AnimalAquatico (String nome, int idade, String tipoAlimentacao, boolean temGuelras){
        super(nome, idade, tipoAlimentacao); // Chama o construtor da classe base
        this.temGuelras = temGuelras;
    }

    //Sobrescrita do método emitirSom
    @Override
    public void emitirSom() {
        System.out.println("O animal aquático está fazendo bolhas!");
    }

    //Método para exibir informações do animal aquático
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Exibe informações gerais
        System.out.println("Tem guelras: " + (temGuelras ? "Sim" : "Não"));
    }
}