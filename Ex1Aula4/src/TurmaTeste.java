public class TurmaTeste{
    public static void main(String[] args){
        Turma turma1 = new Turma();
        Turma turma2 = new Turma();

        turma1.setCurso("Ciencia da Computacao");
        turma1.setDisciplina("POO");
        turma2.setCurso("Biologia");
        turma2.setDisciplina("Joao");

        turma1.exibeTurma();
        turma2.exibeTurma();

        System.out.println("Curso: "+turma1.getCurso());
        System.out.println("Disciplina: "+turma1.getDisciplina());
        System.out.println("Curso: "+turma2.getCurso());
        System.out.println("Disciplina: "+turma2.getDisciplina());
    }
}
