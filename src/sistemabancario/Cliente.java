package sistemabancario;
import java.util.UUID;

public class Cliente extends Thread {
    UUID id = UUID.randomUUID();
    Conta conta = new Conta(1000, TipoConta.corrente);
    String nome;
    Loja lojaUm, lojaDois;

    public Cliente(String nome, Loja lojaUm, Loja lojaDois) {
        this.nome = nome;
        this.lojaUm = lojaUm;
        this.lojaDois = lojaDois;
    }

    public void run() {
        try {
            double valorCompra;

            if (Math.random() < 0.5) {
                valorCompra = 100;
            } else {
                valorCompra = 200;
            }

            while (conta.saldo > 0) {
                if (Math.random() < 0.5) {
                    lojaUm.processarCompra(this, valorCompra);
                    SincronizarPrints.log(nome + ": Fez uma compra na " + lojaUm.nome + " de valor R$ " + valorCompra);
                } else {
                    lojaDois.processarCompra(this, valorCompra);
                    SincronizarPrints.log(nome + ": Fez uma compra na " + lojaDois.nome + " de valor R$ " + valorCompra);
                }


                SincronizarPrints.log(nome + ": Possui um novo saldo de R$: " + conta.saldo);

            }
        } catch (Exception e) {
            SincronizarPrints.log("Erro na thread " + Thread.currentThread().getName() + ": " + e.getMessage());
        }

    }
}