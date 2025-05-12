public class TestaFalante {
    public static void main(String[] args) {
        Falante f1,f2; //cria variaveis da interface Falante
        f1 = new Estudante("Manoel",22); // cria um objeto da classe Estudante
        f2 = new Robo(); // cria um objeto da classe Robo
        Entrevistador e = new Entrevistador(); // cria um objeto da classe Entrevistador
        e.entrevista(f1); // chama o metodo entrevista da classe Entrevistador usando f1 como parametro
        System.out.println("-------------");
        e.entrevista(f2); //  chama o metodo entrevista da classe Entrevistador usando f2 como parametro
    }
}
