public class ValorNegativoException extends Exception{
    public double valor;

    public ValorNegativoException(double v){
        valor = v;
    }

    @Override
    public String toString(){
        return "Não é possível realizar um saque ou um depósito de um valor negativo";
    }
}
