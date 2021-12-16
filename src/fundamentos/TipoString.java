package fundamentos;

public class TipoString {

		public static void main(String[] args) {
			System.out.println("Olá pessoal".charAt(2));
			
			String s = "Boa noite";
			s = s.concat("!!!");
			System.out.println(s);
			
			//ou//
			
			String d = "Bom dia";
			System.out.println(d.concat("!!!"));
			
			
			
			String b = "Boa tarde";
			
			System.out.println(b.concat("!!!"));
			System.out.println(b + "!!!");
			System.out.println(b.startsWith("Boa tarde"));
			System.out.println();
			System.out.println();
			System.out.println();
			
			
			
			var nome = "Diogo";
			var sobrenome = "Martins";
			var idade = 27;
			
			System.out.println("Nome: " + nome + 
					"\nSobrenome: " + 
					sobrenome + "\nIdade: " + idade + "\n\n");
			
			
			
			System.out.printf("Nome: %s %s", nome , sobrenome);
			
			
		}
}



/* O string nada mais é do que um conjunto
 * de caracteres (char), que é o valor básico da linguagem.
 * String é um valor imutável...sempre será "Bom dia".
 *
	String b = "Boa tarde";
	System.out.println(b.startsWith("Boa tarde")); -> Esse "startsWith" 
	confirma se sua frase inicia com tal palavra.*/