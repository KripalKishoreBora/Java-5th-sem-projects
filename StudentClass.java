/*
Student Class with Average Grade
Create a Student class with name, roll number, and list of marks. Add a method to
calculate the average and grade.
Bonus: Print result with grade (A/B/C/etc.)
*/


import java.util.Arrays;
import java.util.List;
class Student {
    String name;
    int rollNumber;
    List<Integer> marks;
    public Student(String name, int rollNumber, List<Integer> marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public double calculateAverage() {
        int sum = 0;
        for (int mark : marks) sum += mark;
        return (double) sum / marks.size();
    }
    public char getGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 50) return 'C';
        else return 'D';
    } 
    public void printResult() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + getGrade());
    }
}
public class StudentTest {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(85, 90, 78, 88, 76);
        Student s1 = new Student("Rahul", 101, marks);
        s1.printResult();
    }
}
