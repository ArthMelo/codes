package Lab_06;
import java.util.Random;

public class FactoryCarta {
    public static Carta createCarta() {
        Carta carta = null;
        Random rand = new Random();
        Carta.Naipe meunaipe = Carta.Naipe.values()[rand.nextInt(Carta.Naipe.values().length)];
        Numero meunumero = Numero.values()[rand.nextInt(Numero.values().length)];
        carta = new Carta(meunumero, meunaipe);
        return carta;
    }
}
