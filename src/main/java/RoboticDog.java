
public class RoboticDog extends Pets {

	public RoboticDog(String petNumber, String petName, String attribute) {
		this.petNumber = petNumber;
		this.petName = petName;
		this.attribute = attribute;

	}

	public void oil(Pet2 pet2) {
		pet2.removeRust(30);

	}

	public void takeWalk(Pet2 pet2) {
		pet2.receiveHappiness(30);

	}

}
