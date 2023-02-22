/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yixiangzhang
 */
import java.util.ArrayList;

public class GradeStatistics {
    // attributes
    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;
    
    // constructors
    public GradeStatistics() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
        
    }
    
    // methods
    public void add(int number) {
        if (number == -1) {
            return;
        } 
        
        // number [0-100]
        if (number >= 0 && number <= 100) {
            this.points.add(number);
            this.grades.add(this.pointsToGrade(number));
        }
    }
    
    public double pointsAverage() {
        double pointsSum = 0;
        for (Integer point:this.points) {
            pointsSum += point;
        }
        return pointsSum/this.points.size();
    }
    
    public double passingPointsAverage() {
        // assuming 50 passing
        double passingPointsSum = 0;
        int passingCounter = 0;
        
        for (Integer point:this.points) {
            if (point >= 50) {
                passingPointsSum += point;
                passingCounter += 1;
            }
        }
        if (passingCounter == 0) {
            return -1;
        }
        
        return passingPointsSum/passingCounter;
    }
    
    
    public double passPercentage() {
        int passingCounter = 0;
        
        for (Integer point:this.points) {
            if (point >= 50) {
                passingCounter += 1;
            }
        }
        return 1.0 * passingCounter/this.points.size() * 100.0;
    }
    
        // conver points to grade
        public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
        }
        
        // display the distributon of the grades
        public void printGradeDistribution() {
            System.out.println("5: " + this.gradeCounterInStar(5));
            System.out.println("4: " + this.gradeCounterInStar(4));
            System.out.println("3: " + this.gradeCounterInStar(3));
            System.out.println("2: " + this.gradeCounterInStar(2));
            System.out.println("1: " + this.gradeCounterInStar(1));
            System.out.println("0: " + this.gradeCounterInStar(0));
        }
        
        public String gradeCounterInStar(int countedGrade) {
            int counter = 0;
            for (Integer grade:this.grades) {
                if (grade == countedGrade) {
                    counter += 1;
                }
            }
            
            String stars = "";
            for (int i =0;i<counter;i++) {
                stars +=  "*";
            }
            
            return stars;
            
        }
}
