/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yixiangzhang
 */
import java.util.Scanner;

public class UserInterface {
    // attributes
    private GradeStatistics gradeStat;
    private Scanner scanner;
    
    // constructor
    public UserInterface(GradeStatistics gradeStat, Scanner scanner) {
        this.gradeStat = gradeStat;
        this.scanner = scanner;
    }
    
    
    // methods
    public void start() {
        this.AskUsers();
    }
    
    public void AskUsers() {
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == -1) {
                break;
            }
            // add it
            this.gradeStat.add(userInput);
            
        }
        // end of loop
        System.out.println("Point average (all): " + this.gradeStat.pointsAverage());
        if (this.gradeStat.passingPointsAverage() == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + this.gradeStat.passingPointsAverage());
        }
        System.out.println("Pass percentage: " + this.gradeStat.passPercentage());
        System.out.println("Grade distribution: ");
        this.gradeStat.printGradeDistribution();
    }
   
}
