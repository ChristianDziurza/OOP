public class Geladeira {
    private boolean ligado = false;


    public void ligar(){
        ligado = true;
    }
    public void desligar(){
        ligado = false;
    }

    public boolean isLigado(){
        return (ligado == true)? true:false;
    }

    public void observar(){
        if(ligado)
            System.out.println("A geladeira está ligado!");
        else
            System.out.println("A geladeira não está ligado");
    }
}
