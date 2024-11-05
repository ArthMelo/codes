package Lab_07;
public class Casa {
    private String endereco;
    private boolean donoEstaEmCasa = true;
    private Comodo[] meusComodos = new Comodo[2];

    private class Comodo{
        public String nome;
        public Camera minhaCamera;
        public Comodo(String nome){
            this.nome = nome;
            minhaCamera = new Camera();
        }
    }

    public Casa(String end){
        endereco = end;
        meusComodos[0] = new Comodo("Sala");
        meusComodos[1] = new Comodo("Quarto");
    }
    public boolean movimentacao(){
        boolean algoSeMexeu = false;
        for (int i = 0; i < meusComodos.length; i++) {
            if (meusComodos[i].minhaCamera.haMovimento())
                algoSeMexeu = true;

        }
        return algoSeMexeu;
    }

    public void setDonoEstaEmCasa(boolean estaEmCasa){
        this.donoEstaEmCasa = estaEmCasa;
    }

    public boolean getDonoEstaEmCasa(){
        return donoEstaEmCasa;
    }
}