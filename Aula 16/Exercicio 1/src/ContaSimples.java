public class ContaSimples extends ContaBancaria{
    public ContaSimples(String nome){
        super(nome);
    }
    public void retira(double valor){
        if(getSaldo() != 0 && (valor<getSaldo() || valor==getSaldo())){
            setSaldo(getSaldo()-valor);
            System.out.println(getSaldo());
        }
        else
            System.out.println("Não é possível fazer a retirada");
    }

    public void depositar(double valor){
        setSaldo(getSaldo()+valor);
        System.out.println(getSaldo());
    }
}
