public class Retangulo {
    private double comprimento, largura;

    public Retangulo(){
        comprimento = 1;
        largura = 1;
    }
    public Retangulo(double comprimento, double largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setComprimento(double comprimento) {
        if(comprimento == 0)
            System.out.println("O comprimento não pode ser zero");
        this.comprimento = comprimento;
    }

    public void setLargura(double largura) {
        if(largura == 0)
            System.out.println("A largura não pdoe ser zero");
        else
            this.largura = largura;
    }

    public double calculaArea(){
        return comprimento*largura;
    }

    public double calculaPerimetro(){
        return 2*comprimento + 2*largura;
    }

    public boolean isQuadrado(){
        return (comprimento == largura)? true : false;
    }

    public void mostraArea(){
        System.out.println("Area do retângulo: "+calculaArea());
    }
    public void mostraPerimetro(){
        System.out.println("Perimetro do retângulo: "+calculaPerimetro());
    }
    public void respostaQuadrado(){
        if(isQuadrado() == true)
            System.out.println("O retângulo é um quadrado");
        else
            System.out.println("O retângulo não é um quadrado");
    }
}
