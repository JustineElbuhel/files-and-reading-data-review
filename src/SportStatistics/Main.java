package SportStatistics;

import java.util.Scanner;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("File:");

        String file = scanner.nextLine();
        try(Scanner reader = new Scanner(Paths.get("src/" + file))){
            System.out.println("Team:");
            String team = scanner.nextLine();

            int games = 0;
            int wins = 0;
            int loses = 0;

            while (reader.hasNextLine()) {
                String[] parts = (reader.nextLine()).split(",");
                int score1 = Integer.valueOf(parts[2]);
                int score2 = Integer.valueOf(parts[3]);

                if (parts[0].equals(team) || parts[1].equals(team)) {
                    games++;
                }

                if (parts[0].equals(team) && score1 > score2) {
                    wins++;
                } else if (parts[0].equals(team) && score1 < score2) {
                    loses++;
                } else if (parts[1].equals(team) && score1 < score2) {
                    wins++;
                } else if (parts[1].equals(team) && score1 > score2) {
                    loses++;
                }
            }

            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Loses: " + loses);
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
