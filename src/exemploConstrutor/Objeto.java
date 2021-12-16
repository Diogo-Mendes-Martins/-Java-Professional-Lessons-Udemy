package exemploConstrutor;

public class Objeto {

	public String cor;
	public int tamanho;

	public Objeto() {
		
	}
	
	public Objeto(String cor, int tamanho) {
		super();
		this.cor = cor;
		this.tamanho = tamanho;

	}

	@Override
	public String toString() {
		return "Objeto [cor=" + cor + ", tamanho=" + tamanho + "]";
	}




	
    
    
    
    
    
    
    
}
