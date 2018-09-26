import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicCatTest {

	OrganicCat underTest = new OrganicCat("2", "name", "state");
	Pet1 pet1 = new Pet1();
	int litterWasteLevelBefore = pet1.getlitterWasteLevel();

	@Test
	public void shouldBeAbleToBeFed() {
		int hungerLevelBefore = pet1.getHungerLevel();
		underTest.feed(pet1);
		int hungerLevelAfter = pet1.getHungerLevel();
		int litterWasteLevelAfter = pet1.getlitterWasteLevel();
		assertThat(hungerLevelBefore - hungerLevelAfter, is(30));
		assertThat(litterWasteLevelBefore + litterWasteLevelAfter, is(60));
	}

	@Test
	public void shouldBeAbleToDrink() {
		int thirstLevelBefore = pet1.getThirstLevel();
		underTest.drink(pet1);
		int thirstLevelAfter = pet1.getThirstLevel();
		int litterWasteLevelAfter = pet1.getlitterWasteLevel();
		assertThat(thirstLevelBefore - thirstLevelAfter, is(30));
		assertThat(litterWasteLevelBefore + litterWasteLevelAfter, is(60));

	}

	@Test
	public void shouldBeAbleToIncreaseHealthWhenAtPlay() {

		int healthLevelBefore = pet1.getHealthLevel();
		underTest.play(pet1);
		int healthLevelAfter = pet1.getHealthLevel();
		assertThat(healthLevelAfter - healthLevelBefore, is(30));

	}

	@Test
	public void shouldReturnPetNumber() {
		String check = underTest.getPetNumber();
		assertEquals(check, "2");

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
