package P2_2024_1;
import java.util.ArrayList;

public class Servidor {
    private static Servidor instance;
    private final Configuracao c;
    private Alocacao a;
    private ArrayList<VM> vms;
    private Servidor(){
        c = new Configuracao(3.0, 128, 512);
        a = new Alocacao(0, 0);
        vms = new ArrayList<>();
    }
    public static Servidor getServidor(){
        if(instance == null){
            instance = new Servidor();
        }
        return instance;
    }

    public void alocar(VM vm) throws SemRecursosExceptions{
        if(a.n+vm.a.n > c.n || a.r+vm.a.r > c.r ){
            throw new SemRecursosExceptions();
        }
        else {
            a.n += vm.a.n;
            a.r += vm.a.r;
            vms.add(vm);
        }
    }

}
