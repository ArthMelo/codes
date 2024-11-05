package P2_2024_1;
import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        // Servidor com 3.0GHz, 128 núcleos e 512GB de RAM:
        Servidor s = Servidor.getServidor();
        Random rand = new Random();
        int demanda = rand.nextInt(100);
        try {
            for (int i = 0; i <= demanda; i++) {
                s.alocar(new LinuxVM(new Alocacao(8, 16)));
            }
        } catch (SemRecursosExceptions exceptions) {
            System.out.println("Nao há recursos");
        }
    }
}

