package Lab_08;

import java.util.*;
public class Pedido {
    private Conveniado p;
    private class Item {
        public Desejo d;
        public Item(Desejo d){
            this.d = d;
        }
    }
    private ArrayList<Item> itens;
    public Pedido(ArrayList<Desejo> oQueOClienteQuer, Conveniado deOnde){
        p = deOnde;
        itens = new ArrayList<>();
        for(Desejo desejo : oQueOClienteQuer) {
            itens.add(new Item(desejo));
        }
    }
}