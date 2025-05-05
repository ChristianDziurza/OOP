public class TestaContaBancaria {
    public static void main(String[] args){
        /*
        ContaBancaria conta = new ContaBancaria("Jorge");
        Essa linha é inválida pois a classe ContaBancária é abstrata
        e não pode ser instanciada
         */
        ContaSimples c1 = new ContaSimples("Chris");
        ContaEspecial c2 = new ContaEspecial("Felipe",5000.00);

         c1.setSaldo(1000.00);
         c2.setSaldo(1000.00);

        System.out.println("Depositando na conta 1: ");
        c1.depositar(200);
        System.out.println("Depositando na conta 2: ");
        c2.depositar(200.50);

        System.out.println("Retirando da conta 1: ");
        c1.retira(1000.78);
        System.out.println("Retirando da conta 2: ");
        c2.retira(7000.00);

    }
}
