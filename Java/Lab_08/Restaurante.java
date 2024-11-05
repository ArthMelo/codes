package Lab_08;

public class Restaurante implements Conveniado{
    private final String CNPJ;
    private final String nome;

    public Restaurante(String CNPJ, String nome){
        this.CNPJ = CNPJ;
        this.nome = nome;
    }
    @Override
    public String getNome(){
        return nome;
    }

}