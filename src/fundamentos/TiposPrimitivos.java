package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		
//Informações de um funcionário:
		
		//Tipos numéricos inteiros:
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;/*quando vc define um Literal 
		e a capacidade de range é atingida,
		 mais ou menos até 3 000 000 000, 
		 é preciso vc colocar o "L".*/
		
		
		//Tipos númericos reais:
		
		float salario = 11_445.44F;/* o "F" indica para o Java,
		que vc está escrevendo um 
		literal Float e não Double.*/
		
		double vendasAcumuladas = 2_991_797_103.01;
		
		
		//Tipo Booleano:
		
		boolean estaDeFerias = false; //true
		
		//Tipo Caractere:
		
		char status = 'A'; /* '?', '1'..etc... 
		não pode 'AT' por exemplo pq não é uma única letra*/
		
		
		////////////////////////////////////////////////////////
		
		// Dias de empresa:
		
		System.out.println(anosDeEmpresa * 365);
		
		
		// Número de viagens:
		
		System.out.println(numeroDeVoos / 2);
		
		
		// Pontos por real:
		
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		
		//int e float:
		
		System.out.println(id + ": ganha -> " + salario);
		
		
		//boolean:
		
		System.out.println("Férias? " + estaDeFerias);
		
		//Caractere:
		
		System.out.println("Status: " + status);
		
		
		
		
		
		
		
	}

}
