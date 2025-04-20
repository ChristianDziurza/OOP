package sistema;

public class Cliente {
    private String nome;
    private double saldo, limite;

    public Cliente(String nome, double saldo, double limite){
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    protected String getNome(){
        return nome;
    }
    protected double getSaldo(){
        return saldo;
    }
    protected double getLimite(){
        return limite;
    }

    @Override
    public String toString(){
        return "Cliente padrão: "+nome + " R$"+saldo + " limite "+"R$"+limite;
    }
}