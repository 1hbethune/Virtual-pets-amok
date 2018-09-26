import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicDogTest {

	OrganicDog underTest = new OrganicDog("1", "name", "state");
	Pet1 pet1 = new Pet1();
	int cageWasteLevelBefore = pet1.getcageWasteLevel();

	@Test
	public void shouldBeAbleToBeFed() {
		int hungerLevelBefore = pet1.getHungerLevel();
		underTest.feed(pet1);
		int hungerLevelAfter = pet1.getHungerLevel();
		int cageWasteLevelAfter = pet1.getcageWasteLevel();
		assertThat(hungerLevelBefore - hungerLevelAfter, is(30));
		assertThat(cageWasteLevelBefore + cageWasteLevelAfter, is(60));
	}

	@Test
	public void shouldBeAbleToDrink() {
		int thirstLevelBefore = pet1.getThirstLevel();
		underTest.drink(pet1);
		int thirstLevelAfter = pet1.getThirstLevel();
		int cageWasteLevelAfter = pet1.getcageWasteLevel();
		assertThat(thirstLevelBefore - thirstLevelAfter, is(30));
		assertThat(cageWasteLevelBefore + cageWasteLevelAfter, is(60));

	}

	@Test
	public void shouldBeAbleToIncreaseHealthWhenBeingWalked() {
		int healthLevelBefore = pet1.getHealthLevel();
		underTest.takeWalk(pet1);
		int healthLevelAfter = pet1.getHealthLevel();
		assertThat(healthLevelAfter - healthLevelBefore, is(30));

	}

	@Test
	public void shouldReturnPetNumber() {
		String check = underTest.getPetNumber();
		assertEquals(check, "1");

	}

	@Test
	public void shouldReturnPetName() {
		String check = underTest.getPetName();
		assertEquals(check, "name");
	}

	@Test
	public void shouldReturnAttribute() {
		String check = underTest.getAttribute();
		assertEquals(check, "state");

	}

}
