package ronaldete;

public class Driver {

    public static void main(String[] args) {

    	Funcionario func1 = new Funcionario("Arthur", "Vagabundo", 1234, 19, null, 12000);
    	try {
			func1.setChefe(func1);
		} catch (ChefeInvalidoException e){
			System.out.println(e.getMessage());
		}
    }
}

