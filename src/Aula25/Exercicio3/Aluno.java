package Aula25.Exercicio3;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private String[] disciplinas;
    private float[] notas;


    Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = new String[3];
        this.notas = new float[3];

    }

    boolean verificarAprovacao (String disciplina){
        /*int pos;
        if (this.disciplinas[0].equals(disciplinas)) {
            pos = 0;
        } else if (this.disciplinas[1].equals(disciplinas))){
            pos = 1;
        }else if (this.disciplinas[2].equals(disciplinas))){
            pos = 2;
        }else{
            throw new RuntimeException("Disciplina não encontrada");
        }*/
        int pos = -1;
        for (int i = 0; i < 3; i++) {
            if (this.disciplinas[i].equals(disciplina)) {
                pos = i;
            }
        }
        if (pos == -1) {
            throw new RuntimeException("Disciplina não encontrada");
        }
        return this.notas[pos] >= 7;

    }

    void adicionarNota(int pos, float nota){
        this.notas[pos] = nota;
    }

    void adicionarDisciplinas(int pos, String disciplina){
        this.disciplinas[pos] = disciplina;
    }



    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public float[] getNotas() {
        return notas;
    }


}
