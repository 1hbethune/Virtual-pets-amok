
public class OrganicDog extends Pets implements OrganicDuties {

	public OrganicDog(String petNumber, String petName, String attribute) {
		this.petNumber = petNumber;
		this.petName = petName;
		this.attribute = attribute;

	}

	public void takeWalk(Pet1 pet1) {
		pet1.receiveHealth(30);
	}

	@Override
	public void feed(Pet1 pet1) {
		pet1.removeHunger(30);

	}

	@Override
	public void drink(Pet1 pet1) {
		pet1.removeThirst(30);

	}

}
