package P2_2024_1;

public class Configuracao {
    // Freq. de cada núcleo, em GHz:
    public final double clock;
    public final int n; // Total de núcleos
    public final int r; // Total de RAM, em GB

    public Configuracao(double ck, int n, int r) {
        clock = ck; this.n = n; this.r = r;
    }
}