package banco.contas;

public class ContaCorrente {
    private double saldo;

    public ContaCorrente(){
        saldo = 0;
    }
    public ContaCorrente(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double deposito(double dep){
        return saldo+=dep;
    }
    public double taxa(double saque){
        System.out.println("Aplicando taxa de: "+(saque*0.2));
        return saque*0.2;
    }
    public double saque(double saque){
        return saldo-=saque + taxa(saque);
    }

}
