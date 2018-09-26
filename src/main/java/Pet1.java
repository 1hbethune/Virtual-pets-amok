
public class Pet1 {

	private static final int DEFAULT_WASTE_LEVEL = 50;
	private static final int DEFAUL_LITTERWASTE_LEVEL = 30;
	private static final int DEFAUL_CAGEWASTE_LEVEL = 30;
	private static final int DEFAULT_THIRST_LEVEL = 50;
	private static final int DEFAUL_HEALTH_LEVEL = 50;
	private static final int DEFAULT_HUNGER_LEVEL = 50;

	private int hungerLevel = DEFAULT_HUNGER_LEVEL;
	private int healthLevel = DEFAUL_HEALTH_LEVEL;
	private int thirstLevel = DEFAULT_THIRST_LEVEL;
	private int cageWasteLevel = DEFAUL_CAGEWASTE_LEVEL;
	private int litterWasteLevel = DEFAUL_LITTERWASTE_LEVEL;
	private int wasteLevel = DEFAULT_WASTE_LEVEL;

	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getHealthLevel() {
		return healthLevel;

	}

	public void removeHunger(int amount) {
		hungerLevel -= amount;
	}

	public void receiveHealth(int amount) {
		healthLevel += amount;

	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	public void removeThirst(int amount) {
		thirstLevel -= amount;

	}

	public void removelitterWaste(int amount) {
		litterWasteLevel -= amount;

	}

	public int getcageWasteLevel() {
		return cageWasteLevel;
	}

	public int getlitterWasteLevel() {
		return litterWasteLevel;
	}

}
