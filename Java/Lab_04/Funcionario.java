package Lab_04;

public class Funcionario {
    protected String nome;
    protected int matricula;
    protected double salario;
    protected Funcionario chefe;

    public Funcionario(String n, int m, double s, Funcionario c) {
        nome = n;
        matricula = m;
        salario = s;
        chefe = c;
    }

    public double bonus(Trimestre t) {
        return salario * 0.1;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return false;
        }
        if(!(obj instanceof Funcionario)) {
            return false;
        }
        Funcionario f = (Funcionario) obj;
        return nome.equals(f.getNome());
    }

}

