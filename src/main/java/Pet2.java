
public class Pet2 {

	private static int rustLevel;
	private static int happinessLevel;

	public static int getRustLevel() {
		return rustLevel;
	}

	public void removeRust(int amount) {
		rustLevel -= amount;

	}

	public int gethappinessLevel() {
		return happinessLevel;
	}

	public void receiveHappiness(int amount) {
		happinessLevel += amount;

	}

}
