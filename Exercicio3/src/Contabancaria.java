public class Contabancaria {
    private double saldo;

    public Contabancaria(){
        saldo = 1000;
    }
    public synchronized double getSaldo(){
        return saldo;
    }

    public synchronized void sacar(double valor){
        saldo = saldo-valor;
    }
    public synchronized void depositar(double valor){
        saldo = saldo+valor;
    }
}
