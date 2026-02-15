import java.util.Scanner;

public class RockPaperScissorsGame {

    
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); 
        switch (choice) {
            case 0: return "Rock";
            case 1: return "Paper";
            default: return "Scissors";
        }
    }

    
    public static String getWinner(String user, String computer) {
        if (user.equalsIgnoreCase(computer)) {
            return "Draw";
        }

        if ((user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
            (user.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
            (user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }
// Method to calculate stats and percentage
    public static String[][] calculateStats(int userWins, int compWins, int draws, int totalGames) {
        String[][] stats = new String[3][3];

        double userPercent = ((double) userWins / totalGames) * 100;
        double compPercent = ((double) compWins / totalGames) * 100;

        stats[0][0] = "User Wins";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format( userPercent);

        stats[1][0] = "Computer Wins";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format(compPercent);

        stats[2][0] = "Draws";
        stats[2][1] = String.valueOf(draws);
        stats[2][2] = "-";

        return stats;
    }

    
    public static void displayResults(String[][] gameResults, String[][] stats, int totalGames) {

        System.out.println("GAME RESULTS");
  
        for (int i = 0; i < totalGames; i++) {
            System.out.printf(
                    stats[i][0],
                    stats[i][1],
                    stats[i][2]);
                   
        }

        System.out.println("STATISTICS");
        

        for (int i = 0; i < stats.length; i++) {
            System.out.printf(
                    stats[i][0],
                    stats[i][1],
                    stats[i][2]);
        }
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int totalGames = sc.nextInt();
        sc.nextLine(); 

        String[][] gameResults = new String[totalGames][4];

        int userWins = 0;
        int compWins = 0;
        int draws = 0;

        for (int i = 0; i < totalGames; i++) {

            System.out.print("Enter choice (Rock/Paper/Scissors): ");
            String userChoice = sc.nextLine();

            String computerChoice = getComputerChoice();
            String winner = getWinner(userChoice, computerChoice);

            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                compWins++;
            } else {
                draws++;
            }

            gameResults[i][0] = "Game " + (i + 1);
            gameResults[i][1] = userChoice;
            gameResults[i][2] = computerChoice;
            gameResults[i][3] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, draws, totalGames);

        displayResults(gameResults, stats, totalGames);

        
    }
}

