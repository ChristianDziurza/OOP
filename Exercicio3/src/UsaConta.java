public class UsaConta {
    public static void main(String[] args) {
        Contabancaria conta = new Contabancaria();
        Pessoa p1 = new Pessoa("Pessoa#1", conta);
        Pessoa p2 = new Pessoa("Pessoa#2", conta);

        try{
            p1.thread.join();
            p2.thread.join();
        }catch(InterruptedException exc){
            System.out.println("Thread principal interrompida");
        }
    }
}
