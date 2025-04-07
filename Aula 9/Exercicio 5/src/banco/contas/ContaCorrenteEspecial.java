package banco.contas;

public class ContaCorrenteEspecial extends ContaCorrente {
    @Override
    public double saque(double saque){
        System.out.println("Aplicando taxa de: "+(saque*0.1));
        return saque*0.1;
    }
}
