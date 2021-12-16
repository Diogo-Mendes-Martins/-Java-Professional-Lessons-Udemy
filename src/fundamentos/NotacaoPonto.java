package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {

		String s = "Bom dia X";
		s = s.concat("!!!");
		s = s.toUpperCase();
		s = s.replace("X", "Senhora");

		System.out.println(s);

		String x = "Diogo".toUpperCase();
		System.out.println(x);

		
		
		String y = "Bom dia X".replace("X", "Dii").toUpperCase().concat("!!!");
		System.out.println(y);
		
		
	}

}

