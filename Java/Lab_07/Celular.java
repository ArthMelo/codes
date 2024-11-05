package Lab_07;
import java.util.ArrayList;

public class Celular implements Observer{
    private Casa casa;

    public Celular(Casa casa){
        this.casa = casa;
    }

    @Override
    public void update(boolean estaEmCasa){
        casa.setDonoEstaEmCasa(estaEmCasa);
        display();
    }

    public void display(){
        System.out.println("O estado de dono esta em casa foi alterado para: "+ casa.getDonoEstaEmCasa());
    }

}
