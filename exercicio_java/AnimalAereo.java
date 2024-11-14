

public class AnimalAereo extends Animal {
    // Atributo específico para animais aéreos
    private double envergaduraAsas;

    //Construtor sobrecarregado
    public AnimalAereo (String nome, double envergaduraAsas){
        super(nome); // Chama o construtor da classe base 
        this.envergaduraAsas = envergaduraAsas;
    }

    public AnimalAereo(String nome, int idade, String tipoAlimentacao, double envergaduraAsas) {
        super(nome, idade, tipoAlimentacao); // Chama o construtor da classe base
        this.envergaduraAsas = envergaduraAsas;
    }

    //Sobrescrita do método emitirSom
    @Override
    public void emitirSom(){
        System.out.println("O animal aéreo está piando ou vocalizando.");
    }

    //Método para exibir informações do animal aéreo
    @Override
    public void exibirInfo(){
        super.exibirInfo(); // Exibe informações gerais
        System.out.println("Envergadura das asas: " + envergaduraAsas + "metros");
    }
}