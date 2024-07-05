package creational_patterns.builder;

public class Violao {
    String material;
    String tipo;
    int quantidadeDeCordas;
    boolean eletrico;

    public Violao(String material, int quantidadeDeCordas, String tipo, boolean eletrico) {
        this.material = material;
        this.quantidadeDeCordas = quantidadeDeCordas;
        this.tipo = tipo;
        this.eletrico = eletrico;
    }

    @Override
    public String toString() {
        return "Violao [material=" + material + ", tipo=" + tipo + ", quantidadeDeCordas=" + quantidadeDeCordas
                + ", eletrico=" + eletrico + "]";
    }

}
