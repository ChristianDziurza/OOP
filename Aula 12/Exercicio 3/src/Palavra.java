public class Palavra {
    public static void main(String[] args){
        System.out.println(verificaPalavra(args[0]));
    }
    public static String verificaPalavra(String arg){
        System.out.println("Palavra recebida: "+arg);
         if(arg.length() < 8)
             System.out.println("Erro; Palavra com menos de 8 letras");
         return arg.substring(0,2)+arg.substring(arg.length()-2,arg.length());
    }
}
