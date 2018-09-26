import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PetShelter {

	Map<String, Pets> petss = new HashMap<>();

	public void addPets(Pets pets) {
		petss.put(pets.getPetNumber(), pets);

	}

	public Collection<Pets> getAllPetss() {
		return petss.values();
	}

}
