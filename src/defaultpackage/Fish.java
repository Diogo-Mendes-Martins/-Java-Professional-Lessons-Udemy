package defaultpackage;

public class Fish implements Prey, Predator {

	@Override
	public void hunt() {
		System.out.println("This Fish is hunting smaller fish");
	}

	@Override
	public void flee() {
		System.out.println("This Fish is fleeing from a larger fish");
		
	}

}
