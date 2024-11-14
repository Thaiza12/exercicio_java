

public class AnimalTerrestre extends Animal {
    //Atributo específico para animais terrestres
    private int numeroPatas;

    // Construtor sobrecarregado
    public AnimalTerrestre(String nome, int numeroPatas) {
        super(nome); // Chama o construtor da classe base
        this.numeroPatas = numeroPatas;
    }

    public AnimalTerrestre (String nome, int idade, String tipoAlimentacao, int numeroPatas){
        super(nome, idade, tipoAlimentacao); // Chama o construtor da classe base
        this.numeroPatas = numeroPatas;
    }

    //Sobrescrita do método emitirSom
    @Override
    public void emitirSom(){
        System.out.println("O animal terrestre está emitindo um som específico de sua espécie.");
    }

    //Método para exibir informações do animal terrestre
    @Override
    public void exibirInfo(){
        super.exibirInfo(); //Exibe informações gerais
        System.out.println("Número de patas: " + numeroPatas);
    }
}