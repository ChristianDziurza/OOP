import java.util.*;
public class ArrayDeSeis {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int array[] = {20,16,12,7,3,1};
        System.out.println("De o valor de x");
        int x = scan.nextInt(), dif = 0,ind1 = 0,ind2 = 0;
        for(int i = 1; i < array.length; i++){
            if(array[i-1] - array[i] > dif) {
                ind1 = i-1;
                ind2 = i;
                dif = array[i-1] - array[i];
            }
        }
        int menorx = 0, maiorx = 0, igualx = 0;
        for(int ar: array){
            if(ar == x)
                igualx++;
            if(ar < x)
                menorx++;
            if(ar > x)
                maiorx++;
        }
        System.out.println("A maior diferença no vetor é: "+dif);
        System.out.println("Localizada nos indíces: "+ind1+" "+ind2);
        System.out.println("No vetor há: \n"+igualx+" numeros iguais a x,\n"+menorx+" numeros menores que x.\n"+
                maiorx+" números maiores que x");
    }
}
