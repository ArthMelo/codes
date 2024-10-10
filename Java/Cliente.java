package laboratorio;
import java.util.*;

public class Cliente {
	public int engajamento = 10;
	public String nome;
	public double desconto = 0;
	public Cliente(String nome){
	this.nome = nome;
	}
	public double fazerPedido(Conveniado deOnde, boolean queroDesconto){
	double total = 0;
	Random rand = new Random();
	int numItens = rand.nextInt(10);
	while(numItens == 0)
	numItens = rand.nextInt(10);
	ArrayList<Desejo> minhaLista = new ArrayList<>();
	for (int i = 0; i < numItens; i++) {
	minhaLista.add(new Desejo());
	total += minhaLista.get(i).preco;
	}
	if(queroDesconto){
	setDesconto();
	engajamento += 10;
	System.out.println("Pedido feito c desc - total: " + (total - desconto));
	return total - desconto;
	}
	else{
	System.out.println("Pedido feito s/ desc - total: " + (total - desconto));
	engajamento += 10;
	return total;
	}
	}
	public int meuEngajamento(){ return engajamento; }
	public double meuDesconto(){ return desconto; }
	private void setDesconto(double desconto){
		this.desconto = desconto;
	}

}
