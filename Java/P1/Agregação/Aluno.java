package P1.Agregação;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Disciplina> disciplinas;

    public Aluno(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public void getDisciplinas() {
        System.out.println(this.nome+" está inscrito/a nas seguintes disciplinas: ");
        for(Disciplina disciplinas : this.disciplinas ) {
            System.out.println(disciplinas.getNome());
        }
    }

}

