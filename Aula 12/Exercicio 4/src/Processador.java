public class Processador {
    public static void main(String[] args){
        System.out.println(processa(args[0]));
    }
    public static String processa(String s){
        System.out.println("Palavra recebida: "+s);
        if(s == null)
            return null;
        return s.toUpperCase();
    }
}
