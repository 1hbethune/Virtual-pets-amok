import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class PetShelterTest {

	PetShelter petShelter = new PetShelter();

	@Test
	public void shouldBeAbleToAddPet() {
		OrganicDog organicDog = new OrganicDog("", "", "");
		petShelter.addPets(organicDog);
		Collection<Pets> check = petShelter.getAllPetss();

		assertThat(check, contains(organicDog));

	}

	@Test
	public void shouldBeAbleToAddTwoDifferentPets() {
		OrganicDog organicDog = new OrganicDog("", "", "");
		OrganicCat organicCat = new OrganicCat("", "", "");
		petShelter.addPets(organicDog);
		petShelter.addPets(organicCat);

	}

}
