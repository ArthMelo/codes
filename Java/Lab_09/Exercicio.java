package ronaldete;

public class Exercicio {
    public static void metodo1() {
        try {
            System.out.println("\tinicio do metodo1");
            Exercicio.metodo2();
            System.out.println("\tfim do metodo1");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("\tExceção \"índice fora do limite\" capturada");
        }
    }

    public static void metodo2() {
        try {
            System.out.println("\t\tinicio do metodo2");
            Exercicio.metodo3();
            System.out.println("\t\tfim do metodo2");
        } catch (NullPointerException e) {
            System.out.println("\t\tExceção ponteiro nulo capturada");
        }
    }

    public static void metodo3() {
        try {
            System.out.println("\t\t\tinicio do metodo3");
//            Driver.lista[0] = Driver.lista[4];
            System.out.println("\t\t\tfim do metodo3");
        } catch (ArithmeticException e) {
            System.out.println("\t\t\tExceção erro aritmético capturada");
        }
    }
}
