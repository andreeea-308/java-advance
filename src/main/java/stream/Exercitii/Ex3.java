package stream.Exercitii;
/*
    Exercise 10: Filtering, Sorting, and Reducing to Single Value
Given a list of student objects, filter out the students who passed the exam, sort them based on their
scores in descending order, and find the average score of the top 10 students.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private int score;
    private boolean passedExam;

    public Student(String name, int score) {
        this.name = name;
        try {
            setScoreIf(score);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if (score >= 5) {
            this.passedExam = true;
        } else {
            this.passedExam = false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isPassedExam() {
        return passedExam;
    }

    public void setPassedExam(boolean passedExam) {
        this.passedExam = passedExam;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", passedExam=" + passedExam +
                '}';
    }

    public void setScoreIf(int grade) {
        if (grade < 0 || grade > 10) {
            throw new IllegalArgumentException("Score must be beetwen 1 to 10: \nTry again!");
        }
        this.score = grade;
    }
}

public class Ex3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(10);
        students.add(new Student("Alice", 6));
        students.add(new Student("Ana", 5));
        students.add(new Student("Bob", 1));
        students.add(new Student("Delia", 10));
        students.add(new Student("Matei", 3));
        students.add(new Student("Adam", 7));
        students.add(new Student("Eve", 4));
        students.add(new Student("George", 5));
        students.add(new Student("Martinica", 8));
        students.add(new Student("Anisia", 9));
        students.add(new Student("Ioana", 2));

        double mediaArit = students.stream()
                .filter(it -> it.isPassedExam())
                .sorted(Comparator.comparingInt(Student::getScore).reversed())
                .peek(System.out::println)
                .mapToDouble(Student::getScore)
                .average().getAsDouble();
        System.out.println("Media aritmetica: " + mediaArit);
    }
}
