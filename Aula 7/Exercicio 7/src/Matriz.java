public class Matriz {
    public static void main(String[] args){
        int matrizA[][] = new int[3][3];
        int contador = 0;

        for(int i = 0;i < matrizA.length;i++){
            for(int j = 0; j < matrizA.length;j++){
                matrizA[i][j] = contador;
                contador++;
            }
        }
        for(int i = 0;i < matrizA.length;i++){
            System.out.println();
            for(int j = 0; j < matrizA.length;j++){
                System.out.print(" "+matrizA[i][j]);
            }
        }
    }
}
