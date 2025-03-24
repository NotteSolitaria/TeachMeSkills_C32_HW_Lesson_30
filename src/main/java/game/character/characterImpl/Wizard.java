package game.character.characterImpl;

import game.character.GameCharacter;

public class Wizard implements GameCharacter {
    @Override
    public String getDescription() {
        return "Wizard with a staff is ";
    }
}
