package helpful_classes.Problem9;
public class Student {
    private String firstName;
    private String lastName;
    private double averageGrade;

    public Student(String firstName, String lastName, double averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageGrade = averageGrade;
    }

    public double getScholarship() {
        if (this.averageGrade == 5.0) {
            return 80.0;
        } else {
            return 40.0;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public double getAverageGrade() {
        return averageGrade;
    }
}
