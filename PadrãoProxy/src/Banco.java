
public class Banco {
	
	private Double saldo;
	
	public Banco() {
		this.saldo=100.0;
		
	}

	public Double getSaldo() {
		return saldo;
	}

	public void saque(Double saque) {
		this.saldo = saldo - saque;
	}
	
}
