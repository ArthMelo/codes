package Lab_06;
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Carta> minhasCartas = new ArrayList(5);
        Pontuacao pontuacao = Pontuacao.getPontuacao();
        for (int i = 0; i < 5; i++) {
            Carta carta = FactoryCarta.createCarta();
            minhasCartas.add(carta);
            pontuacao.ganhaPontos(10);
        }

        System.out.println("Mão do jogador:");
        for (Carta carta : minhasCartas) {
            System.out.println(carta.imprimir());
        }
        System.out.println(pontuacao.getPontuacao());
    }
}
