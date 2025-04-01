import java.util.*;
public class TesteCompositor {
    public static void main(String[] args){
        Compositor comp1 = new Compositor(18237, "Chris");
        Scanner scan = new Scanner(System.in);
        Compositor[] vComp = new Compositor[2];
        for(int i=0;i< vComp.length;i++){
            vComp[i] = new Compositor();
            System.out.println("Nome do compositor "+(i+1)+": ");
            vComp[i].setNome(scan.nextLine());
            System.out.println("Código do compositor "+(i+1)+": ");
            vComp[i].setCodigo(Integer.parseInt(scan.nextLine()));
        }
        System.out.println("Compositor teste");
        System.out.println("Nome: "+comp1.getNome());
        System.out.println("Código: "+comp1.getCodigo());
        System.out.println();
        for(int i=0; i < vComp.length; i++){
            System.out.println("Compositor "+(i+1));
            System.out.println("Nome: "+vComp[i].getNome());
            System.out.println("Código: "+vComp[i].getCodigo());
            System.out.println();

        }
    }
}
