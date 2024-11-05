package Lab_04;

public class Driver {
    public static void main(String[] args) {
        Gerente jose = new Gerente("José", 2222, 10000, null);
        Funcionario eugenio = new Funcionario("Eugênio", 9999, 10000, jose);
        Trimestre t = Trimestre._3o;
        System.out.println("\nBônus de " + jose.getNome() + " no " + t + " trimestre:");
        System.out.println(jose.bonus(t));
        System.out.println("\nBônus de " + eugenio.getNome() + " no " + t + " trimestre:");
        System.out.println(eugenio.bonus(t));
    }
}
