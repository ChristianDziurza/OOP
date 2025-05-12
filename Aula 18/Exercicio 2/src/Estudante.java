public class Estudante extends Pessoa implements Falante{
    public Estudante(String nome, int idade){
        super(nome,idade);
    }

    public void falar(){
        System.out.println("Olá, sou estudante!");
    }
    public String seuIdioma(){
        return "Portugues";
    }
    public void identificarSe(){
        System.out.println("Eu sou o estudante: "+getNome());
    }
}
