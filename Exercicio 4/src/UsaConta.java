import java.util.*;
public class UsaConta {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Conta conta1 = new Conta(1000.00);
        Conta conta2 = new Conta(150.00);

        System.out.println("Saldo da Conta1: R$"+conta1.getSaldo());
        System.out.println("Saldo da Conta2: R$"+conta2.getSaldo());

        System.out.println("Digite o valor de retirada da conta1: ");
        double qtRetirada1 = scanner.nextDouble();

        System.out.println("Subtraind "+qtRetirada1+" da Conta1");
        conta1.debitar(qtRetirada1);

        System.out.println("Saldo da Conta1: R$"+conta1.getSaldo());
        System.out.println("Saldo da Conta2: R$"+conta2.getSaldo());

        System.out.println("Digite o valor de retirada da conta2: ");
        double qtRetirada2 = scanner.nextDouble();

        System.out.println("Subtraind "+qtRetirada2+" da Conta2");
        conta2.debitar(qtRetirada2);

        System.out.println("Saldo da Conta1: R$"+conta1.getSaldo());
        System.out.println("Saldo da Conta2: R$"+conta2.getSaldo());
    }
}
