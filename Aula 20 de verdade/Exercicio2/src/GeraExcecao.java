public class GeraExcecao {
    static void geraException() {
        int[] nums = new int[4];
        System.out.println("Antes da exce��o ser gerada.");
        /* gera uma exce��o do tipo �ndice do array est� fora dos limites */
        nums[7] = 10;
        System.out.println("Isto n�o ser� exibido!");
    }
}