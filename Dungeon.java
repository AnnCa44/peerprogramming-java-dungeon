import java.util.*;

class Dungeon {

    public static void main(String[] args) {
        
        Random randomGenerator = new Random();
        int nbTreasurer = randomGenerator.nextInt(20);
        List<Treasure> treasures = new ArrayList<>();
        for (int i = 0; i <= nbTreasurer; i++) {
            treasures.add(new Treasure());
        }

        List<Adventurer> adventurers = new ArrayList<>();
        
        // add new adventurers to the list
        Thief thief = new Thief("Dexter");
        Warrior warrior = new Warrior ("Conan");
        Wizard wizard = new Wizard ("Gandalf le Gris");

        adventurers.add(thief);
        adventurers.add(warrior);
        adventurers.add(wizard);

        UserInterface.presentYourself(thief);
        UserInterface.presentYourself(warrior);
        UserInterface.presentYourself(wizard);

        int i = 0;

        if (treasures.size() > 0) {
            while (i < treasures.size()) {
                // the next adventurer opens the treasure
                thief.open(treasures.get(i));
                i++;
                if (i != treasures.size()) {
                    warrior.open(treasures.get(i));
                    i++;
                }
                if (i != treasures.size()) {
                    wizard.open(treasures.get(i));
                    i++;
                }   
            }
        }

        // TODO : order adventurer by gold descending
        for (Adventurer adventurer : adventurers) {
            // TODO : show adventurer gold
            System.out.println(adventurer.getGold());
        }
    }
}
