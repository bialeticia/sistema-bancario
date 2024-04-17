package sistemabancario;
import java.util.UUID;

public class Cliente extends Thread {
	UUID id = UUID.randomUUID();
	String nome;
	Conta conta = new Conta(1000, TipoConta.corrente);
	Loja lojaUm, lojaDois;
	
	public Cliente(String nome, Loja lojaUm, Loja lojaDois) {
		this.nome = nome;
		this.lojaUm = lojaUm;
        this.lojaDois = lojaDois;
	}
	
	public void run() {
		double valorCompra;
		
		if (Math.random() < 0.5) {
            valorCompra = 100;
        } else {
            valorCompra = 200;
        }
		
		while (conta.saldo > 0) {
            if (Math.random() < 0.5) {
                lojaUm.processarCompra(this, valorCompra);
            } else {
                lojaDois.processarCompra(this, valorCompra);
            }
        }
	}
}