package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		
		System.out.println("Bom");
		System.out.println(" dia!");
		System.out.println(" dia!");
		
		
		System.out.printf("megasena: %d %d %d %d %d %n", 1, 2, 3, 4, 5);
		
		var nome = "Denilson";
		//System.out.printf("Nome: %s %n", nome);
		System.out.println("Nome: " + nome);
		
		var nomee = "Denilson";
		var sobrenome = "Klebermarks";
		
		System.out.printf("Nome: %s %s %n", nomee , sobrenome);


		
		/* 
		 * 
		 * Scanner entrada = new Scanner(System.in);
		
		   entrada.nextLine();
		 * 
		 * 
		 * */
	
		
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu novo nome: ");
		 entrada.nextLine();
		
		System.out.print("Digite o seu novo sobrenome: ");
		 entrada.nextLine();
		 
		 /*  ou pode ser feito dessa outra maneira também:
		   
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.print("Digite o seu novo nome: ");
		 String nomenovo = entrada.nextLine();
		 
		 System.out.print("Digite o seu novo sobrenome: ");
		 String sobrenomenovo = entrada.nextLine();
		*/
		
		
		
	}

}

/* %d -. números reais
 * %n -> pular linha (mesma coisa que \n)
 * System.out.printf("Nome: %s", nome); -> print formatado
 *System.out.print -> mantém na mesma linha o print */