/*Vari�vel de inst�ncia - � uma vari�vel cujo o valor � espec�fico
 *ao objeto, e n�o � classe. Pertence ao objeto criado e somente a esse objeto.*/


package exemplo.quadrado;

public class Quadrado {
    public String cor = "Azul";
 
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();
        Quadrado q2 = new Quadrado();
        
        System.out.println("q1.cor: " + q1.cor + " q2.cor: " + q2.cor);
       
        
        q1.cor = "Verde";
        System.out.println("q1.cor: " + q1.cor + " q2.cor: " + q2.cor);
       
        
        
        q2.cor = "Amarelo";
        System.out.println("q1.cor: " + q1.cor + " q2.cor: " + q2.cor);
    }
}


/*public String cor;
	public int tamanho;
	public String nome;

	
	
	
	public Quadrado(String cor, int tamanho) {
		this.cor = cor;
		this.tamanho = tamanho;
	}
	public Quadrado(String cor, int tamanho, String nome) {
		this.cor = cor;
		this.tamanho = tamanho;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Quadrado [cor=" + cor + ", tamanho=" + tamanho + ", nome=" + nome + "]";
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

	
	
	
	
	


