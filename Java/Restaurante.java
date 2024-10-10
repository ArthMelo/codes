package laboratorio;

public class Restaurante implements Conveniado{
	private final String CNPJ;
	private final String nome;
	private double desconto;
	public Restaurante(String CNPJ, String nome){
	this.CNPJ = CNPJ;
	this.nome = nome;
	}
	@Override
	public String getNome(){
	return nome;
	}
	@Override
	public double update(double engajamento){
		desconto = engajamento*0.30;
		return desconto;
	}
	@Override
	public void solicitarupdate(Emissor cliente){
		cliente.notify(this, desconto);
	}
	
}
