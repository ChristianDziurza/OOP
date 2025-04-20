package sistema;

public class ClienteEspecial extends Cliente{

    public ClienteEspecial(String nome, double saldo, double limite){
        super(nome,saldo,limite);
    }

    @Override
    public String toString(){
        return "Cliente especial: "+getNome()+ " R$"+getSaldo() + " limite "+"R$"+getLimite();
    }
}
