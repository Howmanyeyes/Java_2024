package helpful_classes.Problem15;

import java.util.Map;
public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Double> grades; 

    public Student(String name, String group, int course, Map<String, Double> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public Map<String, Double> getGrades() {
        return grades;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (double grade : grades.values()) {
            sum += grade;
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', group='" + group + "', course=" + course + ", grades=" + grades + '}';
    }
}
