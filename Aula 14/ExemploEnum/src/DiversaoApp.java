public class DiversaoApp {
    public static void main(String[] args){
        Diversao diversao;

        diversao = Diversao.PESCAR;

        switch (diversao){
            case LER:
                System.out.println("Irei ler");
                break;
            case PASSEAR:
                System.out.println("Irei passear");
                break;
            case CONVERSAR:
                System.out.println("Irei conversar");
                break;
            case PESCAR:
                System.out.println("Irei pescar");
                break;
            case JOGAR:
                System.out.println("Irei jogar");
                break;
        }
    }
}
