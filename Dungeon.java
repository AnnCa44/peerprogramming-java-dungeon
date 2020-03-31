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
        // TODO : add new adventurers to the list

        for (Treasure treasure : treasures) {
            // TODO : the next adventurer opens the treasure
        }

        // TODO : order adventurer by gold descending
        for (Adventurer adventurer : adventurers) {
            // TODO : show adventurer gold
        }
    }
}