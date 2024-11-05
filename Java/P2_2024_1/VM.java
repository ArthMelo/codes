package P2_2024_1;

public abstract class VM {
    public final String so;
    public final Alocacao a;

    // Construtor da Máquina Virtual (VM):
    public VM(Alocacao meusRecursos, String s) {
        a = meusRecursos;
        so = s;
    }
}