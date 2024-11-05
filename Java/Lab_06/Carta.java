package Lab_06;

public class Carta implements Printavel {

    public enum Naipe {
        OUROS,
        ESPADAS,
        PAUS,
        COPAS;
    }

    Numero numeroCarta;
    Naipe naipeCarta;

    public Carta(Numero numeroCarta, Naipe naipeCarta) {
        this.numeroCarta = numeroCarta;
        this.naipeCarta = naipeCarta;
    }

    public String imprimir() {
        return (this.numeroCarta + " de " + this.naipeCarta);
    }

}
