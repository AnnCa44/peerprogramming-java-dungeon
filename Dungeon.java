import java.util.*;

class Dungeon {

    public static void main(String[] args) {
        
        Random randomGenerator = new Random();
        int nbTreasurer = randomGenerator.nextInt(20);
        List<Treasure> treasures = new ArrayList<>();
        for (int i = 0; i < nbTreasurer; i++) {
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

        UserInterface.howManyChest(nbTreasurer);
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        UserInterface.presentYourself(thief);
        UserInterface.presentYourself(warrior);
        UserInterface.presentYourself(wizard);
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        int i = 0;
        boolean openChest = false;

        if (treasures.size() > 0) {
            while (i < treasures.size()) {
                // the next adventurer opens the treasure
                openChest = thief.open(treasures.get(i));
                //openChest ? UserInterface.howMuchMoney(thief, treasures.get(i)) : UserInterface.howMuchMoney(thief, treasures.get(i));
                if (openChest) {
                    UserInterface.howMuchMoney(thief, treasures.get(i));
                } else {
                    UserInterface.tryAgain(thief);
                }
                i++;
                if (i < treasures.size()) {
                    openChest = warrior.open(treasures.get(i));
                    if (openChest) {
                        UserInterface.howMuchMoney(warrior, treasures.get(i));
                    } else {
                        UserInterface.tryAgain(warrior);
                    }
                    i++;
                }
                if (i < treasures.size()) {
                    openChest = wizard.open(treasures.get(i));
                    if (openChest) {
                        UserInterface.howMuchMoney(wizard, treasures.get(i));
                    } else {
                        UserInterface.tryAgain(wizard);
                    }
                    i++;
                }   
            }
        }

        // TODO : order adventurer by gold descending
        for (Adventurer adventurer : adventurers) {
            // TODO : show adventurer gold
            UserInterface.getCurrentGold(adventurer);
        }
    }
}