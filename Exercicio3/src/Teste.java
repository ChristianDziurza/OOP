public class Teste {
    public static void main(String[] args){
        Universidade uni = new Universidade();
        Aluno aluno1 = new Aluno();

        uni.nome = "Unicentro";
        uni.cidade = "Guarapuava";
        uni.estado = "Parana";

        aluno1.nome = "Chris";
        aluno1.curso = "Computaria";

        uni.exibeDados();
        aluno1.exibeDados();
    }
}
