package fundamentos;

import java.util.Date;

import javax.swing.JButton;

public class Import {
	
	public static void main(String[] args) {
		
		
		
		java.lang.String b = "Olá, td bem?";
		java.lang.System.out.println(b);
		
		String s = "Bom dia !";
		System.out.println(s);
		
		Date d = new Date();
		System.out.println(d);
		
		 JButton botao = new JButton();
		
		
	}
}



  /*Comentários: 1 - Os Imports têm que ser feitos fora da estrutura "class". Na área onde se localiza o "package".
   * 			 2 - O Date é Não-Primitivo, e além disso ele possui diversos tipos de "Import Date". 
   * 			 3 - Só existe um JButton na API do java, por isso ele importa sozinho.
   * 			 4 - A sintaxe completa seria: java.lang.String s = "Bom dia !" e java.lang.System.out.println(s);....
   * 				mas podem ser reduzidas para uma maior rapidez na hora de digitar.
   */