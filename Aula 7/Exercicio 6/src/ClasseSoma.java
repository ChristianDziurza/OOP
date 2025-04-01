public class ClasseSoma {
    public static void main(String[] args){
        System.out.println("|| TESTANDO SOMA ||");
        System.out.println("Resultado soma 1: "+soma(23,44,5));
        System.out.println("Resultado soma 2: "+soma(2,5));
        System.out.println("Resultado soma 3: "+soma(6));
        System.out.println("Resultado soma 4: "+soma(7,8,76,12));
    }

    public static int soma(int ...nums){
        int soma = 0;
        for(int s: nums){
            soma+=s;
        }
        return soma;
    }
}
