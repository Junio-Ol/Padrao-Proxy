
public class Teste {

	public static void main(String[] args) {
		
		Banco cliente = new BancoProxy("admin","admin");
		
		cliente.getSaldo();
		System.out.println(cliente.getSaldo());
		
		cliente.saque(200.0);
		System.out.println(cliente.getSaldo());
		
		cliente.saque(50.0);
		System.out.println(cliente.getSaldo());
	}

}
