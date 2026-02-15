import java.util.Scanner;

public class DeckOfCards {

    
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }

        return deck;
    }

    
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));

            
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }

    
    public static String[][] distributeCards(String[] deck, int numOfPlayers, int numOfCardsPerPlayer) {

        if (numOfPlayers * numOfCardsPerPlayer > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return null;
        }

        String[][] players = new String[numOfPlayers][numOfCardsPerPlayer];

        int cardIndex = 0;
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < numOfCardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex];
                cardIndex++;
            }
        }

        return players;
    }

    
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + "'s cards:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
        }
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace"};

       
        String[] deck = initializeDeck(suits, ranks);

        
        deck = shuffleDeck(deck);

       
        System.out.print("Enter number of players: ");
        int numOfPlayers = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int numOfCardsPerPlayer = sc.nextInt();

        
        String[][] players = distributeCards(deck, numOfPlayers, numOfCardsPerPlayer);

        
        if (players != null) {
            printPlayersCards(players);
        }

       
    }
}
