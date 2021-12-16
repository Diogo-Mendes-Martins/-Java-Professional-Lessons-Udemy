package fundamentos;

public class FahrenheitCelsius {
	public static void main(String[] args) {
		
		
		//(32 °F − 32) × 5/9 = 0 °C
		
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		double f = 86;
		double c = (f - AJUSTE) * FATOR;
		
		
		System.out.println("O resultado de Fahrenheit para Celsius é: " + c);
	}

}
