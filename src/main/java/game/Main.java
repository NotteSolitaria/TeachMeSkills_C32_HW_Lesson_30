package game;

import game.character.GameCharacter;
import game.factory.CharacterFactory;
import game.factory.LocationFactory;
import game.location.Location;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("Choose your character: archer, warrior, wizard: ");
            String characterChoice = sc.next();

            System.out.println("Choose your location: city, forest, desert: ");
            String locationChoice = sc.next();

            try {
                GameCharacter gameCharacter = CharacterFactory.createCharacter(characterChoice);
                Location location = LocationFactory.createLocation(locationChoice);

                System.out.println(gameCharacter.getDescription() + location.description());

            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
