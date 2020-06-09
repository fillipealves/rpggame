import java.util.Scanner;
import battleField.BattleField;
import battleField.BattleFieldFactory;
import character.monster.Monster;
import character.witcher.Necklace;
import character.witcher.Signal;
import character.witcher.Weapon;
import character.witcher.Witcher;
import character.witcher.WitcherBuilder;

public class Game {
	
	public static void main(String[] args) {
		WitcherBuilder builder = new WitcherBuilder();
	    Scanner scanner = new Scanner(System.in);
	    try {
		    System.out.println("Digite seu nome\n");
		    builder.withName(scanner.nextLine());

		    System.out.println("Qual seu nível?\n1 - Estudante\n2 - Formação\n3 - Alto\n");
		    int level = scanner.nextInt();
		    switch(level) {
			    case 1:
			    	builder.inLeftHand(new Weapon("Shield"));
			    	builder.inRightHand(new Weapon("Sword"));
			    	break;
			    case 2:
			    	builder.inLeftHand(new Weapon("Sword"));
			    	builder.inRightHand(new Weapon("Sword"));
			    	break;
			    case 3:
			    	builder.inLeftHand(new Weapon(""));
			    	builder.inRightHand(new Weapon("Sword"));
			    	break;
		    }   
		    System.out.println("Qual seu colar?\n1 - Regeneração\n2 - Força\n3 - Proteção\n");
		    int necklace = scanner.nextInt();
		    switch(necklace) {
			    case 1:
			    	builder.wearingNecklace(new Necklace("Healing"));
			    	break;
			    case 2:
			    	builder.wearingNecklace(new Necklace("Strenght"));
			    	break;
			    case 3:
			    	builder.wearingNecklace(new Necklace("Protection"));
			    	break;
		    }
		    Witcher witcher = builder.build();
			BattleField battleField = BattleFieldFactory.getBattlerField();
			battleField.setWitcher(witcher);
			battleField.battle();
	    }
	    finally {
	    	scanner.close();
	    }
	}
}
