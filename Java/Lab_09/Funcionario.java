package Lab_09;

public class Funcionario {
    private String nome;
    private String cargo;
    private int matricula;
    private int idade;
    private Funcionario chefe;
    private double salario;

    public Funcionario(String nome, String cargo, int matricula, int idade, Funcionario chefe, double salario)
    {
        this.nome = nome;
        this.cargo = cargo;
        this.matricula = matricula;
        this.idade = idade;
        this.chefe = chefe;
        this.salario = salario;

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getChefe() {
        return chefe.getNome();
    }

    public void setChefe(Funcionario chefe) throws ChefeInvalidoException{
        if(chefe == this) {
            throw new ChefeInvalidoException();
        }
        this.chefe = chefe;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean mesmaChefia(Funcionario f) {
        return false;

    }
}
