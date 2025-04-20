package sistema;

public class TestaCliente {
    public static void main(String[] args){
        Cliente[] clientes = new Cliente[2];

        clientes[0] = new Cliente("Chris",1200.25,1400.25);
        clientes[1] = new ClienteEspecial("Gabriel",1700.50,10000.50);

        System.out.println(clientes[0]);
        System.out.println(clientes[1]);
    }
}
