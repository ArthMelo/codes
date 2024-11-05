package P1.Agregação;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String nomeProfessor;
    private ArrayList<Aluno> alunos;

    public Disciplina(String nome, String nomeProfessor) {
        this.nome = nome;
        this.nomeProfessor = nomeProfessor;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void adicionarAlunos(Aluno aluno) {
        alunos.add(aluno);
        aluno.adicionarDisciplina(this);
    }

    public void getAlunos() {
        System.out.println("Alunos inscritos na disciplina: ");
        for(Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }


}
