package battleField;

import java.util.ArrayList;
import java.util.Random;

import character.monster.Monster;
import character.monster.factory.ConstrutoFactory;
import character.monster.factory.InsectoideFactory;
import character.monster.factory.NecrofaloFactory;
import character.monster.factory.RelictioFactory;

public class BattleFieldFactory {

	public static BattleField getBattlerField() {
		BattleField[] possibleBattleFields = {new Field(), new Forest(), new Swamp(), new Underground()};
		int randomIndex = new Random().nextInt(possibleBattleFields.length);
		BattleField battleField = possibleBattleFields[randomIndex];

		ArrayList<Monster> monsterList = new ArrayList<Monster>();
		monsterList.addAll(ConstrutoFactory.getMany(6));
		monsterList.addAll(InsectoideFactory.getMany(6));
		monsterList.addAll(NecrofaloFactory.getMany(6));
		monsterList.addAll(RelictioFactory.getMany(7));
		
		battleField.setMonsterList(monsterList);
		
		return battleField;
	}
}
