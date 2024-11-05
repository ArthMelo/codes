package P2_2024_1;

public class FactoryVM {
    public static VM createVM(String tipo){
        VM vmRetorno = null;
        Alocacao meusRecursos = new Alocacao(1, 4);
        switch(tipo){
            case "Linux": new LinuxVM(meusRecursos);
            break;
            case "Windows": new WindowsVM(meusRecursos);
            break;
        }
        return vmRetorno;
    }
}
