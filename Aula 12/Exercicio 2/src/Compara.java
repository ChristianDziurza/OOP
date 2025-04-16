import java.util.*;
public class Compara {
    public static void main(String[] args){
        comparaDois(args[0],args[1]);
    }

    public static void comparaDois(String arg1, String arg2){
        String resposta;
        System.out.println("Quer ignorar letras maíusculas?(s/n) ");
        Scanner scan = new Scanner(System.in);
        resposta = scan.nextLine();
        System.out.println(arg1);
        System.out.println(arg2);
        switch(resposta){
            case "n":
                if(arg1.equals(arg2))
                    System.out.println("São exatamente iguais!");
                else
                    System.out.println("São diferentes");
                break;
            case "s":
                if(arg1.equalsIgnoreCase(arg2))
                    System.out.println("São iguais!");
                else
                    System.out.println("São diferentes");
                break;
        }




    }
}
