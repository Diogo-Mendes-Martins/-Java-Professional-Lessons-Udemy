package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		
//Informa��es de um funcion�rio:
		
		//Tipos num�ricos inteiros:
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;/*quando vc define um Literal 
		e a capacidade de range � atingida,
		 mais ou menos at� 3 000 000 000, 
		 � preciso vc colocar o "L".*/
		
		
		//Tipos n�mericos reais:
		
		float salario = 11_445.44F;/* o "F" indica para o Java,
		que vc est� escrevendo um 
		literal Float e n�o Double.*/
		
		double vendasAcumuladas = 2_991_797_103.01;
		
		
		//Tipo Booleano:
		
		boolean estaDeFerias = false; //true
		
		//Tipo Caractere:
		
		char status = 'A'; /* '?', '1'..etc... 
		n�o pode 'AT' por exemplo pq n�o � uma �nica letra*/
		
		
		////////////////////////////////////////////////////////
		
		// Dias de empresa:
		
		System.out.println(anosDeEmpresa * 365);
		
		
		// N�mero de viagens:
		
		System.out.println(numeroDeVoos / 2);
		
		
		// Pontos por real:
		
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		
		//int e float:
		
		System.out.println(id + ": ganha -> " + salario);
		
		
		//boolean:
		
		System.out.println("F�rias? " + estaDeFerias);
		
		//Caractere:
		
		System.out.println("Status: " + status);
		
		
		
		
		
		
		
	}

}
