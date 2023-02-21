
import java.util.ArrayList;

public class GradeRegister {
    // attributes
    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;
    
    // constructors
    public GradeRegister() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    //methods:
    // 
    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }

    public double averageOfPoints() {
        // check for emptiness
        if (this.points.isEmpty()) {
            return -1;
        }
        
        double averageOfPoints = 0;
        int counter = 0;
        
        for (Integer point:points) {
            averageOfPoints += point;
            counter += 1;
        }
        return averageOfPoints/counter;
    }
    
    // average 
    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }
        
        double averageOfGrades = 0;
        int counter = 0;
        
        for (Integer grade:grades) {
            averageOfGrades += grade;
            counter += 1;
        }
        
        return averageOfGrades/counter;
    }
    
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

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
}
