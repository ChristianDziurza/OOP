public class ContaEspecial extends ContaBancaria{
    private double adicional;

    public ContaEspecial(String nome, double adicional){
        super(nome);
        this.adicional = adicional;
    }

    public void retira(double valor){
        if(valor <= getSaldo()+adicional) {
            setSaldo(getSaldo() - valor);
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
