import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RoboticCatTest {

	RoboticCat underTest = new RoboticCat("4", "name", "state");
	Pet2 pet2 = new Pet2();

	@Test
	public void shouldBeAbleToUseOil() {
		int rustLevelBefore = pet2.getRustLevel();
		underTest.oil(pet2);
		int rustLevelAfter = pet2.getRustLevel();
		assertThat(rustLevelBefore - rustLevelAfter, is(30));

	}

	@Test
	public void shouldReturnPetNumber() {
		String check = underTest.getPetNumber();
		assertEquals(check, "4");

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
