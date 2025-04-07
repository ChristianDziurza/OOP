package banco.contas;

public class ContasApp {
    public static void main(String[] args){
        ContaCorrente[] contas = new ContaCorrente[3];

        contas[0] = new ContaCorrente();
        contas[1] = new ContaCorrente(23.44);
        contas[2] = new ContaCorrenteEspecial();

        contas[0].setSaldo(55.7);
        contas[2].setSaldo(44.66);

        System.out.println("Depósito conta 1: "+ contas[0].deposito(13.22));
        System.out.println("Depósito conta 2: "+contas[1].deposito(14.68));
        System.out.println("Depósito conta 3: "+contas[2].deposito(12.15));
        System.out.println();

        System.out.println("Saque conta 1: "+contas[0].saque(45.77));
        System.out.println("Saque conta 2: "+contas[1].saque(22.12));
        System.out.println("Saque conta 3: "+contas[2].saque(33.21));
        System.out.println();

        System.out.println("Saldos depois dos saques");
        mostraConta(contas[0]);
        mostraConta(contas[1]);
        mostraConta(contas[2]);

    }
    public static void mostraConta(ContaCorrente conta){
        System.out.println("Saldo da conta: "+conta.getSaldo());
    }
}
