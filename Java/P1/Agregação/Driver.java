package P1.Agregação;

public class Driver {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Arthur");
        Aluno a2 = new Aluno("lavinia");

        Disciplina algebra = new Disciplina("Algebra Linear", "Joao Paixão");
        Disciplina poo = new Disciplina("Programação Orientada", "Ronald");
        algebra.adicionarAlunos(a1);
        algebra.adicionarAlunos(a2);
        poo.adicionarAlunos(a1);

        algebra.getAlunos();
        a1.getDisciplinas();


    }
}
