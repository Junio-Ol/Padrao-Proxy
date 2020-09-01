
public class BancoProxy extends Banco {
	
	 
	 protected String usuario, senha;
	 
	    public BancoProxy(String usuario, String senha) {
	        this.usuario = usuario;
	        this.senha = senha;
	    }
	    
	    @Override
	    public Double getSaldo() {
	        if (temPermissaoDeAcesso()) {
	            return  super.getSaldo();
	        }
			return null;
	       
	    }
	    
	    public void saque(Double saque) {
	        if (temPermissaoDeAcesso()) {
	        	Double valor = super.getSaldo();
	            if(valor>=saque) {
	            	super.saque(saque);
	            	System.out.println("Transa��o aprovada");
	            	}else {
	            		System.out.println("Transa��o n�o aprovada");
	            	}
	        }
	      }
	
	 
	    private boolean temPermissaoDeAcesso() {
	        return usuario == "admin" && senha == "admin";
	    }
	}



