package game.factory;

import game.character.GameCharacter;
import game.character.characterImpl.Archer;
import game.character.characterImpl.Warrior;
import game.character.characterImpl.Wizard;

public class CharacterFactory {
    public static GameCharacter createCharacter(String characterName) {
        return switch (characterName.toLowerCase()) {
            case "wizard" -> new Wizard();
            case "warrior"-> new Warrior();
            case "archer"-> new Archer();
            default-> throw new IllegalArgumentException("Unknown character type");
        };
    }
}
