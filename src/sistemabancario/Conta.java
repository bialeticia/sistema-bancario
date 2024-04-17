package sistemabancario;

public class Conta extends Thread {
	int saldo;
	TipoConta tipoConta;
	
	public Conta(int saldo, TipoConta tipoConta) {
		this.saldo = saldo;
		this.tipoConta = tipoConta;
	}
	
	public void run() {
		
	}
	
	public void realizarCompra() {
		int valorCompra = 100; 
		
		if(valorCompra>saldo) {
			System.out.println("Compra negada: saldo insuficiente");
			
			return;
		}
		
		saldo -= valorCompra;
		System.out.println("Novo saldo: " + saldo);
	}
	
}