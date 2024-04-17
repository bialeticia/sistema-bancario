package sistemabancario;

public class Conta {
	int saldo;
	TipoConta tipoConta;
	
	public Conta(int saldo, TipoConta tipoConta) {
		this.saldo = saldo;
		this.tipoConta = tipoConta;
	}
	
	public synchronized void realizarCompra(int saldo) {
		int valorCompra = saldo; 
		
		if(valorCompra>this.saldo) {
			System.out.println("Compra negada: saldo insuficiente");
			
			return;
		}
		
		this.saldo -= valorCompra;
		System.out.println("Novo saldo: " + this.saldo);
	}
	
	public synchronized void adicionarSaldo(int saldo) {
		this.saldo += saldo;
		System.out.println("Novo saldo: " + this.saldo);
	}
}