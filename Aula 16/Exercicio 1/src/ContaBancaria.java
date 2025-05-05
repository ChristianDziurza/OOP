public abstract class ContaBancaria {
    private String nome;
    private double saldo;

    public ContaBancaria(String nome){
        this.nome = nome;
        saldo = 0;
    }

    public abstract void retira(double valor);
    public abstract void depositar(double valor);

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo1){
        this.saldo = saldo1;
    }

}
