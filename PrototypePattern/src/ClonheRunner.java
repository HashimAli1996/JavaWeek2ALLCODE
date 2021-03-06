
public class ClonheRunner {
	
	public static void main(String[] args) {
		CloneFactory animalMaker = new CloneFactory();
		
		Sheep sally = new Sheep();
		
		Dog clifford = new Dog();
		
		Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);
		
		Dog clonedDog = (Dog) animalMaker.getClone(clifford);
		
		System.out.println(sally);
		
		System.out.println(clonedSheep);
		
		System.out.println(clifford);
		
		System.out.println(clonedDog);
		
		System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(sally)));
		
		System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonedSheep)));
	
		System.out.println("Clifford HashCode: " + System.identityHashCode(System.identityHashCode(clifford)));
	
		System.out.println("Clifford Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonedDog)));
	}
	
}
