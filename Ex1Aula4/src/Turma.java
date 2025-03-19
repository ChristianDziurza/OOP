public class Turma {
    private String curso, disciplina;

    public String getDisciplina(){
        return disciplina;
    }
    public String getCurso(){
        return curso;
    }
    public void setCurso(String curso1){
        curso = curso1;
    }
    public void setDisciplina(String disciplina1){
        disciplina = disciplina1;
    }

    public void exibeTurma(){
        System.out.println("Turma do curso "+getCurso()+" da disciplina "+getDisciplina());
    }

}
