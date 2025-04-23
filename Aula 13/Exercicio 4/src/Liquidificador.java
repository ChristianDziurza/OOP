public class Liquidificador {
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
            System.out.println("O liquidificador está ligado!");
        else
            System.out.println("O liquidificador não está ligado");
    }
}
