package Lab_10;

import java.util.ArrayList;
public class lab10 {
    public static void main(String[] args) {
        ArrayList<Pessoa> grupo = new ArrayList<Pessoa>();
        Pessoa r = new Pessoa("Ronald");
        Pessoa a = new Pessoa("Ana");
        Pessoa alguem = r;
        grupo.add(new Pessoa("Jose"));
        grupo.add(r);
        grupo.add(alguem);
        grupo.add(a);
        r = null;
        grupo.set(2, null);
        System.out.println("Grupo atual:");
        for (Pessoa p : grupo) {
            if(p == null) System.out.println("null ");
            else System.out.println(p.getNome());
        }
        grupo = null; //Quantos objetos e quantas variáveis ainda existirão aqui?
        //(... mais código...)
        System.out.println("Grupo atual:");
        System.out.println(alguem.getNome());
    }
}