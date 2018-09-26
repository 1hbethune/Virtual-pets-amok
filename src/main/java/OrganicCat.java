
public class OrganicCat implements OrganicDuties {

	private String petNumber;
	private String petName;
	private String attribute;

	public OrganicCat(String petNumber, String petName, String attribute) {
		this.petNumber = petNumber;
		this.petName = petName;
		this.attribute = attribute;
	}

	@Override
	public void feed(Pet1 pet1) {
		pet1.removeHunger(30);

	}

	@Override
	public void drink(Pet1 pet1) {
		pet1.removeThirst(30);

	}

	public void play(Pet1 pet1) {
		pet1.receiveHealth(30);

	}

	public String getPetNumber() {
		return petNumber;
	}

	public String getPetName() {
		return petName;
	}

	public String getAttribute() {
		return attribute;
	}

}
