package defaultpackage;

public class Main {

	public static void main(String[] args) {
		
		// interface = a template(modelo) that can be applied to a class. 
		//             similar to inheritance(heran�a), but specifies what a class has/must do.		
		//			   classes can apply more than one interface, inheritance is limited to 1 direct super class.
	
	
		
		
		Rabbit rabbit = new Rabbit();
		
		rabbit.flee();
	
		
		
		Hawk hawk = new Hawk();
		hawk.hunt();
		
		
		Fish fish = new Fish();
		
		fish.hunt();
		fish.flee();
		
	}

}
