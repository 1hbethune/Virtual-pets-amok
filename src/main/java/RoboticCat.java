
public class RoboticCat extends Pets {

	public RoboticCat(String petNumber, String petName, String attribute) {
		this.petNumber = petNumber;
		this.petName = petName;
		this.attribute = attribute;
	}

	public void oil(Pet2 pet2) {
		pet2.removeRust(30);

	}

}
