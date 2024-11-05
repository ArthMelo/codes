package Lab_07;

public class Driver {
    public static void main(String[] args) {
        Casa c = new Casa("Rua do Ronald, 41");
        Celular celular = new Celular(c);
        CentralVigilancia central = new CentralVigilancia(c);
        central.addObserver(celular);

        central.vigiar();
        celular.update(true);
    }
}