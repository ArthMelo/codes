package Lab_08;
import java.util.*;

public class iFood {
    private ArrayList<Conveniado> parceiros = new ArrayList<Conveniado>();
    public Conveniado getParceiro(String nome){
        for(Conveniado c : parceiros){
            if (nome.equals(c.getNome())){
                return c;
            }
        }
        return null;
    }
    public iFood(){
        parceiros.add(new Restaurante("123456/0001", "Ronald's Pizza"));
        parceiros.add(new Restaurante("123456/0001", "Cantina Roninho da Massa"));
        parceiros.add(new Restaurante("123456/0001", "Lonaldo Comida Japonesa"));
    }
    public double desconto(Cliente c){
        //Implementar
        return 0;
    }
}
