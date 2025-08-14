public class Pessoa implements Runnable {
    Thread thread;
    static Contabancaria cb = new Contabancaria();

    public Pessoa(String name, Contabancaria conta) {
        thread = new Thread(this, name);
        cb = conta;
        thread.start();
    }

    public void run() {
        System.out.println("Valor antes do saque: " + cb.getSaldo());
        for (int i = 0; i < 10; i++) {
            cb.sacar(200.00);
        }
        System.out.println("Valor após o saque: " + cb.getSaldo());
        System.out.println("Valor antes do depósito: " + cb.getSaldo());
        for (int i = 0; i < 10; i++) {
            cb.depositar(200.00);
        }
        System.out.println("Valor após o deposito: " + cb.getSaldo());

        System.out.println("Saldo final: " + cb.getSaldo());
    }
}
