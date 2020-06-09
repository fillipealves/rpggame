package character.monster.factory;

import java.util.Random;


public abstract class MonsterFactory {

	protected static int generateEnergy() {
		return new Random().nextInt(100) + 1;
	}

	protected static int generateAttack() {
		return new Random().nextInt(12) + 1;
	}

	protected static int generateDefense() {
		return new Random().nextInt(12) + 1;
	}

	protected static String generateName(String[] possibleNames) {
		int randomIndex = new Random().nextInt(possibleNames.length);
		return possibleNames[randomIndex];
	}
}
