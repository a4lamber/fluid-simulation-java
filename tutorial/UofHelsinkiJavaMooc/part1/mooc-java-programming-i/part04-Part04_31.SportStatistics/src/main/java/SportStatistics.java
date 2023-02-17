
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static boolean isWin(String[] line, String userTeam) {
        // line: 
        String homeTeam = line[0];
        String awayTeam = line[1];
        int homeScore = Integer.valueOf(line[2]);
        int awayScore = Integer.valueOf(line[3]);
        
        boolean isWinFlag = false;
        
        // home team win cases
        if (homeTeam.equals(userTeam)) {
            if (homeScore > awayScore) {
                isWinFlag = true;
            }
        }
        // away team win cases
        if (awayTeam.equals(userTeam)) {
            if (awayScore > homeScore) {
                isWinFlag = true;
            }
        }
        return isWinFlag;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        // read the filename from user
        String filename = scan.nextLine();
        
        System.out.println("Team:");
        String teamName  =scan.nextLine();
        int gamesCounter = 0;
        int winsCounter = 0;
        int lossesCounter = 0;
        
        
        try (Scanner scanFile = new Scanner(Paths.get(filename))) {
            // pass
            while (scanFile.hasNextLine()) {
                // 还有数据就继续读
                String row = scanFile.nextLine();
                
                String[] pieces = row.split(",");
                // check whether my team is playing
                if (pieces[0].equals(teamName) || pieces[1].equals(teamName)) {
                    gamesCounter += 1;
                    if (isWin(pieces,teamName)) {
                        winsCounter += 1;
                    } else {
                        lossesCounter += 1;
                    }
                }
            }
            
                
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        // end of the loop
        System.out.println("Games: " + gamesCounter);
        System.out.println("Wins: " + winsCounter);
        System.out.println("Losses: " + lossesCounter);
        
        
    }

}
