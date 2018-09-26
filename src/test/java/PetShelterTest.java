import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class PetShelterTest {

	PetShelter underTest = new PetShelter();
	OrganicDog organicDog = new OrganicDog("", "", "");
	OrganicCat organicCat = new OrganicCat("", "", "");
	RoboticDog roboticDog = new RoboticDog("", "", "");
	RoboticCat roboticCat = new RoboticCat("", "", "");

	@Test
	public void shouldBeAbleToAddRoboticDog() {
		underTest.add(organicDog);
		Pets foundOrganicDog = underTest.findPets("1");
		assertThat(foundOrganicDog, is(organicDog));
	}

	@Test
	public void shouldBeAbleToAddOrganicDogAndOrganicCatAndRoboticDogAndRoboticCat() {
		underTest.add(organicDog);
		underTest.add(organicCat);
		underTest.add(roboticDog);
		underTest.add(roboticCat);
		Collection<Pets> addedPets = underTest.getAllPets();
		assertThat(addedPets, containsInAnyOrder(organicDog, organicCat, roboticDog, roboticCat));
	}

}
