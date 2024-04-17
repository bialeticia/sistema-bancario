package sistemabancario;

public class Conta {
	double saldo;
	TipoConta tipoConta;
	
	public Conta(double saldo, TipoConta tipoConta) {
		this.saldo = saldo;
		this.tipoConta = tipoConta;
	}
	
	public synchronized void retirarSaldo(double saldo) {
		double valorCompra = saldo; 
		
		if(valorCompra>this.saldo) {
			System.out.println("Compra negada: saldo insuficiente");
			
			return;
		}
		
		this.saldo -= valorCompra;
	}
	
	public synchronized void adicionarSaldo(double saldo) {
		this.saldo += saldo;
	}
}